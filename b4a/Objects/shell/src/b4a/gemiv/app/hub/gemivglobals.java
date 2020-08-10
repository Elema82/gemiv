
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
public static RemoteObject _voicerec = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivspeechreconigtion");
public static RemoteObject _udpcom = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivudpcomunication");
public static RemoteObject _dbmanager = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivdbmanager");
public static RemoteObject _runtimeadmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _text2speech = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivtts");
public static RemoteObject _comandos = null;
public static RemoteObject _comando = RemoteObject.createImmutable("");
public static RemoteObject _habitaciones = null;
public static RemoteObject _habitacion = RemoteObject.createImmutable("");
public static RemoteObject _perifericos = null;
public static RemoteObject _periferico = RemoteObject.createImmutable("");
public static b4a.gemiv.app.hub.main _main = null;
public static b4a.gemiv.app.hub.starter _starter = null;
public static b4a.gemiv.app.hub.dbutils _dbutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"comando",gemivglobals._comando,"comandos",gemivglobals._comandos,"dbManager",gemivglobals._dbmanager,"DBUtils",Debug.moduleToString(b4a.gemiv.app.hub.dbutils.class),"habitacion",gemivglobals._habitacion,"habitaciones",gemivglobals._habitaciones,"Main",Debug.moduleToString(b4a.gemiv.app.hub.main.class),"periferico",gemivglobals._periferico,"perifericos",gemivglobals._perifericos,"runtimeAdmin",gemivglobals._runtimeadmin,"Starter",Debug.moduleToString(b4a.gemiv.app.hub.starter.class),"text2Speech",gemivglobals._text2speech,"udpCom",gemivglobals._udpcom,"voiceRec",gemivglobals._voicerec};
}
}