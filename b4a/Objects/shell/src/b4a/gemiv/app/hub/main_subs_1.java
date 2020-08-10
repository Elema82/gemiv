package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
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
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"gemivMain\")";
Debug.ShouldStop(256);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("gemivMain")),main.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 43;BA.debugLine="GemivGlobals.runtimeAdmin.CheckAndRequest(GemivG";
Debug.ShouldStop(1024);
parent.mostCurrent._gemivglobals._runtimeadmin /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._gemivglobals._runtimeadmin /*RemoteObject*/ .getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 44;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 45;BA.debugLine="GemivGlobals.voiceRec.Initialize(Null,\"Hable por";
Debug.ShouldStop(4096);
parent.mostCurrent._gemivglobals._voicerec /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.getField(false,"Null"))),(Object)(RemoteObject.createImmutable("Hable por favor")));
 BA.debugLineNum = 46;BA.debugLine="GemivGlobals.udpCom.Initialize(8889,8888,8120)";
Debug.ShouldStop(8192);
parent.mostCurrent._gemivglobals._udpcom /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.numberCast(int.class, 8889)),(Object)(BA.numberCast(int.class, 8888)),(Object)(BA.numberCast(int.class, 8120)));
 BA.debugLineNum = 47;BA.debugLine="GemivGlobals.text2Speech.Initialize";
Debug.ShouldStop(16384);
parent.mostCurrent._gemivglobals._text2speech /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivtts.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 48;BA.debugLine="GemivGlobals.dbManager.Initialize(\"gemiv\",\"gemiv";
Debug.ShouldStop(32768);
parent.mostCurrent._gemivglobals._dbmanager /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("gemiv")),(Object)(RemoteObject.createImmutable("gemivdb.db")));
 BA.debugLineNum = 49;BA.debugLine="GemivGlobals.createFirstTimeDBStructure";
Debug.ShouldStop(65536);
parent.mostCurrent._gemivglobals.runVoidMethod ("_createfirsttimedbstructure" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_pause")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_resume")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("adddevice_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,109);
if (RapidSub.canDelegate("adddevice_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","adddevice_click");}
RemoteObject _qry = RemoteObject.createImmutable("");
 BA.debugLineNum = 109;BA.debugLine="Sub adddevice_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim qry As String = GemivGlobals.qryInsertDevices";
Debug.ShouldStop(8192);
_qry = main.mostCurrent._gemivglobals.runMethod(true,"_qryinsertdevices" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._nombredispositivo.runMethod(true,"getText")),(Object)(BA.ObjectToString("192.168.0.67")),(Object)(BA.ObjectToString("00:00:00:00:00:00")),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 111;BA.debugLine="If GemivGlobals.dbManager.ExecNonQueryStatment(qr";
Debug.ShouldStop(16384);
if (main.mostCurrent._gemivglobals._dbmanager /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_qry)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 112;BA.debugLine="ToastMessageShow (\"Dispositivo Guardado\", True)";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Dispositivo Guardado")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 114;BA.debugLine="ToastMessageShow (\"Error\", True)";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("beginlisten_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
if (RapidSub.canDelegate("beginlisten_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","beginlisten_click");}
 BA.debugLineNum = 97;BA.debugLine="Sub beginlisten_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="GemivGlobals.udpCom.sendDirectUdp(\"BEGINLISTEN\",i";
Debug.ShouldStop(2);
main.mostCurrent._gemivglobals._udpcom /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_senddirectudp" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BEGINLISTEN")),(Object)(main.mostCurrent._ipswitch),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("cleardevices_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,119);
if (RapidSub.canDelegate("cleardevices_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","cleardevices_click");}
RemoteObject _qry = RemoteObject.createImmutable("");
 BA.debugLineNum = 119;BA.debugLine="Sub cleardevices_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim qry As String = GemivGlobals.qryDeleteDevices";
Debug.ShouldStop(8388608);
_qry = main.mostCurrent._gemivglobals.runMethod(true,"_qrydeletedevices" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._nombredispositivo.runMethod(true,"getText")));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 121;BA.debugLine="If GemivGlobals.dbManager.ExecNonQueryStatment(qr";
Debug.ShouldStop(16777216);
if (main.mostCurrent._gemivglobals._dbmanager /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_qry)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 122;BA.debugLine="ToastMessageShow (\"Dispositivo Borrado\", True)";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Dispositivo Borrado")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 124;BA.debugLine="ToastMessageShow (\"Error\", True)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("getcommand_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("getcommand_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","getcommand_click");}
 BA.debugLineNum = 93;BA.debugLine="Sub getcommand_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="GemivGlobals.udpCom.sendBroadcastUdp(\"GETCOMMAND\"";
Debug.ShouldStop(536870912);
main.mostCurrent._gemivglobals._udpcom /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_sendbroadcastudp" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("GETCOMMAND")));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private recText 	As EditText";
main.mostCurrent._rectext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private listen 		As Button";
main.mostCurrent._listen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ip 			As EditText";
main.mostCurrent._ip = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private response 	As EditText";
main.mostCurrent._response = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private mac		 	As EditText";
main.mostCurrent._mac = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private getcommand 	As Button";
main.mostCurrent._getcommand = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private beginlisten As Button";
main.mostCurrent._beginlisten = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private off 		As Button";
main.mostCurrent._off = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private on 			As Button";
main.mostCurrent._on = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ipSwitch 	As String";
main.mostCurrent._ipswitch = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Private adddevice As Button";
main.mostCurrent._adddevice = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private cleardevices As Button";
main.mostCurrent._cleardevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private nombreDispositivo As EditText";
main.mostCurrent._nombredispositivo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listen_click() throws Exception{
try {
		Debug.PushSubsStack("listen_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,87);
if (RapidSub.canDelegate("listen_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","listen_click");}
 BA.debugLineNum = 87;BA.debugLine="Sub listen_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="GemivGlobals.voiceRec.listenSpeech";
Debug.ShouldStop(8388608);
main.mostCurrent._gemivglobals._voicerec /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_listenspeech" /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="procesarMensaje";
Debug.ShouldStop(16777216);
_procesarmensaje();
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("off_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,101);
if (RapidSub.canDelegate("off_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","off_click");}
 BA.debugLineNum = 101;BA.debugLine="Sub off_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="GemivGlobals.udpCom.sendDirectUdp(\"apagar\",ipSwit";
Debug.ShouldStop(32);
main.mostCurrent._gemivglobals._udpcom /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_senddirectudp" /*RemoteObject*/ ,(Object)(BA.ObjectToString("apagar")),(Object)(main.mostCurrent._ipswitch),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("on_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,105);
if (RapidSub.canDelegate("on_click")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","on_click");}
 BA.debugLineNum = 105;BA.debugLine="Sub on_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="GemivGlobals.udpCom.sendDirectUdp(\"prender\",ipSwi";
Debug.ShouldStop(512);
main.mostCurrent._gemivglobals._udpcom /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_senddirectudp" /*RemoteObject*/ ,(Object)(BA.ObjectToString("prender")),(Object)(main.mostCurrent._ipswitch),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _procesarmensaje() throws Exception{
try {
		Debug.PushSubsStack("procesarMensaje (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("procesarmensaje")) { b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","procesarmensaje"); return;}
ResumableSub_procesarMensaje rsub = new ResumableSub_procesarMensaje(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_procesarMensaje extends BA.ResumableSub {
public ResumableSub_procesarMensaje(b4a.gemiv.app.hub.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.gemiv.app.hub.main parent;
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _stts1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _pregunta = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("procesarMensaje (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 62;BA.debugLine="Wait For (GemivGlobals.voiceRec.RecognizeVoice) C";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "procesarmensaje"), parent.mostCurrent._gemivglobals._voicerec /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_recognizevoice" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 63;BA.debugLine="recText.Text = Result";
Debug.ShouldStop(1073741824);
parent.mostCurrent._rectext.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_result));
 BA.debugLineNum = 64;BA.debugLine="Dim sTTS1 As JavaObject = GemivGlobals.text2Speec";
Debug.ShouldStop(-2147483648);
_stts1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_stts1.setObject(parent.mostCurrent._gemivglobals._text2speech /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivtts.class, "_gettexttospeech" /*RemoteObject*/ ).getObject());Debug.locals.put("sTTS1", _stts1);
 BA.debugLineNum = 65;BA.debugLine="Dim pregunta As String = GemivGlobals.getTextToSp";
Debug.ShouldStop(1);
_pregunta = parent.mostCurrent._gemivglobals.runMethod(true,"_gettexttospeech" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_result));Debug.locals.put("pregunta", _pregunta);Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 66;BA.debugLine="Log(pregunta)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1720901",_pregunta,0);
 BA.debugLineNum = 67;BA.debugLine="If Not(pregunta = \"\") Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 10;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_pregunta,RemoteObject.createImmutable(""))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 68;BA.debugLine="GemivGlobals.text2Speech.speak(pregunta,True)";
Debug.ShouldStop(8);
parent.mostCurrent._gemivglobals._text2speech /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivtts.class, "_speak" /*RemoteObject*/ ,(Object)(_pregunta),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 69;BA.debugLine="Do While (sTTS1.RunMethod(\"isSpeaking\", Null))";
Debug.ShouldStop(16);
if (true) break;

case 4:
//do while
this.state = 7;
while (BA.ObjectToBoolean((_stts1.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isSpeaking")),(Object)((parent.mostCurrent.__c.getField(false,"Null")))))).<Boolean>get().booleanValue()) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 BA.debugLineNum = 70;BA.debugLine="Sleep(10)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "procesarmensaje"),BA.numberCast(int.class, 10));
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
 BA.debugLineNum = 72;BA.debugLine="pregunta=\"\"";
Debug.ShouldStop(128);
_pregunta = BA.ObjectToString("");Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 73;BA.debugLine="GemivGlobals.voiceRec.listenSpeech";
Debug.ShouldStop(256);
parent.mostCurrent._gemivglobals._voicerec /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivspeechreconigtion.class, "_listenspeech" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="procesarMensaje";
Debug.ShouldStop(512);
_procesarmensaje();
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 76;BA.debugLine="Log(GemivGlobals.comando)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1720911",parent.mostCurrent._gemivglobals._comando /*RemoteObject*/ ,0);
 BA.debugLineNum = 77;BA.debugLine="Log(GemivGlobals.habitacion)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1720912",parent.mostCurrent._gemivglobals._habitacion /*RemoteObject*/ ,0);
 BA.debugLineNum = 78;BA.debugLine="Log(GemivGlobals.periferico)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1720913",parent.mostCurrent._gemivglobals._periferico /*RemoteObject*/ ,0);
 BA.debugLineNum = 79;BA.debugLine="GemivGlobals.udpCom.sendBroadcastUdp(GemivGlobal";
Debug.ShouldStop(16384);
parent.mostCurrent._gemivglobals._udpcom /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_sendbroadcastudp" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent.mostCurrent._gemivglobals._comando /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("|"),parent.mostCurrent._gemivglobals._habitacion /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("|"),parent.mostCurrent._gemivglobals._periferico /*RemoteObject*/ .runMethod(true,"toLowerCase"))));
 BA.debugLineNum = 80;BA.debugLine="GemivGlobals.text2Speech.speak(\"Comando Ejecutad";
Debug.ShouldStop(32768);
parent.mostCurrent._gemivglobals._text2speech /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivtts.class, "_speak" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Comando Ejecutado: "),parent.mostCurrent._gemivglobals._comando /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable(" "),parent.mostCurrent._gemivglobals._periferico /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable(" de "),parent.mostCurrent._gemivglobals._habitacion /*RemoteObject*/ .runMethod(true,"toLowerCase"))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 81;BA.debugLine="GemivGlobals.comando=\"\"";
Debug.ShouldStop(65536);
parent.mostCurrent._gemivglobals._comando /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 82;BA.debugLine="GemivGlobals.habitacion=\"\"";
Debug.ShouldStop(131072);
parent.mostCurrent._gemivglobals._habitacion /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 83;BA.debugLine="GemivGlobals.periferico=\"\"";
Debug.ShouldStop(262144);
parent.mostCurrent._gemivglobals._periferico /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static void  _complete(RemoteObject _result) throws Exception{
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
gemivglobals_subs_0._process_globals();
starter_subs_0._process_globals();
dbutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.main");
gemivglobals.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivglobals");
gemivdbmanager.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivdbmanager");
gemivspeechreconigtion.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivspeechreconigtion");
gemivtts.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivtts");
gemivudpcomunication.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.gemivudpcomunication");
starter.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.starter");
dbutils.myClass = BA.getDeviceClass ("b4a.gemiv.app.hub.dbutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _udp_packetarrived(RemoteObject _dg) throws Exception{
try {
		Debug.PushSubsStack("UDP_PacketArrived (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,128);
if (RapidSub.canDelegate("udp_packetarrived")) { return b4a.gemiv.app.hub.main.remoteMe.runUserSub(false, "main","udp_packetarrived", _dg);}
RemoteObject _datastring = RemoteObject.createImmutable("");
RemoteObject _ipstring = RemoteObject.createImmutable("");
RemoteObject _dataarray = null;
Debug.locals.put("dg", _dg);
 BA.debugLineNum = 128;BA.debugLine="Public Sub UDP_PacketArrived (dg As UDPPacket)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Dim dataString As String = BytesToString(dg.Data,";
Debug.ShouldStop(1);
_datastring = main.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_dg.runMethod(false,"getData")),(Object)(_dg.runMethod(true,"getOffset")),(Object)(_dg.runMethod(true,"getLength")),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("dataString", _datastring);Debug.locals.put("dataString", _datastring);
 BA.debugLineNum = 130;BA.debugLine="Dim ipString   As String= dg.HostAddress";
Debug.ShouldStop(2);
_ipstring = _dg.runMethod(true,"getHostAddress");Debug.locals.put("ipString", _ipstring);Debug.locals.put("ipString", _ipstring);
 BA.debugLineNum = 131;BA.debugLine="GemivGlobals.udpCom.setMessageDatagram(dataString";
Debug.ShouldStop(4);
main.mostCurrent._gemivglobals._udpcom /*RemoteObject*/ .runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_setmessagedatagram" /*RemoteObject*/ ,(Object)(_datastring),(Object)(_ipstring));
 BA.debugLineNum = 132;BA.debugLine="Log(\"Data\" & dataString)";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("LogImpl","11245188",RemoteObject.concat(RemoteObject.createImmutable("Data"),_datastring),0);
 BA.debugLineNum = 133;BA.debugLine="ipSwitch         	   = ipString";
Debug.ShouldStop(16);
main.mostCurrent._ipswitch = _ipstring;
 BA.debugLineNum = 134;BA.debugLine="Dim dataArray() As String";
Debug.ShouldStop(32);
_dataarray = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("dataArray", _dataarray);
 BA.debugLineNum = 135;BA.debugLine="dataArray = Regex.Split(\"\\: \",dataString)";
Debug.ShouldStop(64);
_dataarray = main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\: ")),(Object)(_datastring));Debug.locals.put("dataArray", _dataarray);
 BA.debugLineNum = 136;BA.debugLine="If dataArray(0)=\"MAC\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_dataarray.getArrayElement(true,BA.numberCast(int.class, 0)),BA.ObjectToString("MAC"))) { 
 BA.debugLineNum = 137;BA.debugLine="mac.Text	 = dataArray(1)";
Debug.ShouldStop(256);
main.mostCurrent._mac.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_dataarray.getArrayElement(true,BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 139;BA.debugLine="If dataArray(0)=\"IP\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_dataarray.getArrayElement(true,BA.numberCast(int.class, 0)),BA.ObjectToString("IP"))) { 
 BA.debugLineNum = 140;BA.debugLine="ip.Text		 = dataArray(1)";
Debug.ShouldStop(2048);
main.mostCurrent._ip.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_dataarray.getArrayElement(true,BA.numberCast(int.class, 1))));
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}