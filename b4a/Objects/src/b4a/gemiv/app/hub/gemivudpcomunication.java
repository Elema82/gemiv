package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivudpcomunication extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivudpcomunication");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivudpcomunication __ref,anywheresoftware.b4a.BA _ba,int _locport,int _remport,int _recpacksize) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_locport,_remport,_recpacksize}));}
int _rpacksize = 0;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub Initialize(locPort As Int, remPort As I";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="localPort = locPort";
__ref._localport /*int*/  = _locport;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="remotePort= remPort";
__ref._remoteport /*int*/  = _remport;
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="broadcastLan = getBroadcastIp";
__ref._broadcastlan /*String*/  = __ref._getbroadcastip /*String*/ (null);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="Dim rPacksize As Int";
_rpacksize = 0;
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="rPacksize = recPackSize";
_rpacksize = _recpacksize;
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="If rPacksize = 0 Then";
if (_rpacksize==0) { 
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="rPacksize = defaultPackSize";
_rpacksize = __ref._defaultpacksize /*int*/ ;
 };
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="receivePackSize = rPacksize";
__ref._receivepacksize /*int*/  = _rpacksize;
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="socket.Initialize(\"UDP\",localPort,receivePackSize";
__ref._socket /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket*/ .Initialize(ba,"UDP",__ref._localport /*int*/ ,__ref._receivepacksize /*int*/ );
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="End Sub";
return "";
}
public String  _senddirectudp(b4a.gemiv.app.hub.gemivudpcomunication __ref,String _msg,String _remip,int _remport) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "senddirectudp", false))
	 {return ((String) Debug.delegate(ba, "senddirectudp", new Object[] {_msg,_remip,_remport}));}
int _rport = 0;
byte[] _data = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub sendDirectUdp(msg As String,remIp As St";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim rPort As Int = remPort";
_rport = _remport;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If rPort = 0 Then";
if (_rport==0) { 
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="rPort = remotePort";
_rport = __ref._remoteport /*int*/ ;
 };
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
_data = _msg.getBytes("UTF8");
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="packet.Initialize(data,remIp,rPort)";
__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ .Initialize(_data,_remip,_rport);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="socket.Send(packet)";
__ref._socket /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket*/ .Send(__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ );
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="End Sub";
return "";
}
public String  _sendbroadcastudp(b4a.gemiv.app.hub.gemivudpcomunication __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "sendbroadcastudp", false))
	 {return ((String) Debug.delegate(ba, "sendbroadcastudp", new Object[] {_msg}));}
byte[] _data = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub sendBroadcastUdp(msg As String)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
_data = _msg.getBytes("UTF8");
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="packet.Initialize(data,broadcastLan,remotePort)";
__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ .Initialize(_data,__ref._broadcastlan /*String*/ ,__ref._remoteport /*int*/ );
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="socket.Send(packet)";
__ref._socket /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket*/ .Send(__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ );
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="End Sub";
return "";
}
public b4a.gemiv.app.hub.gemivudpcomunication._receiveddata  _getmessagedatagram(b4a.gemiv.app.hub.gemivudpcomunication __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "getmessagedatagram", false))
	 {return ((b4a.gemiv.app.hub.gemivudpcomunication._receiveddata) Debug.delegate(ba, "getmessagedatagram", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub getMessageDatagram As ReceivedData";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Return messageDatagram";
if (true) return __ref._messagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ ;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.gemiv.app.hub.gemivudpcomunication __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Private packet 			As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Private socket 			As UDPSocket";
_socket = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Private broadcastLan 	As String";
_broadcastlan = "";
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Private localPort 		As Int";
_localport = 0;
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Private remotePort 		As Int";
_remoteport = 0;
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Private srvSocket 		As ServerSocket";
_srvsocket = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Private receivePackSize As Int";
_receivepacksize = 0;
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Private defaultPackSize As Int = 2048";
_defaultpacksize = (int) (2048);
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="Type ReceivedData (data As String, ip As String)";
;
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="Private messageDatagram As ReceivedData";
_messagedatagram = new b4a.gemiv.app.hub.gemivudpcomunication._receiveddata();
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="End Sub";
return "";
}
public String  _getbroadcastip(b4a.gemiv.app.hub.gemivudpcomunication __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "getbroadcastip", false))
	 {return ((String) Debug.delegate(ba, "getbroadcastip", null));}
String _devip = "";
String[] _deviparray = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub getBroadcastIp As String";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="srvSocket.Initialize(0,\"\")";
__ref._srvsocket /*anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper*/ .Initialize(ba,(int) (0),"");
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Dim devIp As String = srvSocket.GetMyIP";
_devip = __ref._srvsocket /*anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper*/ .GetMyIP();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Dim devIpArray() As String";
_deviparray = new String[(int) (0)];
java.util.Arrays.fill(_deviparray,"");
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="devIpArray = Regex.Split(\"\\.\",devIp)";
_deviparray = __c.Regex.Split("\\.",_devip);
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="devIp = devIpArray(0) & \".\" & devIpArray(1) & \".\"";
_devip = _deviparray[(int) (0)]+"."+_deviparray[(int) (1)]+"."+_deviparray[(int) (2)]+".255";
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Return devIp";
if (true) return _devip;
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(b4a.gemiv.app.hub.gemivudpcomunication __ref,anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _dg) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "udp_packetarrived", false))
	 {return ((String) Debug.delegate(ba, "udp_packetarrived", new Object[] {_dg}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub UDP_PacketArrived (dg As UDPPacket)";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="messageDatagram.data = BytesToString(dg.Data, dg.";
__ref._messagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ .data /*String*/  = __c.BytesToString(_dg.getData(),_dg.getOffset(),_dg.getLength(),"UTF8");
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="messageDatagram.ip	 = dg.HostAddress";
__ref._messagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ .ip /*String*/  = _dg.getHostAddress();
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Log(\"Data\" & messageDatagram.data)";
__c.LogImpl("53670019","Data"+__ref._messagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ .data /*String*/ ,0);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="CallSub(Main,\"readUDPPacket\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"readUDPPacket");
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="End Sub";
return "";
}
}