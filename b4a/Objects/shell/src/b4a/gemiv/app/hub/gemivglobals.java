
package b4a.gemiv.app.hub;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class gemivglobals implements IRemote{
	public static gemivglobals mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public gemivglobals() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, gemivglobals.class);
    static {
		mostCurrent = new gemivglobals();
        remoteMe = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivglobals");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("gemivglobals"), "b4a.gemiv.app.hub.gemivglobals");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.gemiv.app.hub.gemivglobals"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static b4a.gemiv.app.hub.main _main = null;
public static b4a.gemiv.app.hub.starter _starter = null;
public static b4a.gemiv.app.hub.dbutils _dbutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"DBUtils",Debug.moduleToString(b4a.gemiv.app.hub.dbutils.class),"Main",Debug.moduleToString(b4a.gemiv.app.hub.main.class),"Starter",Debug.moduleToString(b4a.gemiv.app.hub.starter.class)};
}
}