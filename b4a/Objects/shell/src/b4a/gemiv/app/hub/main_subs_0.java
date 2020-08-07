package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_create")) { b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.gemiv.app.hub.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.gemiv.app.hub.main parent;
RemoteObject _firsttime;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 58;BA.debugLine="Activity.LoadLayout(\"gemivMain\")";
Debug.ShouldStop(33554432);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("gemivMain")),main.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (_firsttime.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 60;BA.debugLine="runtimeAdmin.CheckAndRequest(runtimeAdmin.PERMIS";
Debug.ShouldStop(134217728);
parent._runtimeadmin.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._runtimeadmin.getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 61;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 62;BA.debugLine="voiceRec.Initialize(Null,\"Hable por favor\")";
Debug.ShouldStop(536870912);
parent._voicerec.runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.getField(false,"Null"))),(Object)(RemoteObject.createImmutable("Hable por favor")));
 BA.debugLineNum = 63;BA.debugLine="udpCom.Initialize(8889,8888,8120)";
Debug.ShouldStop(1073741824);
parent._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.numberCast(int.class, 8889)),(Object)(BA.numberCast(int.class, 8888)),(Object)(BA.numberCast(int.class, 8120)));
 BA.debugLineNum = 64;BA.debugLine="TTS1.Initialize(\"TTS1\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._tts1.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("TTS1")));
 BA.debugLineNum = 65;BA.debugLine="dbManager.Initialize(\"gemiv\",\"gemivdb.db\")";
Debug.ShouldStop(1);
parent._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("gemiv")),(Object)(RemoteObject.createImmutable("gemivdb.db")));
 BA.debugLineNum = 66;BA.debugLine="dbManager.logDefaultDirs";
Debug.ShouldStop(2);
parent._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_logdefaultdirs" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("activity_pause")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("activity_resume")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddevice_click() throws Exception{
try {
		Debug.PushSubsStack("adddevice_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,168);
if (RapidSub.canDelegate("adddevice_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","adddevice_click");}
RemoteObject _qry = RemoteObject.createImmutable("");
 BA.debugLineNum = 168;BA.debugLine="Sub adddevice_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="Dim qry As String = GemivGlobals.qryInsertDevices";
Debug.ShouldStop(256);
_qry = main.mostCurrent._gemivglobals.runMethod(true,"_qryinsertdevices" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._nombredispositivo.runMethod(true,"getText")),(Object)(BA.ObjectToString("192.168.0.67")),(Object)(BA.ObjectToString("00:00:00:00:00:00")),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 170;BA.debugLine="If dbManager.ExecNonQueryStatment(qry) Then";
Debug.ShouldStop(512);
if (main._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_qry)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 171;BA.debugLine="ToastMessageShow (\"Dispositivo Guardado\", True)";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Dispositivo Guardado")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 173;BA.debugLine="ToastMessageShow (\"Error\", True)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _beginlisten_click() throws Exception{
try {
		Debug.PushSubsStack("beginlisten_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,156);
if (RapidSub.canDelegate("beginlisten_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","beginlisten_click");}
 BA.debugLineNum = 156;BA.debugLine="Sub beginlisten_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="udpCom.sendDirectUdp(\"BEGINLISTEN\",ipSwitch,0)";
Debug.ShouldStop(268435456);
main._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_senddirectudp" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BEGINLISTEN")),(Object)(main.mostCurrent._ipswitch),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cleardevices_click() throws Exception{
try {
		Debug.PushSubsStack("cleardevices_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,178);
if (RapidSub.canDelegate("cleardevices_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","cleardevices_click");}
RemoteObject _qry = RemoteObject.createImmutable("");
 BA.debugLineNum = 178;BA.debugLine="Sub cleardevices_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Dim qry As String = GemivGlobals.qryDeleteDevices";
Debug.ShouldStop(262144);
_qry = main.mostCurrent._gemivglobals.runMethod(true,"_qrydeletedevices" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._nombredispositivo.runMethod(true,"getText")));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 180;BA.debugLine="If dbManager.ExecNonQueryStatment(qry)  Then";
Debug.ShouldStop(524288);
if (main._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_qry)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 181;BA.debugLine="ToastMessageShow (\"Dispositivo Borrado\", True)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Dispositivo Borrado")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 183;BA.debugLine="ToastMessageShow (\"Error\", True)";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcommand_click() throws Exception{
try {
		Debug.PushSubsStack("getcommand_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,152);
if (RapidSub.canDelegate("getcommand_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","getcommand_click");}
 BA.debugLineNum = 152;BA.debugLine="Sub getcommand_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="udpCom.sendBroadcastUdp(\"GETCOMMAND\")";
Debug.ShouldStop(16777216);
main._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_sendbroadcastudp" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("GETCOMMAND")));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 39;BA.debugLine="Private recText 	As EditText";
main.mostCurrent._rectext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private listen 		As Button";
main.mostCurrent._listen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ip 			As EditText";
main.mostCurrent._ip = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private response 	As EditText";
main.mostCurrent._response = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private mac		 	As EditText";
main.mostCurrent._mac = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private getcommand 	As Button";
main.mostCurrent._getcommand = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private beginlisten As Button";
main.mostCurrent._beginlisten = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private off 		As Button";
main.mostCurrent._off = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private on 			As Button";
main.mostCurrent._on = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private ipSwitch 	As String";
main.mostCurrent._ipswitch = RemoteObject.createImmutable("");
 //BA.debugLineNum = 49;BA.debugLine="Dim TTS1 			As TTS";
main.mostCurrent._tts1 = RemoteObject.createNew ("anywheresoftware.b4a.obejcts.TTS");
 //BA.debugLineNum = 50;BA.debugLine="Private adddevice As Button";
main.mostCurrent._adddevice = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private cleardevices As Button";
main.mostCurrent._cleardevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private nombreDispositivo As EditText";
main.mostCurrent._nombredispositivo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listen_click() throws Exception{
try {
		Debug.PushSubsStack("listen_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,79);
if (RapidSub.canDelegate("listen_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","listen_click");}
 BA.debugLineNum = 79;BA.debugLine="Sub listen_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="voiceRec.listenSpeech";
Debug.ShouldStop(32768);
main._voicerec.runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_listenspeech" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _off_click() throws Exception{
try {
		Debug.PushSubsStack("off_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,160);
if (RapidSub.canDelegate("off_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","off_click");}
 BA.debugLineNum = 160;BA.debugLine="Sub off_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="udpCom.sendDirectUdp(\"apagar\",ipSwitch,0)";
Debug.ShouldStop(1);
main._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_senddirectudp" /*RemoteObject*/ ,(Object)(BA.ObjectToString("apagar")),(Object)(main.mostCurrent._ipswitch),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _on_click() throws Exception{
try {
		Debug.PushSubsStack("on_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,164);
if (RapidSub.canDelegate("on_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","on_click");}
 BA.debugLineNum = 164;BA.debugLine="Sub on_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="udpCom.sendDirectUdp(\"prender\",ipSwitch,0)";
Debug.ShouldStop(16);
main._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_senddirectudp" /*RemoteObject*/ ,(Object)(BA.ObjectToString("prender")),(Object)(main.mostCurrent._ipswitch),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
gemivglobals_subs_0._process_globals();
dbutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.main");
gemivspeechreconigtion.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivspeechreconigtion");
starter.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.starter");
gemivudpcomunication.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivudpcomunication");
gemivdbmanager.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivdbmanager");
gemivglobals.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivglobals");
dbutils.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.dbutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim voiceRec 		As GemivSpeechReconigtion";
main._voicerec = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivspeechreconigtion");
 //BA.debugLineNum = 19;BA.debugLine="Dim udpCom			As GemivUdpComunication";
main._udpcom = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivudpcomunication");
 //BA.debugLineNum = 20;BA.debugLine="Dim dbManager		As GemivDBManager";
main._dbmanager = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivdbmanager");
 //BA.debugLineNum = 21;BA.debugLine="Dim runtimeAdmin	As RuntimePermissions";
main._runtimeadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 22;BA.debugLine="Dim comandos()  	As String";
main._comandos = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 23;BA.debugLine="Dim comando	 		As String";
main._comando = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim habitaciones()  As String";
main._habitaciones = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 25;BA.debugLine="Dim habitacion	 	As String";
main._habitacion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Dim perifericos()  	As String";
main._perifericos = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 27;BA.debugLine="Dim periferico	 	As String";
main._periferico = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="comando				= \"\"";
main._comando = BA.ObjectToString("");
 //BA.debugLineNum = 29;BA.debugLine="comandos 			= Array As String(\"prender\",\"apagar\")";
main._comandos = RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("prender"),RemoteObject.createImmutable("apagar")});
 //BA.debugLineNum = 30;BA.debugLine="habitacion			=\"\"";
main._habitacion = BA.ObjectToString("");
 //BA.debugLineNum = 31;BA.debugLine="habitaciones 		= Array As String(\"baño\",\"dormitor";
main._habitaciones = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("baño"),BA.ObjectToString("dormitorio"),RemoteObject.createImmutable("cocina")});
 //BA.debugLineNum = 32;BA.debugLine="periferico			=\"\"";
main._periferico = BA.ObjectToString("");
 //BA.debugLineNum = 33;BA.debugLine="perifericos 		= Array As String(\"luz\",\"aire\",\"ven";
main._perifericos = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("luz"),BA.ObjectToString("aire"),RemoteObject.createImmutable("ventilador")});
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _readudppacket() throws Exception{
try {
		Debug.PushSubsStack("readUDPPacket (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,137);
if (RapidSub.canDelegate("readudppacket")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","readudppacket");}
RemoteObject _dg = RemoteObject.createImmutable("");
RemoteObject _dataarray = null;
 BA.debugLineNum = 137;BA.debugLine="Sub readUDPPacket";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Dim dg As String = udpCom.getMessageDatagram.data";
Debug.ShouldStop(512);
_dg = main._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_getmessagedatagram" /*RemoteObject*/ ).getField(true,"data" /*RemoteObject*/ );Debug.locals.put("dg", _dg);Debug.locals.put("dg", _dg);
 BA.debugLineNum = 139;BA.debugLine="ipSwitch         = udpCom.getMessageDatagram.ip";
Debug.ShouldStop(1024);
main.mostCurrent._ipswitch = main._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_getmessagedatagram" /*RemoteObject*/ ).getField(true,"ip" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="Dim dataArray() As String";
Debug.ShouldStop(2048);
_dataarray = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("dataArray", _dataarray);
 BA.debugLineNum = 141;BA.debugLine="dataArray = Regex.Split(\"\\: \",dg)";
Debug.ShouldStop(4096);
_dataarray = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\: ")),(Object)(_dg));Debug.locals.put("dataArray", _dataarray);
 BA.debugLineNum = 142;BA.debugLine="If dataArray(0)=\"MAC\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_dataarray.getArrayElement(true,BA.numberCast(int.class, 0)),BA.ObjectToString("MAC"))) { 
 BA.debugLineNum = 143;BA.debugLine="mac.Text	 = dataArray(1)";
Debug.ShouldStop(16384);
main.mostCurrent._mac.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_dataarray.getArrayElement(true,BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 145;BA.debugLine="If dataArray(0)=\"IP\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_dataarray.getArrayElement(true,BA.numberCast(int.class, 0)),BA.ObjectToString("IP"))) { 
 BA.debugLineNum = 146;BA.debugLine="ip.Text		 = dataArray(1)";
Debug.ShouldStop(131072);
main.mostCurrent._ip.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_dataarray.getArrayElement(true,BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setrectextfield() throws Exception{
try {
		Debug.PushSubsStack("setRecTextField (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,83);
if (RapidSub.canDelegate("setrectextfield")) { b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","setrectextfield"); return;}
ResumableSub_setRecTextField rsub = new ResumableSub_setRecTextField(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_setRecTextField extends BA.ResumableSub {
public ResumableSub_setRecTextField(b4a.gemiv.app.hub.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.gemiv.app.hub.main parent;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _texto = RemoteObject.createImmutable("");
RemoteObject _palabras = null;
RemoteObject _pregunta = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int step7;
int limit7;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("setRecTextField (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,83);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 84;BA.debugLine="Dim Result As List = voiceRec.getRecognizedText";
Debug.ShouldStop(524288);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_result = parent._voicerec.runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_getrecognizedtext" /*RemoteObject*/ );Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 85;BA.debugLine="recText.Text = Result.Get(0)";
Debug.ShouldStop(1048576);
parent.mostCurrent._rectext.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 86;BA.debugLine="Dim texto As String = Result.Get(0)";
Debug.ShouldStop(2097152);
_texto = BA.ObjectToString(_result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("texto", _texto);Debug.locals.put("texto", _texto);
 BA.debugLineNum = 87;BA.debugLine="Dim palabras() As String";
Debug.ShouldStop(4194304);
_palabras = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("palabras", _palabras);
 BA.debugLineNum = 88;BA.debugLine="Dim pregunta As String";
Debug.ShouldStop(8388608);
_pregunta = RemoteObject.createImmutable("");Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 90;BA.debugLine="palabras = Regex.Split(\" \",texto)";
Debug.ShouldStop(33554432);
_palabras = parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_texto));Debug.locals.put("palabras", _palabras);
 BA.debugLineNum = 91;BA.debugLine="For i=0 To palabras.Length-1";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//for
this.state = 16;
step7 = 1;
limit7 = RemoteObject.solve(new RemoteObject[] {_palabras.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 92;BA.debugLine="Dim list1 As List";
Debug.ShouldStop(134217728);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list1", _list1);
 BA.debugLineNum = 93;BA.debugLine="list1.Initialize2(comandos)";
Debug.ShouldStop(268435456);
_list1.runVoidMethod ("Initialize2",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent._comandos))));
 BA.debugLineNum = 94;BA.debugLine="Log(list1)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51900555",BA.ObjectToString(_list1),0);
 BA.debugLineNum = 95;BA.debugLine="Log(palabras(i))";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51900556",_palabras.getArrayElement(true,BA.numberCast(int.class, _i)),0);
 BA.debugLineNum = 96;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_list1.runMethod(true,"IndexOf",(Object)((_palabras.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"toLowerCase")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 97;BA.debugLine="comando=palabras(i)";
Debug.ShouldStop(1);
parent._comando = _palabras.getArrayElement(true,BA.numberCast(int.class, _i));
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 99;BA.debugLine="list1.Initialize2(habitaciones)";
Debug.ShouldStop(4);
_list1.runVoidMethod ("Initialize2",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent._habitaciones))));
 BA.debugLineNum = 100;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
Debug.ShouldStop(8);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_list1.runMethod(true,"IndexOf",(Object)((_palabras.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"toLowerCase")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 101;BA.debugLine="habitacion=palabras(i)";
Debug.ShouldStop(16);
parent._habitacion = _palabras.getArrayElement(true,BA.numberCast(int.class, _i));
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 103;BA.debugLine="list1.Initialize2(perifericos)";
Debug.ShouldStop(64);
_list1.runVoidMethod ("Initialize2",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent._perifericos))));
 BA.debugLineNum = 104;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
Debug.ShouldStop(128);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_list1.runMethod(true,"IndexOf",(Object)((_palabras.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"toLowerCase")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 105;BA.debugLine="periferico=palabras(i)";
Debug.ShouldStop(256);
parent._periferico = _palabras.getArrayElement(true,BA.numberCast(int.class, _i));
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 108;BA.debugLine="pregunta=\"¿\"";
Debug.ShouldStop(2048);
_pregunta = BA.ObjectToString("¿");Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 109;BA.debugLine="If comando=\"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",parent._comando,BA.ObjectToString(""))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 110;BA.debugLine="pregunta=pregunta&\"que quiere hacer\"";
Debug.ShouldStop(8192);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable("que quiere hacer"));Debug.locals.put("pregunta", _pregunta);
 if (true) break;
;
 BA.debugLineNum = 112;BA.debugLine="If habitacion=\"\" Then";
Debug.ShouldStop(32768);

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent._habitacion,BA.ObjectToString(""))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 113;BA.debugLine="pregunta=pregunta&\" en cual habitación\"";
Debug.ShouldStop(65536);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable(" en cual habitación"));Debug.locals.put("pregunta", _pregunta);
 if (true) break;
;
 BA.debugLineNum = 115;BA.debugLine="If periferico=\"\" Then";
Debug.ShouldStop(262144);

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",parent._periferico,BA.ObjectToString(""))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 116;BA.debugLine="pregunta=pregunta&\" en cual periférico\"";
Debug.ShouldStop(524288);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable(" en cual periférico"));Debug.locals.put("pregunta", _pregunta);
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 118;BA.debugLine="pregunta=pregunta&\"?\"";
Debug.ShouldStop(2097152);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable("?"));Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 119;BA.debugLine="Log(pregunta)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51900580",_pregunta,0);
 BA.debugLineNum = 120;BA.debugLine="If pregunta.Length>2 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean(">",_pregunta.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 121;BA.debugLine="TTS1.Speak(pregunta, True)";
Debug.ShouldStop(16777216);
parent.mostCurrent._tts1.runVoidMethod ("Speak",(Object)(_pregunta),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 122;BA.debugLine="Sleep(pregunta.Length*90)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setrectextfield"),RemoteObject.solve(new RemoteObject[] {_pregunta.runMethod(true,"length"),RemoteObject.createImmutable(90)}, "*",0, 1));
this.state = 35;
return;
case 35:
//C
this.state = 32;
;
 BA.debugLineNum = 123;BA.debugLine="pregunta=\"\"";
Debug.ShouldStop(67108864);
_pregunta = BA.ObjectToString("");Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 124;BA.debugLine="voiceRec.listenSpeech";
Debug.ShouldStop(134217728);
parent._voicerec.runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_listenspeech" /*RemoteObject*/ );
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 126;BA.debugLine="Log(comando)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51900587",parent._comando,0);
 BA.debugLineNum = 127;BA.debugLine="Log(habitacion)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51900588",parent._habitacion,0);
 BA.debugLineNum = 128;BA.debugLine="Log(periferico)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51900589",parent._periferico,0);
 BA.debugLineNum = 129;BA.debugLine="udpCom.sendBroadcastUdp(comando.ToLowerCase&\"|\"&";
Debug.ShouldStop(1);
parent._udpcom.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_sendbroadcastudp" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent._comando.runMethod(true,"toLowerCase"),RemoteObject.createImmutable("|"),parent._habitacion.runMethod(true,"toLowerCase"),RemoteObject.createImmutable("|"),parent._periferico.runMethod(true,"toLowerCase"))));
 BA.debugLineNum = 130;BA.debugLine="TTS1.Speak(\"Comando Ejecutado: \"&comando.ToLower";
Debug.ShouldStop(2);
parent.mostCurrent._tts1.runVoidMethod ("Speak",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Comando Ejecutado: "),parent._comando.runMethod(true,"toLowerCase"),RemoteObject.createImmutable(" "),parent._periferico.runMethod(true,"toLowerCase"),RemoteObject.createImmutable(" de "),parent._habitacion.runMethod(true,"toLowerCase"))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 131;BA.debugLine="comando=\"\"";
Debug.ShouldStop(4);
parent._comando = BA.ObjectToString("");
 BA.debugLineNum = 132;BA.debugLine="habitacion=\"\"";
Debug.ShouldStop(8);
parent._habitacion = BA.ObjectToString("");
 BA.debugLineNum = 133;BA.debugLine="periferico=\"\"";
Debug.ShouldStop(16);
parent._periferico = BA.ObjectToString("");
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}