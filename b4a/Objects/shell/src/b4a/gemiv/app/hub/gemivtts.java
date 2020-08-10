
package b4a.gemiv.app.hub;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class gemivtts {
    public static RemoteObject myClass;
	public gemivtts() {
	}
    public static PCBA staticBA = new PCBA(null, gemivtts.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _texttospeech = RemoteObject.declareNull("anywheresoftware.b4a.obejcts.TTS");
public static b4a.gemiv.app.hub.main _main = null;
public static b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public static b4a.gemiv.app.hub.starter _starter = null;
public static b4a.gemiv.app.hub.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"textToSpeech",_ref.getField(false, "_texttospeech")};
}
}