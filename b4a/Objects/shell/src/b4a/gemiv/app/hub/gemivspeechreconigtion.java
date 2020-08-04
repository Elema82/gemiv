
package b4a.gemiv.app.hub;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class gemivspeechreconigtion {
    public static RemoteObject myClass;
	public gemivspeechreconigtion() {
	}
    public static PCBA staticBA = new PCBA(null, gemivspeechreconigtion.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _recognizedtext = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _recognizedlanguage = RemoteObject.createImmutable("");
public static RemoteObject _recprompttext = RemoteObject.createImmutable("");
public static RemoteObject _vr = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.VoiceRecognition");
public static b4a.gemiv.app.hub.main _main = null;
public static b4a.gemiv.app.hub.starter _starter = null;
public static b4a.gemiv.app.hub.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"recognizedLanguage",_ref.getField(false, "_recognizedlanguage"),"recognizedText",_ref.getField(false, "_recognizedtext"),"recPromptText",_ref.getField(false, "_recprompttext"),"VR",_ref.getField(false, "_vr")};
}
}