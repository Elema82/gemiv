package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemivtts_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private textToSpeech 			As TTS";
gemivtts._texttospeech = RemoteObject.createNew ("anywheresoftware.b4a.obejcts.TTS");__ref.setField("_texttospeech",gemivtts._texttospeech);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gettexttospeech(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextToSpeech (gemivtts) ","gemivtts",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("gettexttospeech")) { return __ref.runUserSub(false, "gemivtts","gettexttospeech", __ref);}
 BA.debugLineNum = 10;BA.debugLine="Public Sub getTextToSpeech As TTS";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return textToSpeech";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_texttospeech" /*RemoteObject*/ );
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (gemivtts) ","gemivtts",4,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "gemivtts","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="textToSpeech.Initialize(\"TTS\")";
Debug.ShouldStop(64);
__ref.getField(false,"_texttospeech" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TTS")));
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _speak(RemoteObject __ref,RemoteObject _text,RemoteObject _clear) throws Exception{
try {
		Debug.PushSubsStack("speak (gemivtts) ","gemivtts",4,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("speak")) { return __ref.runUserSub(false, "gemivtts","speak", __ref, _text, _clear);}
Debug.locals.put("text", _text);
Debug.locals.put("clear", _clear);
 BA.debugLineNum = 14;BA.debugLine="Public Sub speak(text As String,clear As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="textToSpeech.Speak(text,clear)";
Debug.ShouldStop(16384);
__ref.getField(false,"_texttospeech" /*RemoteObject*/ ).runVoidMethod ("Speak",(Object)(_text),(Object)(_clear));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}