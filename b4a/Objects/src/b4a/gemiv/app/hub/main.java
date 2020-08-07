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
public static b4a.gemiv.app.hub.gemivspeechreconigtion _voicerec = null;
public static b4a.gemiv.app.hub.gemivudpcomunication _udpcom = null;
public static b4a.gemiv.app.hub.gemivdbmanager _dbmanager = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _runtimeadmin = null;
public static String[] _comandos = null;
public static String _comando = "";
public static String[] _habitaciones = null;
public static String _habitacion = "";
public static String[] _perifericos = null;
public static String _periferico = "";
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
public anywheresoftware.b4a.obejcts.TTS _tts1 = null;
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
 //BA.debugLineNum = 131077;BA.debugLine="runtimeAdmin.CheckAndRequest(runtimeAdmin.PERMIS";
parent._runtimeadmin.CheckAndRequest(processBA,parent._runtimeadmin.PERMISSION_WRITE_EXTERNAL_STORAGE);
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
 //BA.debugLineNum = 131079;BA.debugLine="voiceRec.Initialize(Null,\"Hable por favor\")";
parent._voicerec._initialize /*String*/ (null,processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null),"Hable por favor");
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="udpCom.Initialize(8889,8888,8120)";
parent._udpcom._initialize /*String*/ (null,processBA,(int) (8889),(int) (8888),(int) (8120));
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="TTS1.Initialize(\"TTS1\")";
parent.mostCurrent._tts1.Initialize(processBA,"TTS1");
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="dbManager.Initialize(\"gemiv\",\"gemivdb.db\")";
parent._dbmanager._initialize /*String*/ (null,processBA,"gemiv","gemivdb.db");
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="dbManager.logDefaultDirs";
parent._dbmanager._logdefaultdirs /*String*/ (null);
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
public static String  _beginlisten_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "beginlisten_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "beginlisten_click", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub beginlisten_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="udpCom.sendDirectUdp(\"BEGINLISTEN\",ipSwitch,0)";
_udpcom._senddirectudp /*String*/ (null,"BEGINLISTEN",mostCurrent._ipswitch,(int) (0));
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _getcommand_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getcommand_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getcommand_click", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub getcommand_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="udpCom.sendBroadcastUdp(\"GETCOMMAND\")";
_udpcom._sendbroadcastudp /*String*/ (null,"GETCOMMAND");
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _listen_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listen_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listen_click", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub listen_Click";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="voiceRec.listenSpeech";
_voicerec._listenspeech /*String*/ (null);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public static String  _off_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "off_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "off_click", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub off_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="udpCom.sendDirectUdp(\"apagar\",ipSwitch,0)";
_udpcom._senddirectudp /*String*/ (null,"apagar",mostCurrent._ipswitch,(int) (0));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _on_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "on_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "on_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub on_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="udpCom.sendDirectUdp(\"prender\",ipSwitch,0)";
_udpcom._senddirectudp /*String*/ (null,"prender",mostCurrent._ipswitch,(int) (0));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _readudppacket() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "readudppacket", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "readudppacket", null));}
String _dg = "";
String[] _dataarray = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub readUDPPacket";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim dg As String = udpCom.getMessageDatagram.data";
_dg = _udpcom._getmessagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ (null).data /*String*/ ;
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="ipSwitch         = udpCom.getMessageDatagram.ip";
mostCurrent._ipswitch = _udpcom._getmessagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ (null).ip /*String*/ ;
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Dim dataArray() As String";
_dataarray = new String[(int) (0)];
java.util.Arrays.fill(_dataarray,"");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="dataArray = Regex.Split(\"\\: \",dg)";
_dataarray = anywheresoftware.b4a.keywords.Common.Regex.Split("\\: ",_dg);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="If dataArray(0)=\"MAC\" Then";
if ((_dataarray[(int) (0)]).equals("MAC")) { 
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="mac.Text	 = dataArray(1)";
mostCurrent._mac.setText(BA.ObjectToCharSequence(_dataarray[(int) (1)]));
 };
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="If dataArray(0)=\"IP\" Then";
if ((_dataarray[(int) (0)]).equals("IP")) { 
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="ip.Text		 = dataArray(1)";
mostCurrent._ip.setText(BA.ObjectToCharSequence(_dataarray[(int) (1)]));
 };
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="End Sub";
return "";
}
public static void  _setrectextfield() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setrectextfield", false))
	 {Debug.delegate(mostCurrent.activityBA, "setrectextfield", null); return;}
ResumableSub_setRecTextField rsub = new ResumableSub_setRecTextField(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_setRecTextField extends BA.ResumableSub {
public ResumableSub_setRecTextField(b4a.gemiv.app.hub.main parent) {
this.parent = parent;
}
b4a.gemiv.app.hub.main parent;
anywheresoftware.b4a.objects.collections.List _result = null;
String _texto = "";
String[] _palabras = null;
String _pregunta = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.List _list1 = null;
int step7;
int limit7;

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
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim Result As List = voiceRec.getRecognizedText";
_result = new anywheresoftware.b4a.objects.collections.List();
_result = parent._voicerec._getrecognizedtext /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="recText.Text = Result.Get(0)";
parent.mostCurrent._rectext.setText(BA.ObjectToCharSequence(_result.Get((int) (0))));
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Dim texto As String = Result.Get(0)";
_texto = BA.ObjectToString(_result.Get((int) (0)));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim palabras() As String";
_palabras = new String[(int) (0)];
java.util.Arrays.fill(_palabras,"");
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Dim pregunta As String";
_pregunta = "";
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="palabras = Regex.Split(\" \",texto)";
_palabras = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_texto);
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="For i=0 To palabras.Length-1";
if (true) break;

case 1:
//for
this.state = 16;
step7 = 1;
limit7 = (int) (_palabras.length-1);
_i = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 16;
if ((step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7)) this.state = 3;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step7)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="list1.Initialize2(comandos)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(parent._comandos));
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Log(list1)";
anywheresoftware.b4a.keywords.Common.LogImpl("0393227",BA.ObjectToString(_list1),0);
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="Log(palabras(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("0393228",_palabras[_i],0);
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (true) break;

case 4:
//if
this.state = 7;
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="comando=palabras(i)";
parent._comando = _palabras[_i];
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="list1.Initialize2(habitaciones)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(parent._habitaciones));
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (true) break;

case 8:
//if
this.state = 11;
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="habitacion=palabras(i)";
parent._habitacion = _palabras[_i];
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="list1.Initialize2(perifericos)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(parent._perifericos));
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (true) break;

case 12:
//if
this.state = 15;
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="periferico=palabras(i)";
parent._periferico = _palabras[_i];
 if (true) break;

case 15:
//C
this.state = 34;
;
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="pregunta=\"¿\"";
_pregunta = "¿";
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="If comando=\"\" Then";
if (true) break;

case 17:
//if
this.state = 20;
if ((parent._comando).equals("")) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="pregunta=pregunta&\"que quiere hacer\"";
_pregunta = _pregunta+"que quiere hacer";
 if (true) break;
;
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="If habitacion=\"\" Then";

case 20:
//if
this.state = 23;
if ((parent._habitacion).equals("")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=393246;
 //BA.debugLineNum = 393246;BA.debugLine="pregunta=pregunta&\" en cual habitación\"";
_pregunta = _pregunta+" en cual habitación";
 if (true) break;
;
RDebugUtils.currentLine=393248;
 //BA.debugLineNum = 393248;BA.debugLine="If periferico=\"\" Then";

case 23:
//if
this.state = 26;
if ((parent._periferico).equals("")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=393249;
 //BA.debugLineNum = 393249;BA.debugLine="pregunta=pregunta&\" en cual periférico\"";
_pregunta = _pregunta+" en cual periférico";
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=393251;
 //BA.debugLineNum = 393251;BA.debugLine="pregunta=pregunta&\"?\"";
_pregunta = _pregunta+"?";
RDebugUtils.currentLine=393252;
 //BA.debugLineNum = 393252;BA.debugLine="Log(pregunta)";
anywheresoftware.b4a.keywords.Common.LogImpl("0393252",_pregunta,0);
RDebugUtils.currentLine=393253;
 //BA.debugLineNum = 393253;BA.debugLine="If pregunta.Length>2 Then";
if (true) break;

case 27:
//if
this.state = 32;
if (_pregunta.length()>2) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=393254;
 //BA.debugLineNum = 393254;BA.debugLine="TTS1.Speak(pregunta, True)";
parent.mostCurrent._tts1.Speak(_pregunta,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393255;
 //BA.debugLineNum = 393255;BA.debugLine="Sleep(pregunta.Length*90)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setrectextfield"),(int) (_pregunta.length()*90));
this.state = 35;
return;
case 35:
//C
this.state = 32;
;
RDebugUtils.currentLine=393256;
 //BA.debugLineNum = 393256;BA.debugLine="pregunta=\"\"";
_pregunta = "";
RDebugUtils.currentLine=393257;
 //BA.debugLineNum = 393257;BA.debugLine="voiceRec.listenSpeech";
parent._voicerec._listenspeech /*String*/ (null);
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=393259;
 //BA.debugLineNum = 393259;BA.debugLine="Log(comando)";
anywheresoftware.b4a.keywords.Common.LogImpl("0393259",parent._comando,0);
RDebugUtils.currentLine=393260;
 //BA.debugLineNum = 393260;BA.debugLine="Log(habitacion)";
anywheresoftware.b4a.keywords.Common.LogImpl("0393260",parent._habitacion,0);
RDebugUtils.currentLine=393261;
 //BA.debugLineNum = 393261;BA.debugLine="Log(periferico)";
anywheresoftware.b4a.keywords.Common.LogImpl("0393261",parent._periferico,0);
RDebugUtils.currentLine=393262;
 //BA.debugLineNum = 393262;BA.debugLine="udpCom.sendBroadcastUdp(comando.ToLowerCase&\"|\"&";
parent._udpcom._sendbroadcastudp /*String*/ (null,parent._comando.toLowerCase()+"|"+parent._habitacion.toLowerCase()+"|"+parent._periferico.toLowerCase());
RDebugUtils.currentLine=393263;
 //BA.debugLineNum = 393263;BA.debugLine="TTS1.Speak(\"Comando Ejecutado: \"&comando.ToLower";
parent.mostCurrent._tts1.Speak("Comando Ejecutado: "+parent._comando.toLowerCase()+" "+parent._periferico.toLowerCase()+" de "+parent._habitacion.toLowerCase(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393264;
 //BA.debugLineNum = 393264;BA.debugLine="comando=\"\"";
parent._comando = "";
RDebugUtils.currentLine=393265;
 //BA.debugLineNum = 393265;BA.debugLine="habitacion=\"\"";
parent._habitacion = "";
RDebugUtils.currentLine=393266;
 //BA.debugLineNum = 393266;BA.debugLine="periferico=\"\"";
parent._periferico = "";
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=393268;
 //BA.debugLineNum = 393268;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}