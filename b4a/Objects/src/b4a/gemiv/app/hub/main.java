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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.gemiv.app.hub", "b4a.gemiv.app.hub.main");
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



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
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
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
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
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Activity.LoadLayout(\"gemivMain\")";
parent.mostCurrent._activity.LoadLayout("gemivMain",mostCurrent.activityBA);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="If FirstTime Then";
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
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="GemivGlobals.runtimeAdmin.CheckAndRequest(GemivG";
parent.mostCurrent._gemivglobals._runtimeadmin /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._gemivglobals._runtimeadmin /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_WRITE_EXTERNAL_STORAGE);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "activity_create"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="GemivGlobals.voiceRec.Initialize(Null,\"Hable por";
parent.mostCurrent._gemivglobals._voicerec /*b4a.gemiv.app.hub.gemivspeechreconigtion*/ ._initialize /*String*/ (null,processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null),"Hable por favor");
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="GemivGlobals.udpCom.Initialize(8889,8888,8120)";
parent.mostCurrent._gemivglobals._udpcom /*b4a.gemiv.app.hub.gemivudpcomunication*/ ._initialize /*String*/ (null,processBA,(int) (8889),(int) (8888),(int) (8120));
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="GemivGlobals.text2Speech.Initialize";
parent.mostCurrent._gemivglobals._text2speech /*b4a.gemiv.app.hub.gemivtts*/ ._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="GemivGlobals.dbManager.Initialize(\"gemiv\",\"gemiv";
parent.mostCurrent._gemivglobals._dbmanager /*b4a.gemiv.app.hub.gemivdbmanager*/ ._initialize /*String*/ (null,processBA,"gemiv","gemivdb.db");
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="GemivGlobals.createFirstTimeDBStructure";
parent.mostCurrent._gemivglobals._createfirsttimedbstructure /*String*/ (mostCurrent.activityBA);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _adddevice_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "adddevice_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "adddevice_click", null));}
String _qry = "";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub adddevice_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim qry As String = GemivGlobals.qryInsertDevices";
_qry = mostCurrent._gemivglobals._qryinsertdevices /*String*/ (mostCurrent.activityBA,mostCurrent._nombredispositivo.getText(),"192.168.0.67","00:00:00:00:00:00",(int) (1));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If GemivGlobals.dbManager.ExecNonQueryStatment(qr";
if (mostCurrent._gemivglobals._dbmanager /*b4a.gemiv.app.hub.gemivdbmanager*/ ._execnonquerystatment /*boolean*/ (null,_qry)) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="ToastMessageShow (\"Dispositivo Guardado\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Dispositivo Guardado"),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="ToastMessageShow (\"Error\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="End Sub";
return "";
}
public static String  _beginlisten_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "beginlisten_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "beginlisten_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub beginlisten_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="GemivGlobals.udpCom.sendDirectUdp(\"BEGINLISTEN\",i";
mostCurrent._gemivglobals._udpcom /*b4a.gemiv.app.hub.gemivudpcomunication*/ ._senddirectudp /*String*/ (null,"BEGINLISTEN",mostCurrent._ipswitch,(int) (0));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public static String  _cleardevices_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cleardevices_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cleardevices_click", null));}
String _qry = "";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub cleardevices_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim qry As String = GemivGlobals.qryDeleteDevices";
_qry = mostCurrent._gemivglobals._qrydeletedevices /*String*/ (mostCurrent.activityBA,mostCurrent._nombredispositivo.getText());
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If GemivGlobals.dbManager.ExecNonQueryStatment(qr";
if (mostCurrent._gemivglobals._dbmanager /*b4a.gemiv.app.hub.gemivdbmanager*/ ._execnonquerystatment /*boolean*/ (null,_qry)) { 
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="ToastMessageShow (\"Dispositivo Borrado\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Dispositivo Borrado"),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="ToastMessageShow (\"Error\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="End Sub";
return "";
}
public static String  _getcommand_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getcommand_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getcommand_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub getcommand_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="GemivGlobals.udpCom.sendBroadcastUdp(\"GETCOMMAND\"";
mostCurrent._gemivglobals._udpcom /*b4a.gemiv.app.hub.gemivudpcomunication*/ ._sendbroadcastudp /*String*/ (null,"GETCOMMAND");
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public static String  _listen_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listen_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listen_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub listen_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="GemivGlobals.voiceRec.listenSpeech";
mostCurrent._gemivglobals._voicerec /*b4a.gemiv.app.hub.gemivspeechreconigtion*/ ._listenspeech /*String*/ (null);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="procesarMensaje";
_procesarmensaje();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public static void  _procesarmensaje() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "procesarmensaje", false))
	 {Debug.delegate(mostCurrent.activityBA, "procesarmensaje", null); return;}
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
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Wait For (GemivGlobals.voiceRec.RecognizeVoice) C";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "procesarmensaje"), parent.mostCurrent._gemivglobals._voicerec /*b4a.gemiv.app.hub.gemivspeechreconigtion*/ ._recognizevoice /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (String) result[0];
;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="recText.Text = Result";
parent.mostCurrent._rectext.setText(BA.ObjectToCharSequence(_result));
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim sTTS1 As JavaObject = GemivGlobals.text2Speec";
_stts1 = new anywheresoftware.b4j.object.JavaObject();
_stts1.setObject((java.lang.Object)(parent.mostCurrent._gemivglobals._text2speech /*b4a.gemiv.app.hub.gemivtts*/ ._gettexttospeech /*anywheresoftware.b4a.obejcts.TTS*/ (null).getObject()));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim pregunta As String = GemivGlobals.getTextToSp";
_pregunta = parent.mostCurrent._gemivglobals._gettexttospeech /*String*/ (mostCurrent.activityBA,_result);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Log(pregunta)";
anywheresoftware.b4a.keywords.Common.LogImpl("1720901",_pregunta,0);
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="If Not(pregunta = \"\") Then";
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
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="GemivGlobals.text2Speech.speak(pregunta,True)";
parent.mostCurrent._gemivglobals._text2speech /*b4a.gemiv.app.hub.gemivtts*/ ._speak /*String*/ (null,_pregunta,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Do While (sTTS1.RunMethod(\"isSpeaking\", Null))";
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
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Sleep(10)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "procesarmensaje"),(int) (10));
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
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="pregunta=\"\"";
_pregunta = "";
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="GemivGlobals.voiceRec.listenSpeech";
parent.mostCurrent._gemivglobals._voicerec /*b4a.gemiv.app.hub.gemivspeechreconigtion*/ ._listenspeech /*String*/ (null);
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="procesarMensaje";
_procesarmensaje();
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="Log(GemivGlobals.comando)";
anywheresoftware.b4a.keywords.Common.LogImpl("1720911",parent.mostCurrent._gemivglobals._comando /*String*/ ,0);
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="Log(GemivGlobals.habitacion)";
anywheresoftware.b4a.keywords.Common.LogImpl("1720912",parent.mostCurrent._gemivglobals._habitacion /*String*/ ,0);
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="Log(GemivGlobals.periferico)";
anywheresoftware.b4a.keywords.Common.LogImpl("1720913",parent.mostCurrent._gemivglobals._periferico /*String*/ ,0);
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="GemivGlobals.udpCom.sendBroadcastUdp(GemivGlobal";
parent.mostCurrent._gemivglobals._udpcom /*b4a.gemiv.app.hub.gemivudpcomunication*/ ._sendbroadcastudp /*String*/ (null,parent.mostCurrent._gemivglobals._comando /*String*/ .toLowerCase()+"|"+parent.mostCurrent._gemivglobals._habitacion /*String*/ .toLowerCase()+"|"+parent.mostCurrent._gemivglobals._periferico /*String*/ .toLowerCase());
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="GemivGlobals.text2Speech.speak(\"Comando Ejecutad";
parent.mostCurrent._gemivglobals._text2speech /*b4a.gemiv.app.hub.gemivtts*/ ._speak /*String*/ (null,"Comando Ejecutado: "+parent.mostCurrent._gemivglobals._comando /*String*/ .toLowerCase()+" "+parent.mostCurrent._gemivglobals._periferico /*String*/ .toLowerCase()+" de "+parent.mostCurrent._gemivglobals._habitacion /*String*/ .toLowerCase(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="GemivGlobals.comando=\"\"";
parent.mostCurrent._gemivglobals._comando /*String*/  = "";
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="GemivGlobals.habitacion=\"\"";
parent.mostCurrent._gemivglobals._habitacion /*String*/  = "";
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="GemivGlobals.periferico=\"\"";
parent.mostCurrent._gemivglobals._periferico /*String*/  = "";
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _off_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "off_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "off_click", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub off_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="GemivGlobals.udpCom.sendDirectUdp(\"apagar\",ipSwit";
mostCurrent._gemivglobals._udpcom /*b4a.gemiv.app.hub.gemivudpcomunication*/ ._senddirectudp /*String*/ (null,"apagar",mostCurrent._ipswitch,(int) (0));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public static String  _on_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "on_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "on_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub on_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="GemivGlobals.udpCom.sendDirectUdp(\"prender\",ipSwi";
mostCurrent._gemivglobals._udpcom /*b4a.gemiv.app.hub.gemivudpcomunication*/ ._senddirectudp /*String*/ (null,"prender",mostCurrent._ipswitch,(int) (0));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public static String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _dg) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "udp_packetarrived", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "udp_packetarrived", new Object[] {_dg}));}
String _datastring = "";
String _ipstring = "";
String[] _dataarray = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub UDP_PacketArrived (dg As UDPPacket)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim dataString As String = BytesToString(dg.Data,";
_datastring = anywheresoftware.b4a.keywords.Common.BytesToString(_dg.getData(),_dg.getOffset(),_dg.getLength(),"UTF8");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim ipString   As String= dg.HostAddress";
_ipstring = _dg.getHostAddress();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="GemivGlobals.udpCom.setMessageDatagram(dataString";
mostCurrent._gemivglobals._udpcom /*b4a.gemiv.app.hub.gemivudpcomunication*/ ._setmessagedatagram /*String*/ (null,_datastring,_ipstring);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Log(\"Data\" & dataString)";
anywheresoftware.b4a.keywords.Common.LogImpl("11245188","Data"+_datastring,0);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="ipSwitch         	   = ipString";
mostCurrent._ipswitch = _ipstring;
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Dim dataArray() As String";
_dataarray = new String[(int) (0)];
java.util.Arrays.fill(_dataarray,"");
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="dataArray = Regex.Split(\"\\: \",dataString)";
_dataarray = anywheresoftware.b4a.keywords.Common.Regex.Split("\\: ",_datastring);
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="If dataArray(0)=\"MAC\" Then";
if ((_dataarray[(int) (0)]).equals("MAC")) { 
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="mac.Text	 = dataArray(1)";
mostCurrent._mac.setText(BA.ObjectToCharSequence(_dataarray[(int) (1)]));
 };
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="If dataArray(0)=\"IP\" Then";
if ((_dataarray[(int) (0)]).equals("IP")) { 
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="ip.Text		 = dataArray(1)";
mostCurrent._ip.setText(BA.ObjectToCharSequence(_dataarray[(int) (1)]));
 };
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="End Sub";
return "";
}
}