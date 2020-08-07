
package b4a.gemiv.app.hub;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class gemivudpcomunication {
    public static RemoteObject myClass;
	public gemivudpcomunication() {
	}
    public static PCBA staticBA = new PCBA(null, gemivudpcomunication.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _packet = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket");
public static RemoteObject _socket = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper.UDPSocket");
public static RemoteObject _broadcastlan = RemoteObject.createImmutable("");
public static RemoteObject _localport = RemoteObject.createImmutable(0);
public static RemoteObject _remoteport = RemoteObject.createImmutable(0);
public static RemoteObject _srvsocket = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");
public static RemoteObject _receivepacksize = RemoteObject.createImmutable(0);
public static RemoteObject _defaultpacksize = RemoteObject.createImmutable(0);
public static RemoteObject _messagedatagram = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivudpcomunication._receiveddata");
public static b4a.gemiv.app.hub.main _main = null;
public static b4a.gemiv.app.hub.starter _starter = null;
public static b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public static b4a.gemiv.app.hub.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"broadcastLan",_ref.getField(false, "_broadcastlan"),"defaultPackSize",_ref.getField(false, "_defaultpacksize"),"localPort",_ref.getField(false, "_localport"),"messageDatagram",_ref.getField(false, "_messagedatagram"),"packet",_ref.getField(false, "_packet"),"receivePackSize",_ref.getField(false, "_receivepacksize"),"remotePort",_ref.getField(false, "_remoteport"),"socket",_ref.getField(false, "_socket"),"srvSocket",_ref.getField(false, "_srvsocket")};
}
}