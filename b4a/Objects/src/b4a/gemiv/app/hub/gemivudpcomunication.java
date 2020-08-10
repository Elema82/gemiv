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
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivudpcomunication __ref,anywheresoftware.b4a.BA _ba,int _locport,int _remport,int _recpacksize) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_locport,_remport,_recpacksize}));}
int _rpacksize = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Initialize(locPort As Int, remPort As I";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="localPort = locPort";
__ref._localport /*int*/  = _locport;
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="remotePort= remPort";
__ref._remoteport /*int*/  = _remport;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="broadcastLan = getBroadcastIp";
__ref._broadcastlan /*String*/  = __ref._getbroadcastip /*String*/ (null);
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Dim rPacksize As Int";
_rpacksize = 0;
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="rPacksize = recPackSize";
_rpacksize = _recpacksize;
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="If rPacksize = 0 Then";
if (_rpacksize==0) { 
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="rPacksize = defaultPackSize";
_rpacksize = __ref._defaultpacksize /*int*/ ;
 };
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="receivePackSize = rPacksize";
__ref._receivepacksize /*int*/  = _rpacksize;
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="socket.Initialize(\"UDP\",localPort,receivePackSize";
__ref._socket /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket*/ .Initialize(ba,"UDP",__ref._localport /*int*/ ,__ref._receivepacksize /*int*/ );
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="End Sub";
return "";
}
public String  _senddirectudp(b4a.gemiv.app.hub.gemivudpcomunication __ref,String _msg,String _remip,int _remport) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "senddirectudp", false))
	 {return ((String) Debug.delegate(ba, "senddirectudp", new Object[] {_msg,_remip,_remport}));}
int _rport = 0;
byte[] _data = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub sendDirectUdp(msg As String,remIp As St";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim rPort As Int = remPort";
_rport = _remport;
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If rPort = 0 Then";
if (_rport==0) { 
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="rPort = remotePort";
_rport = __ref._remoteport /*int*/ ;
 };
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
_data = _msg.getBytes("UTF8");
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="packet.Initialize(data,remIp,rPort)";
__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ .Initialize(_data,_remip,_rport);
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="socket.Send(packet)";
__ref._socket /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket*/ .Send(__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ );
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="End Sub";
return "";
}
public String  _sendbroadcastudp(b4a.gemiv.app.hub.gemivudpcomunication __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "sendbroadcastudp", false))
	 {return ((String) Debug.delegate(ba, "sendbroadcastudp", new Object[] {_msg}));}
byte[] _data = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub sendBroadcastUdp(msg As String)";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim data() As Byte = msg.GetBytes(\"UTF8\")";
_data = _msg.getBytes("UTF8");
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="packet.Initialize(data,broadcastLan,remotePort)";
__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ .Initialize(_data,__ref._broadcastlan /*String*/ ,__ref._remoteport /*int*/ );
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="socket.Send(packet)";
__ref._socket /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket*/ .Send(__ref._packet /*anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket*/ );
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="End Sub";
return "";
}
public String  _setmessagedatagram(b4a.gemiv.app.hub.gemivudpcomunication __ref,String _data,String _ip) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "setmessagedatagram", false))
	 {return ((String) Debug.delegate(ba, "setmessagedatagram", new Object[] {_data,_ip}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub setMessageDatagram(data As String,ip As";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="messageDatagram.data = data";
__ref._messagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ .data /*String*/  = _data;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="messageDatagram.ip	 = ip";
__ref._messagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ .ip /*String*/  = _ip;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.gemiv.app.hub.gemivudpcomunication __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Private packet 			As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Private socket 			As UDPSocket";
_socket = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Private broadcastLan 	As String";
_broadcastlan = "";
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Private localPort 		As Int";
_localport = 0;
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Private remotePort 		As Int";
_remoteport = 0;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Private srvSocket 		As ServerSocket";
_srvsocket = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Private receivePackSize As Int";
_receivepacksize = 0;
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Private defaultPackSize As Int = 2048";
_defaultpacksize = (int) (2048);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Type ReceivedData (data As String, ip As String)";
;
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="Private messageDatagram As ReceivedData";
_messagedatagram = new b4a.gemiv.app.hub.gemivudpcomunication._receiveddata();
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="End Sub";
return "";
}
public String  _getbroadcastip(b4a.gemiv.app.hub.gemivudpcomunication __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "getbroadcastip", false))
	 {return ((String) Debug.delegate(ba, "getbroadcastip", null));}
String _devip = "";
String[] _deviparray = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub getBroadcastIp As String";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="srvSocket.Initialize(0,\"\")";
__ref._srvsocket /*anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper*/ .Initialize(ba,(int) (0),"");
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim devIp As String = srvSocket.GetMyIP";
_devip = __ref._srvsocket /*anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper*/ .GetMyIP();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Dim devIpArray() As String";
_deviparray = new String[(int) (0)];
java.util.Arrays.fill(_deviparray,"");
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="devIpArray = Regex.Split(\"\\.\",devIp)";
_deviparray = __c.Regex.Split("\\.",_devip);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="devIp = devIpArray(0) & \".\" & devIpArray(1) & \".\"";
_devip = _deviparray[(int) (0)]+"."+_deviparray[(int) (1)]+"."+_deviparray[(int) (2)]+".255";
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="Return devIp";
if (true) return _devip;
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="End Sub";
return "";
}
public b4a.gemiv.app.hub.gemivudpcomunication._receiveddata  _getmessagedatagram(b4a.gemiv.app.hub.gemivudpcomunication __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivudpcomunication";
if (Debug.shouldDelegate(ba, "getmessagedatagram", false))
	 {return ((b4a.gemiv.app.hub.gemivudpcomunication._receiveddata) Debug.delegate(ba, "getmessagedatagram", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub getMessageDatagram As ReceivedData";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Return messageDatagram";
if (true) return __ref._messagedatagram /*b4a.gemiv.app.hub.gemivudpcomunication._receiveddata*/ ;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return null;
}
}