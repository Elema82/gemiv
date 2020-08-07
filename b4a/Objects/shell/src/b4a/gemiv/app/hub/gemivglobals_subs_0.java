package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemivglobals_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _qrydeletedevices(RemoteObject _ba,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("qryDeleteDevices (gemivglobals) ","gemivglobals",5,_ba,gemivglobals.mostCurrent,15);
if (RapidSub.canDelegate("qrydeletedevices")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","qrydeletedevices", _ba, _name);}
RemoteObject _qryheader = RemoteObject.createImmutable("");
RemoteObject _qrybody = RemoteObject.createImmutable("");
;
Debug.locals.put("name", _name);
 BA.debugLineNum = 15;BA.debugLine="Public Sub qryDeleteDevices(name As String) As Str";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Dim qryHeader As String = \" DELETE FROM  gemiv_di";
Debug.ShouldStop(32768);
_qryheader = BA.ObjectToString(" DELETE FROM  gemiv_dispositivos WHERE ");Debug.locals.put("qryHeader", _qryheader);Debug.locals.put("qryHeader", _qryheader);
 BA.debugLineNum = 17;BA.debugLine="Dim qryBody   As String = \" nombre = '\" & name &";
Debug.ShouldStop(65536);
_qrybody = RemoteObject.concat(RemoteObject.createImmutable(" nombre = '"),_name,RemoteObject.createImmutable("'"));Debug.locals.put("qryBody", _qrybody);Debug.locals.put("qryBody", _qrybody);
 BA.debugLineNum = 18;BA.debugLine="Return qryHeader & qryBody";
Debug.ShouldStop(131072);
if (true) return RemoteObject.concat(_qryheader,_qrybody);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _qryinsertdevices(RemoteObject _ba,RemoteObject _name,RemoteObject _ip,RemoteObject _mac,RemoteObject _habitacion_id) throws Exception{
try {
		Debug.PushSubsStack("qryInsertDevices (gemivglobals) ","gemivglobals",5,_ba,gemivglobals.mostCurrent,9);
if (RapidSub.canDelegate("qryinsertdevices")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","qryinsertdevices", _ba, _name, _ip, _mac, _habitacion_id);}
RemoteObject _qryheader = RemoteObject.createImmutable("");
RemoteObject _qrybody = RemoteObject.createImmutable("");
;
Debug.locals.put("name", _name);
Debug.locals.put("ip", _ip);
Debug.locals.put("mac", _mac);
Debug.locals.put("habitacion_id", _habitacion_id);
 BA.debugLineNum = 9;BA.debugLine="Public Sub qryInsertDevices(name As String,ip As S";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim qryHeader As String = \" INSERT INTO gemiv_dis";
Debug.ShouldStop(512);
_qryheader = BA.ObjectToString(" INSERT INTO gemiv_dispositivos (ip,mac,nombre,habitacion_id) ");Debug.locals.put("qryHeader", _qryheader);Debug.locals.put("qryHeader", _qryheader);
 BA.debugLineNum = 11;BA.debugLine="Dim qryBody   As String = \" VALUES ('\"&ip&\"', '\"&";
Debug.ShouldStop(1024);
_qrybody = RemoteObject.concat(RemoteObject.createImmutable(" VALUES ('"),_ip,RemoteObject.createImmutable("', '"),_mac,RemoteObject.createImmutable("', '"),_name,RemoteObject.createImmutable("', "),_habitacion_id,RemoteObject.createImmutable(")"));Debug.locals.put("qryBody", _qrybody);Debug.locals.put("qryBody", _qrybody);
 BA.debugLineNum = 12;BA.debugLine="Return qryHeader & qryBody";
Debug.ShouldStop(2048);
if (true) return RemoteObject.concat(_qryheader,_qrybody);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}