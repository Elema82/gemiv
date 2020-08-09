package b4a.gemiv.app.hub;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.gemiv.app.hub", "b4a.gemiv.app.hub.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.gemiv.app.hub", "b4a.gemiv.app.hub.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.gemiv.app.hub.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.gemiv.app.hub.gemivspeechreconigtion _voicerec = null;
public static b4a.gemiv.app.hub.gemivudpcomunication _udpcom = null;
public static b4a.gemiv.app.hub.gemivdbmanager _dbmanager = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _runtimeadmin = null;
public static b4a.gemiv.app.hub.gemivtts _text2speech = null;
public anywheresoftware.b4a.objects.EditTextWrapper _rectext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ip = null;
public anywheresoftware.b4a.objects.EditTextWrapper _response = null;
public anywheresoftware.b4a.objects.EditTextWrapper _mac = null;
public anywheresoftware.b4a.objects.ButtonWrapper _getcommand = null;
public anywheresoftware.b4a.objects.ButtonWrapper _beginlisten = null;
public anywheresoftware.b4a.objects.ButtonWrapper _off = null;
public anywheresoftware.b4a.objects.ButtonWrapper _on = null;
public static String _ipswitch = "";
public anywheresoftware.b4a.objects.ButtonWrapper _adddevice = null;
public anywheresoftware.b4a.objects.ButtonWrapper _cleardevices = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nombredispositivo = null;
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static void  _activity_create(boolean _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.gemiv.app.hub.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.gemiv.app.hub.main parent;
boolean _firsttime;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 46;BA.debugLine="Activity.LoadLayout(\"gemivMain\")";
parent.mostCurrent._activity.LoadLayout("gemivMain",mostCurrent.activityBA);
 //BA.debugLineNum = 47;BA.debugLine="If FirstTime Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_firsttime) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 48;BA.debugLine="runtimeAdmin.CheckAndRequest(runtimeAdmin.PERMIS";
parent._runtimeadmin.CheckAndRequest(processBA,parent._runtimeadmin.PERMISSION_WRITE_EXTERNAL_STORAGE);
 //BA.debugLineNum = 49;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 50;BA.debugLine="voiceRec.Initialize(Null,\"Hable por favor\")";
parent._voicerec._initialize /*String*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null),"Hable por favor");
 //BA.debugLineNum = 51;BA.debugLine="udpCom.Initialize(8889,8888,8120)";
parent._udpcom._initialize /*String*/ (processBA,(int) (8889),(int) (8888),(int) (8120));
 //BA.debugLineNum = 52;BA.debugLine="text2Speech.Initialize";
parent._text2speech._initialize /*String*/ (processBA);
 //BA.debugLineNum = 53;BA.debugLine="dbManager.Initialize(\"gemiv\",\"gemivdb.db\")";
parent._dbmanager._initialize /*String*/ (processBA,"gemiv","gemivdb.db");
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _adddevice_click() throws Exception{
String _qry = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub adddevice_Click";
 //BA.debugLineNum = 114;BA.debugLine="Dim qry As String = GemivGlobals.qryInsertDevices";
_qry = mostCurrent._gemivglobals._qryinsertdevices /*String*/ (mostCurrent.activityBA,mostCurrent._nombredispositivo.getText(),"192.168.0.67","00:00:00:00:00:00",(int) (1));
 //BA.debugLineNum = 115;BA.debugLine="If dbManager.ExecNonQueryStatment(qry) Then";
if (_dbmanager._execnonquerystatment /*boolean*/ (_qry)) { 
 //BA.debugLineNum = 116;BA.debugLine="ToastMessageShow (\"Dispositivo Guardado\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Dispositivo Guardado"),anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 118;BA.debugLine="ToastMessageShow (\"Error\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _beginlisten_click() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub beginlisten_Click";
 //BA.debugLineNum = 102;BA.debugLine="udpCom.sendDirectUdp(\"BEGINLISTEN\",ipSwitch,0)";
_udpcom._senddirectudp /*String*/ ("BEGINLISTEN",mostCurrent._ipswitch,(int) (0));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _cleardevices_click() throws Exception{
String _qry = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub cleardevices_Click";
 //BA.debugLineNum = 124;BA.debugLine="Dim qry As String = GemivGlobals.qryDeleteDevices";
_qry = mostCurrent._gemivglobals._qrydeletedevices /*String*/ (mostCurrent.activityBA,mostCurrent._nombredispositivo.getText());
 //BA.debugLineNum = 125;BA.debugLine="If dbManager.ExecNonQueryStatment(qry)  Then";
if (_dbmanager._execnonquerystatment /*boolean*/ (_qry)) { 
 //BA.debugLineNum = 126;BA.debugLine="ToastMessageShow (\"Dispositivo Borrado\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Dispositivo Borrado"),anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 128;BA.debugLine="ToastMessageShow (\"Error\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public static String  _getcommand_click() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub getcommand_Click";
 //BA.debugLineNum = 98;BA.debugLine="udpCom.sendBroadcastUdp(\"GETCOMMAND\")";
_udpcom._sendbroadcastudp /*String*/ ("GETCOMMAND");
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Private recText 	As EditText";
mostCurrent._rectext = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private listen 		As Button";
mostCurrent._listen = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private ip 			As EditText";
mostCurrent._ip = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private response 	As EditText";
mostCurrent._response = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private mac		 	As EditText";
mostCurrent._mac = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private getcommand 	As Button";
mostCurrent._getcommand = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private beginlisten As Button";
mostCurrent._beginlisten = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private off 		As Button";
mostCurrent._off = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private on 			As Button";
mostCurrent._on = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private ipSwitch 	As String";
mostCurrent._ipswitch = "";
 //BA.debugLineNum = 38;BA.debugLine="Private adddevice As Button";
mostCurrent._adddevice = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private cleardevices As Button";
mostCurrent._cleardevices = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private nombreDispositivo As EditText";
mostCurrent._nombredispositivo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static String  _listen_click() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub listen_Click";
 //BA.debugLineNum = 92;BA.debugLine="voiceRec.listenSpeech";
_voicerec._listenspeech /*String*/ ();
 //BA.debugLineNum = 93;BA.debugLine="procesarMensaje";
_procesarmensaje();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _off_click() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub off_Click";
 //BA.debugLineNum = 106;BA.debugLine="udpCom.sendDirectUdp(\"apagar\",ipSwitch,0)";
_udpcom._senddirectudp /*String*/ ("apagar",mostCurrent._ipswitch,(int) (0));
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static String  _on_click() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub on_Click";
 //BA.debugLineNum = 110;BA.debugLine="udpCom.sendDirectUdp(\"prender\",ipSwitch,0)";
_udpcom._senddirectudp /*String*/ ("prender",mostCurrent._ipswitch,(int) (0));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public static void  _procesarmensaje() throws Exception{
ResumableSub_procesarMensaje rsub = new ResumableSub_procesarMensaje(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_procesarMensaje extends BA.ResumableSub {
public ResumableSub_procesarMensaje(b4a.gemiv.app.hub.main parent) {
this.parent = parent;
}
b4a.gemiv.app.hub.main parent;
String _result = "";
anywheresoftware.b4j.object.JavaObject _stts1 = null;
String _pregunta = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 66;BA.debugLine="Wait For (voiceRec.RecognizeVoice) Complete (Resu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent._voicerec._recognizevoice /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (String) result[0];
;
 //BA.debugLineNum = 67;BA.debugLine="recText.Text = Result";
parent.mostCurrent._rectext.setText(BA.ObjectToCharSequence(_result));
 //BA.debugLineNum = 68;BA.debugLine="Dim sTTS1 As JavaObject = text2Speech.getTextToSp";
_stts1 = new anywheresoftware.b4j.object.JavaObject();
_stts1.setObject((java.lang.Object)(parent._text2speech._gettexttospeech /*anywheresoftware.b4a.obejcts.TTS*/ ().getObject()));
 //BA.debugLineNum = 69;BA.debugLine="Dim pregunta As String = GemivGlobals.getTextToSp";
_pregunta = parent.mostCurrent._gemivglobals._gettexttospeech /*String*/ (mostCurrent.activityBA,_result);
 //BA.debugLineNum = 70;BA.debugLine="Log(pregunta)";
anywheresoftware.b4a.keywords.Common.LogImpl("7720901",_pregunta,0);
 //BA.debugLineNum = 71;BA.debugLine="If Not(pregunta = \"\") Then";
if (true) break;

case 1:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.Not((_pregunta).equals(""))) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 72;BA.debugLine="text2Speech.speak(pregunta,True)";
parent._text2speech._speak /*String*/ (_pregunta,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 73;BA.debugLine="Do While (sTTS1.RunMethod(\"isSpeaking\", Null))";
if (true) break;

case 4:
//do while
this.state = 7;
while (BA.ObjectToBoolean((_stts1.RunMethod("isSpeaking",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 //BA.debugLineNum = 74;BA.debugLine="Sleep(10)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (10));
this.state = 12;
return;
case 12:
//C
this.state = 4;
;
 if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 76;BA.debugLine="pregunta=\"\"";
_pregunta = "";
 //BA.debugLineNum = 77;BA.debugLine="voiceRec.listenSpeech";
parent._voicerec._listenspeech /*String*/ ();
 //BA.debugLineNum = 78;BA.debugLine="procesarMensaje";
_procesarmensaje();
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 80;BA.debugLine="Log(GemivGlobals.comando)";
anywheresoftware.b4a.keywords.Common.LogImpl("7720911",parent.mostCurrent._gemivglobals._comando /*String*/ ,0);
 //BA.debugLineNum = 81;BA.debugLine="Log(GemivGlobals.habitacion)";
anywheresoftware.b4a.keywords.Common.LogImpl("7720912",parent.mostCurrent._gemivglobals._habitacion /*String*/ ,0);
 //BA.debugLineNum = 82;BA.debugLine="Log(GemivGlobals.periferico)";
anywheresoftware.b4a.keywords.Common.LogImpl("7720913",parent.mostCurrent._gemivglobals._periferico /*String*/ ,0);
 //BA.debugLineNum = 83;BA.debugLine="udpCom.sendBroadcastUdp(GemivGlobals.comando.ToL";
parent._udpcom._sendbroadcastudp /*String*/ (parent.mostCurrent._gemivglobals._comando /*String*/ .toLowerCase()+"|"+parent.mostCurrent._gemivglobals._habitacion /*String*/ .toLowerCase()+"|"+parent.mostCurrent._gemivglobals._periferico /*String*/ .toLowerCase());
 //BA.debugLineNum = 84;BA.debugLine="text2Speech.speak(\"Comando Ejecutado: \"&GemivGlo";
parent._text2speech._speak /*String*/ ("Comando Ejecutado: "+parent.mostCurrent._gemivglobals._comando /*String*/ .toLowerCase()+" "+parent.mostCurrent._gemivglobals._periferico /*String*/ .toLowerCase()+" de "+parent.mostCurrent._gemivglobals._habitacion /*String*/ .toLowerCase(),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 85;BA.debugLine="GemivGlobals.comando=\"\"";
parent.mostCurrent._gemivglobals._comando /*String*/  = "";
 //BA.debugLineNum = 86;BA.debugLine="GemivGlobals.habitacion=\"\"";
parent.mostCurrent._gemivglobals._habitacion /*String*/  = "";
 //BA.debugLineNum = 87;BA.debugLine="GemivGlobals.periferico=\"\"";
parent.mostCurrent._gemivglobals._periferico /*String*/  = "";
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(String _result) throws Exception{
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
gemivglobals._process_globals();
starter._process_globals();
dbutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim voiceRec 		As GemivSpeechReconigtion";
_voicerec = new b4a.gemiv.app.hub.gemivspeechreconigtion();
 //BA.debugLineNum = 19;BA.debugLine="Dim udpCom			As GemivUdpComunication";
_udpcom = new b4a.gemiv.app.hub.gemivudpcomunication();
 //BA.debugLineNum = 20;BA.debugLine="Dim dbManager		As GemivDBManager";
_dbmanager = new b4a.gemiv.app.hub.gemivdbmanager();
 //BA.debugLineNum = 21;BA.debugLine="Dim runtimeAdmin	As RuntimePermissions";
_runtimeadmin = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 22;BA.debugLine="Dim text2Speech		As GemivTTS";
_text2speech = new b4a.gemiv.app.hub.gemivtts();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _dg) throws Exception{
String _datastring = "";
String _ipstring = "";
String[] _dataarray = null;
 //BA.debugLineNum = 132;BA.debugLine="Public Sub UDP_PacketArrived (dg As UDPPacket)";
 //BA.debugLineNum = 133;BA.debugLine="Dim dataString As String = BytesToString(dg.Data,";
_datastring = anywheresoftware.b4a.keywords.Common.BytesToString(_dg.getData(),_dg.getOffset(),_dg.getLength(),"UTF8");
 //BA.debugLineNum = 134;BA.debugLine="Dim ipString   As String= dg.HostAddress";
_ipstring = _dg.getHostAddress();
 //BA.debugLineNum = 135;BA.debugLine="udpCom.setMessageDatagram(dataString,ipString)";
_udpcom._setmessagedatagram /*String*/ (_datastring,_ipstring);
 //BA.debugLineNum = 136;BA.debugLine="Log(\"Data\" & dataString)";
anywheresoftware.b4a.keywords.Common.LogImpl("71245188","Data"+_datastring,0);
 //BA.debugLineNum = 137;BA.debugLine="ipSwitch         	   = ipString";
mostCurrent._ipswitch = _ipstring;
 //BA.debugLineNum = 138;BA.debugLine="Dim dataArray() As String";
_dataarray = new String[(int) (0)];
java.util.Arrays.fill(_dataarray,"");
 //BA.debugLineNum = 139;BA.debugLine="dataArray = Regex.Split(\"\\: \",dataString)";
_dataarray = anywheresoftware.b4a.keywords.Common.Regex.Split("\\: ",_datastring);
 //BA.debugLineNum = 140;BA.debugLine="If dataArray(0)=\"MAC\" Then";
if ((_dataarray[(int) (0)]).equals("MAC")) { 
 //BA.debugLineNum = 141;BA.debugLine="mac.Text	 = dataArray(1)";
mostCurrent._mac.setText(BA.ObjectToCharSequence(_dataarray[(int) (1)]));
 };
 //BA.debugLineNum = 143;BA.debugLine="If dataArray(0)=\"IP\" Then";
if ((_dataarray[(int) (0)]).equals("IP")) { 
 //BA.debugLineNum = 144;BA.debugLine="ip.Text		 = dataArray(1)";
mostCurrent._ip.setText(BA.ObjectToCharSequence(_dataarray[(int) (1)]));
 };
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
}
