package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemivudpcomunication_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private packet 			As UDPPacket";
gemivudpcomunication._packet = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket");__ref.setField("_packet",gemivudpcomunication._packet);
 //BA.debugLineNum = 3;BA.debugLine="Private socket 			As UDPSocket";
gemivudpcomunication._socket = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper.UDPSocket");__ref.setField("_socket",gemivudpcomunication._socket);
 //BA.debugLineNum = 4;BA.debugLine="Private broadcastLan 	As String";
gemivudpcomunication._broadcastlan = RemoteObject.createImmutable("");__ref.setField("_broadcastlan",gemivudpcomunication._broadcastlan);
 //BA.debugLineNum = 5;BA.debugLine="Private localPort 		As Int";
gemivudpcomunication._localport = RemoteObject.createImmutable(0);__ref.setField("_localport",gemivudpcomunication._localport);
 //BA.debugLineNum = 6;BA.debugLine="Private remotePort 		As Int";
gemivudpcomunication._remoteport = RemoteObject.createImmutable(0);__ref.setField("_remoteport",gemivudpcomunication._remoteport);
 //BA.debugLineNum = 7;BA.debugLine="Private srvSocket 		As ServerSocket";
gemivudpcomunication._srvsocket = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");__ref.setField("_srvsocket",gemivudpcomunication._srvsocket);
 //BA.debugLineNum = 8;BA.debugLine="Private receivePackSize As Int";
gemivudpcomunication._receivepacksize = RemoteObject.createImmutable(0);__ref.setField("_receivepacksize",gemivudpcomunication._receivepacksize);
 //BA.debugLineNum = 9;BA.debugLine="Private defaultPackSize As Int = 2048";
gemivudpcomunication._defaultpacksize = BA.numberCast(int.class, 2048);__ref.setField("_defaultpacksize",gemivudpcomunication._defaultpacksize);
 //BA.debugLineNum = 10;BA.debugLine="Type ReceivedData (data As String, ip As String)";
;
 //BA.debugLineNum = 11;BA.debugLine="Private messageDatagram As ReceivedData";
gemivudpcomunication._messagedatagram = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivudpcomunication._receiveddata");__ref.setField("_messagedatagram",gemivudpcomunication._messagedatagram);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getbroadcastip(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBroadcastIp (gemivudpcomunication) ","gemivudpcomunication",3,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getbroadcastip")) { return __ref.runUserSub(false, "gemivudpcomunication","getbroadcastip", __ref);}
RemoteObject _devip = RemoteObject.createImmutable("");
RemoteObject _deviparray = null;
 BA.debugLineNum = 55;BA.debugLine="Private Sub getBroadcastIp As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="srvSocket.Initialize(0,\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_srvsocket" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 57;BA.debugLine="Dim devIp As String = srvSocket.GetMyIP";
Debug.ShouldStop(16777216);
_devip = __ref.getField(false,"_srvsocket" /*RemoteObject*/ ).runMethod(true,"GetMyIP");Debug.locals.put("devIp", _devip);Debug.locals.put("devIp", _devip);
 BA.debugLineNum = 58;BA.debugLine="Dim devIpArray() As String";
Debug.ShouldStop(33554432);
_deviparray = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("devIpArray", _deviparray);
 BA.debugLineNum = 59;BA.debugLine="devIpArray = Regex.Split(\"\\.\",devIp)";
Debug.ShouldStop(67108864);
_deviparray = gemivudpcomunication.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_devip));Debug.locals.put("devIpArray", _deviparray);
 BA.debugLineNum = 60;BA.debugLine="devIp = devIpArray(0) & \".\" & devIpArray(1) & \".\"";
Debug.ShouldStop(134217728);
_devip = RemoteObject.concat(_deviparray.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable("."),_deviparray.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("."),_deviparray.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(".255"));Debug.locals.put("devIp", _devip);
 BA.debugLineNum = 61;BA.debugLine="Return devIp";
Debug.ShouldStop(268435456);
if (true) return _devip;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmessagedatagram(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMessageDatagram (gemivudpcomunication) ","gemivudpcomunication",3,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getmessagedatagram")) { return __ref.runUserSub(false, "gemivudpcomunication","getmessagedatagram", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub getMessageDatagram As ReceivedData";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Return messageDatagram";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_messagedatagram" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _locport,RemoteObject _remport,RemoteObject _recpacksize) throws Exception{
try {
		Debug.PushSubsStack("Initialize (gemivudpcomunication) ","gemivudpcomunication",3,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "gemivudpcomunication","initialize", __ref, _ba, _locport, _remport, _recpacksize);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _rpacksize = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("locPort", _locport);
Debug.locals.put("remPort", _remport);
Debug.locals.put("recPackSize", _recpacksize);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(locPort As Int, remPort As I";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="localPort = locPort";
Debug.ShouldStop(32768);
__ref.setField ("_localport" /*RemoteObject*/ ,_locport);
 BA.debugLineNum = 17;BA.debugLine="remotePort= remPort";
Debug.ShouldStop(65536);
__ref.setField ("_remoteport" /*RemoteObject*/ ,_remport);
 BA.debugLineNum = 18;BA.debugLine="broadcastLan = getBroadcastIp";
Debug.ShouldStop(131072);
__ref.setField ("_broadcastlan" /*RemoteObject*/ ,__ref.runClassMethod (b4a.gemiv.app.hub.gemivudpcomunication.class, "_getbroadcastip" /*RemoteObject*/ ));
 BA.debugLineNum = 19;BA.debugLine="Dim rPacksize As Int";
Debug.ShouldStop(262144);
_rpacksize = RemoteObject.createImmutable(0);Debug.locals.put("rPacksize", _rpacksize);
 BA.debugLineNum = 20;BA.debugLine="rPacksize = recPackSize";
Debug.ShouldStop(524288);
_rpacksize = _recpacksize;Debug.locals.put("rPacksize", _rpacksize);
 BA.debugLineNum = 21;BA.debugLine="If rPacksize = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_rpacksize,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 22;BA.debugLine="rPacksize = defaultPackSize";
Debug.ShouldStop(2097152);
_rpacksize = __ref.getField(true,"_defaultpacksize" /*RemoteObject*/ );Debug.locals.put("rPacksize", _rpacksize);
 };
 BA.debugLineNum = 24;BA.debugLine="receivePackSize = rPacksize";
Debug.ShouldStop(8388608);
__ref.setField ("_receivepacksize" /*RemoteObject*/ ,_rpacksize);
 BA.debugLineNum = 25;BA.debugLine="socket.Initialize(\"UDP\",localPort,receivePackSize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_socket" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("UDP")),(Object)(__ref.getField(true,"_localport" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_receivepacksize" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendbroadcastudp(RemoteObject __ref,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("sendBroadcastUdp (gemivudpcomunication) ","gemivudpcomunication",3,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("sendbroadcastudp")) { return __ref.runUserSub(false, "gemivudpcomunication","sendbroadcastudp", __ref, _msg);}
RemoteObject _data = null;
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 28;BA.debugLine="Public Sub sendBroadcastUdp(msg As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
Debug.ShouldStop(268435456);
_data = _msg.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 30;BA.debugLine="packet.Initialize(data,broadcastLan,remotePort)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_packet" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_data),(Object)(__ref.getField(true,"_broadcastlan" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_remoteport" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="socket.Send(packet)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_socket" /*RemoteObject*/ ).runVoidMethod ("Send",(Object)(__ref.getField(false,"_packet" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _senddirectudp(RemoteObject __ref,RemoteObject _msg,RemoteObject _remip,RemoteObject _remport) throws Exception{
try {
		Debug.PushSubsStack("sendDirectUdp (gemivudpcomunication) ","gemivudpcomunication",3,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("senddirectudp")) { return __ref.runUserSub(false, "gemivudpcomunication","senddirectudp", __ref, _msg, _remip, _remport);}
RemoteObject _rport = RemoteObject.createImmutable(0);
RemoteObject _data = null;
Debug.locals.put("msg", _msg);
Debug.locals.put("remIp", _remip);
Debug.locals.put("remPort", _remport);
 BA.debugLineNum = 34;BA.debugLine="Public Sub sendDirectUdp(msg As String,remIp As St";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim rPort As Int = remPort";
Debug.ShouldStop(4);
_rport = _remport;Debug.locals.put("rPort", _rport);Debug.locals.put("rPort", _rport);
 BA.debugLineNum = 36;BA.debugLine="If rPort = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_rport,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 37;BA.debugLine="rPort = remotePort";
Debug.ShouldStop(16);
_rport = __ref.getField(true,"_remoteport" /*RemoteObject*/ );Debug.locals.put("rPort", _rport);
 };
 BA.debugLineNum = 39;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
Debug.ShouldStop(64);
_data = _msg.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 40;BA.debugLine="packet.Initialize(data,remIp,rPort)";
Debug.ShouldStop(128);
__ref.getField(false,"_packet" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_data),(Object)(_remip),(Object)(_rport));
 BA.debugLineNum = 41;BA.debugLine="socket.Send(packet)";
Debug.ShouldStop(256);
__ref.getField(false,"_socket" /*RemoteObject*/ ).runVoidMethod ("Send",(Object)(__ref.getField(false,"_packet" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _udp_packetarrived(RemoteObject __ref,RemoteObject _dg) throws Exception{
try {
		Debug.PushSubsStack("UDP_PacketArrived (gemivudpcomunication) ","gemivudpcomunication",3,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("udp_packetarrived")) { return __ref.runUserSub(false, "gemivudpcomunication","udp_packetarrived", __ref, _dg);}
Debug.locals.put("dg", _dg);
 BA.debugLineNum = 44;BA.debugLine="Public Sub UDP_PacketArrived (dg As UDPPacket)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="messageDatagram.data = BytesToString(dg.Data, dg.";
Debug.ShouldStop(4096);
__ref.getField(false,"_messagedatagram" /*RemoteObject*/ ).setField ("data" /*RemoteObject*/ ,gemivudpcomunication.__c.runMethod(true,"BytesToString",(Object)(_dg.runMethod(false,"getData")),(Object)(_dg.runMethod(true,"getOffset")),(Object)(_dg.runMethod(true,"getLength")),(Object)(RemoteObject.createImmutable("UTF8"))));
 BA.debugLineNum = 46;BA.debugLine="messageDatagram.ip	 = dg.HostAddress";
Debug.ShouldStop(8192);
__ref.getField(false,"_messagedatagram" /*RemoteObject*/ ).setField ("ip" /*RemoteObject*/ ,_dg.runMethod(true,"getHostAddress"));
 BA.debugLineNum = 47;BA.debugLine="Log(\"Data\" & messageDatagram.data)";
Debug.ShouldStop(16384);
gemivudpcomunication.__c.runVoidMethod ("LogImpl","53670019",RemoteObject.concat(RemoteObject.createImmutable("Data"),__ref.getField(false,"_messagedatagram" /*RemoteObject*/ ).getField(true,"data" /*RemoteObject*/ )),0);
 BA.debugLineNum = 48;BA.debugLine="CallSub(Main,\"readUDPPacket\")";
Debug.ShouldStop(32768);
gemivudpcomunication.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((gemivudpcomunication._main.getObject())),(Object)(RemoteObject.createImmutable("readUDPPacket")));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}