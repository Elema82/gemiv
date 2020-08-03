package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivudpcomunication extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivudpcomunication");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.gemiv.app.hub.gemivudpcomunication.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _socket = null;
public String _broadcastlan = "";
public int _localport = 0;
public int _remoteport = 0;
public anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _srvsocket = null;
public int _receivepacksize = 0;
public int _defaultpacksize = 0;
public b4a.gemiv.app.hub.gemivudpcomunication._receiveddata _messagedatagram = null;
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.starter _starter = null;
public static class _receiveddata{
public boolean IsInitialized;
public String data;
public String ip;
public void Initialize() {
IsInitialized = true;
data = "";
ip = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private packet 			As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 3;BA.debugLine="Private socket 			As UDPSocket";
_socket = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 4;BA.debugLine="Private broadcastLan 	As String";
_broadcastlan = "";
 //BA.debugLineNum = 5;BA.debugLine="Private localPort 		As Int";
_localport = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private remotePort 		As Int";
_remoteport = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private srvSocket 		As ServerSocket";
_srvsocket = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private receivePackSize As Int";
_receivepacksize = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private defaultPackSize As Int = 2048";
_defaultpacksize = (int) (2048);
 //BA.debugLineNum = 10;BA.debugLine="Type ReceivedData (data As String, ip As String)";
;
 //BA.debugLineNum = 11;BA.debugLine="Private messageDatagram As ReceivedData";
_messagedatagram = new b4a.gemiv.app.hub.gemivudpcomunication._receiveddata();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _getbroadcastip() throws Exception{
String _devip = "";
String[] _deviparray = null;
 //BA.debugLineNum = 55;BA.debugLine="Private Sub getBroadcastIp As String";
 //BA.debugLineNum = 56;BA.debugLine="srvSocket.Initialize(0,\"\")";
_srvsocket.Initialize(ba,(int) (0),"");
 //BA.debugLineNum = 57;BA.debugLine="Dim devIp As String = srvSocket.GetMyIP";
_devip = _srvsocket.GetMyIP();
 //BA.debugLineNum = 58;BA.debugLine="Dim devIpArray() As String";
_deviparray = new String[(int) (0)];
java.util.Arrays.fill(_deviparray,"");
 //BA.debugLineNum = 59;BA.debugLine="devIpArray = Regex.Split(\"\\.\",devIp)";
_deviparray = __c.Regex.Split("\\.",_devip);
 //BA.debugLineNum = 60;BA.debugLine="devIp = devIpArray(0) & \".\" & devIpArray(1) & \".\"";
_devip = _deviparray[(int) (0)]+"."+_deviparray[(int) (1)]+"."+_deviparray[(int) (2)]+".255";
 //BA.debugLineNum = 61;BA.debugLine="Return devIp";
if (true) return _devip;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4a.gemiv.app.hub.gemivudpcomunication._receiveddata  _getmessagedatagram() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub getMessageDatagram As ReceivedData";
 //BA.debugLineNum = 52;BA.debugLine="Return messageDatagram";
if (true) return _messagedatagram;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,int _locport,int _remport,int _recpacksize) throws Exception{
innerInitialize(_ba);
int _rpacksize = 0;
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(locPort As Int, remPort As I";
 //BA.debugLineNum = 16;BA.debugLine="localPort = locPort";
_localport = _locport;
 //BA.debugLineNum = 17;BA.debugLine="remotePort= remPort";
_remoteport = _remport;
 //BA.debugLineNum = 18;BA.debugLine="broadcastLan = getBroadcastIp";
_broadcastlan = _getbroadcastip();
 //BA.debugLineNum = 19;BA.debugLine="Dim rPacksize As Int";
_rpacksize = 0;
 //BA.debugLineNum = 20;BA.debugLine="rPacksize = recPackSize";
_rpacksize = _recpacksize;
 //BA.debugLineNum = 21;BA.debugLine="If rPacksize = 0 Then";
if (_rpacksize==0) { 
 //BA.debugLineNum = 22;BA.debugLine="rPacksize = defaultPackSize";
_rpacksize = _defaultpacksize;
 };
 //BA.debugLineNum = 24;BA.debugLine="receivePackSize = rPacksize";
_receivepacksize = _rpacksize;
 //BA.debugLineNum = 25;BA.debugLine="socket.Initialize(\"UDP\",localPort,receivePackSize";
_socket.Initialize(ba,"UDP",_localport,_receivepacksize);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _sendbroadcastudp(String _msg) throws Exception{
byte[] _data = null;
 //BA.debugLineNum = 28;BA.debugLine="Public Sub sendBroadcastUdp(msg As String)";
 //BA.debugLineNum = 29;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
_data = _msg.getBytes("UTF8");
 //BA.debugLineNum = 30;BA.debugLine="packet.Initialize(data,broadcastLan,remotePort)";
_packet.Initialize(_data,_broadcastlan,_remoteport);
 //BA.debugLineNum = 31;BA.debugLine="socket.Send(packet)";
_socket.Send(_packet);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _senddirectudp(String _msg,String _remip,int _remport) throws Exception{
int _rport = 0;
byte[] _data = null;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub sendDirectUdp(msg As String,remIp As St";
 //BA.debugLineNum = 35;BA.debugLine="Dim rPort As Int = remPort";
_rport = _remport;
 //BA.debugLineNum = 36;BA.debugLine="If rPort = 0 Then";
if (_rport==0) { 
 //BA.debugLineNum = 37;BA.debugLine="rPort = remotePort";
_rport = _remoteport;
 };
 //BA.debugLineNum = 39;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
_data = _msg.getBytes("UTF8");
 //BA.debugLineNum = 40;BA.debugLine="packet.Initialize(data,remIp,rPort)";
_packet.Initialize(_data,_remip,_rport);
 //BA.debugLineNum = 41;BA.debugLine="socket.Send(packet)";
_socket.Send(_packet);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _dg) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub UDP_PacketArrived (dg As UDPPacket)";
 //BA.debugLineNum = 45;BA.debugLine="messageDatagram.data = BytesToString(dg.Data, dg.";
_messagedatagram.data /*String*/  = __c.BytesToString(_dg.getData(),_dg.getOffset(),_dg.getLength(),"UTF8");
 //BA.debugLineNum = 46;BA.debugLine="messageDatagram.ip	 = dg.HostAddress";
_messagedatagram.ip /*String*/  = _dg.getHostAddress();
 //BA.debugLineNum = 47;BA.debugLine="Log(\"Data\" & messageDatagram.data)";
__c.LogImpl("82031619","Data"+_messagedatagram.data /*String*/ ,0);
 //BA.debugLineNum = 48;BA.debugLine="CallSub(Main,\"readUDPPacket\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"readUDPPacket");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
