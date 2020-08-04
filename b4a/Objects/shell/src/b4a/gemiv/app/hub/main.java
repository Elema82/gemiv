
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.gemiv.app.hub.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _voicerec = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivspeechreconigtion");
public static RemoteObject _udpcom = RemoteObject.declareNull("b4a.gemiv.app.hub.gemivudpcomunication");
public static RemoteObject _runtimeadmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _comandos = null;
public static RemoteObject _comando = RemoteObject.createImmutable("");
public static RemoteObject _habitaciones = null;
public static RemoteObject _habitacion = RemoteObject.createImmutable("");
public static RemoteObject _perifericos = null;
public static RemoteObject _periferico = RemoteObject.createImmutable("");
public static RemoteObject _rectext = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _listen = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _ip = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _mac = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _getcommand = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _beginlisten = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _off = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _on = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _ipswitch = RemoteObject.createImmutable("");
public static RemoteObject _tts1 = RemoteObject.declareNull("anywheresoftware.b4a.obejcts.TTS");
public static b4a.gemiv.app.hub.starter _starter = null;
public static b4a.gemiv.app.hub.dbutils _dbutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"beginlisten",main.mostCurrent._beginlisten,"comando",main._comando,"comandos",main._comandos,"DBUtils",Debug.moduleToString(b4a.gemiv.app.hub.dbutils.class),"getcommand",main.mostCurrent._getcommand,"habitacion",main._habitacion,"habitaciones",main._habitaciones,"ip",main.mostCurrent._ip,"ipSwitch",main.mostCurrent._ipswitch,"listen",main.mostCurrent._listen,"mac",main.mostCurrent._mac,"off",main.mostCurrent._off,"on",main.mostCurrent._on,"periferico",main._periferico,"perifericos",main._perifericos,"recText",main.mostCurrent._rectext,"response",main.mostCurrent._response,"runtimeAdmin",main._runtimeadmin,"Starter",Debug.moduleToString(b4a.gemiv.app.hub.starter.class),"TTS1",main.mostCurrent._tts1,"udpCom",main._udpcom,"voiceRec",main._voicerec};
}
}