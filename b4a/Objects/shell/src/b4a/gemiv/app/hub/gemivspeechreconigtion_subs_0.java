package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemivspeechreconigtion_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private recognizedText As List";
gemivspeechreconigtion._recognizedtext = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_recognizedtext",gemivspeechreconigtion._recognizedtext);
 //BA.debugLineNum = 3;BA.debugLine="Private recognizedLanguage As String";
gemivspeechreconigtion._recognizedlanguage = RemoteObject.createImmutable("");__ref.setField("_recognizedlanguage",gemivspeechreconigtion._recognizedlanguage);
 //BA.debugLineNum = 4;BA.debugLine="Private recPromptText As String";
gemivspeechreconigtion._recprompttext = RemoteObject.createImmutable("");__ref.setField("_recprompttext",gemivspeechreconigtion._recprompttext);
 //BA.debugLineNum = 5;BA.debugLine="Private VR As VoiceRecognition";
gemivspeechreconigtion._vr = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.VoiceRecognition");__ref.setField("_vr",gemivspeechreconigtion._vr);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getrecognizedtext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRecognizedText (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("getrecognizedtext")) { return __ref.runUserSub(false, "gemivspeechreconigtion","getrecognizedtext", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Public Sub getRecognizedText As List";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Return recognizedText";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_recognizedtext" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreconigzedlanguage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getReconigzedLanguage (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("getreconigzedlanguage")) { return __ref.runUserSub(false, "gemivspeechreconigtion","getreconigzedlanguage", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Public Sub getReconigzedLanguage As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Return recognizedLanguage";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(true,"_recognizedlanguage" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrecprompttext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRecPromptText (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getrecprompttext")) { return __ref.runUserSub(false, "gemivspeechreconigtion","getrecprompttext", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub getRecPromptText As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return recPromptText";
Debug.ShouldStop(16);
if (true) return __ref.getField(true,"_recprompttext" /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _reclang,RemoteObject _recprompt) throws Exception{
try {
		Debug.PushSubsStack("Initialize (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "gemivspeechreconigtion","initialize", __ref, _ba, _reclang, _recprompt);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("recLang", _reclang);
Debug.locals.put("recPrompt", _recprompt);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(recLang As String, recPrompt";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="VR.Initialize(\"VR\")";
Debug.ShouldStop(512);
__ref.getField(false,"_vr" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("VR")));
 BA.debugLineNum = 11;BA.debugLine="recognizedLanguage = recLang";
Debug.ShouldStop(1024);
__ref.setField ("_recognizedlanguage" /*RemoteObject*/ ,_reclang);
 BA.debugLineNum = 12;BA.debugLine="If Not(recLang = Null) Then";
Debug.ShouldStop(2048);
if (gemivspeechreconigtion.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("n",_reclang)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 13;BA.debugLine="VR.Language = \"es\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_vr" /*RemoteObject*/ ).runVoidMethod ("setLanguage",BA.ObjectToString("es"));
 };
 BA.debugLineNum = 15;BA.debugLine="recPromptText = recPrompt";
Debug.ShouldStop(16384);
__ref.setField ("_recprompttext" /*RemoteObject*/ ,_recprompt);
 BA.debugLineNum = 16;BA.debugLine="VR.Prompt = recPrompt";
Debug.ShouldStop(32768);
__ref.getField(false,"_vr" /*RemoteObject*/ ).runVoidMethod ("setPrompt",_recprompt);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listenspeech(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listenSpeech (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("listenspeech")) { return __ref.runUserSub(false, "gemivspeechreconigtion","listenspeech", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Public Sub listenSpeech";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="VR.Listen";
Debug.ShouldStop(524288);
__ref.getField(false,"_vr" /*RemoteObject*/ ).runVoidMethod ("Listen",__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setreconigzedlanguage(RemoteObject __ref,RemoteObject _textlang) throws Exception{
try {
		Debug.PushSubsStack("setReconigzedLanguage (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setreconigzedlanguage")) { return __ref.runUserSub(false, "gemivspeechreconigtion","setreconigzedlanguage", __ref, _textlang);}
Debug.locals.put("textLang", _textlang);
 BA.debugLineNum = 31;BA.debugLine="Public Sub setReconigzedLanguage(textLang As Strin";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="recognizedLanguage = textLang";
Debug.ShouldStop(-2147483648);
__ref.setField ("_recognizedlanguage" /*RemoteObject*/ ,_textlang);
 BA.debugLineNum = 33;BA.debugLine="VR.Language = \"es\"";
Debug.ShouldStop(1);
__ref.getField(false,"_vr" /*RemoteObject*/ ).runVoidMethod ("setLanguage",BA.ObjectToString("es"));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrecpromptext(RemoteObject __ref,RemoteObject _recprompt) throws Exception{
try {
		Debug.PushSubsStack("setRecPrompText (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setrecpromptext")) { return __ref.runUserSub(false, "gemivspeechreconigtion","setrecpromptext", __ref, _recprompt);}
Debug.locals.put("recPrompt", _recprompt);
 BA.debugLineNum = 40;BA.debugLine="Public Sub setRecPrompText(recPrompt As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="recPromptText = recPromptText";
Debug.ShouldStop(256);
__ref.setField ("_recprompttext" /*RemoteObject*/ ,__ref.getField(true,"_recprompttext" /*RemoteObject*/ ));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vr_result(RemoteObject __ref,RemoteObject _success,RemoteObject _texts) throws Exception{
try {
		Debug.PushSubsStack("VR_Result (gemivspeechreconigtion) ","gemivspeechreconigtion",1,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("vr_result")) { return __ref.runUserSub(false, "gemivspeechreconigtion","vr_result", __ref, _success, _texts);}
int _i = 0;
Debug.locals.put("Success", _success);
Debug.locals.put("Texts", _texts);
 BA.debugLineNum = 45;BA.debugLine="Public Sub VR_Result (Success As Boolean, Texts As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="If Success Then";
Debug.ShouldStop(8192);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="recognizedText = Texts";
Debug.ShouldStop(16384);
__ref.setField ("_recognizedtext" /*RemoteObject*/ ,_texts);
 BA.debugLineNum = 48;BA.debugLine="For i = 0 To Texts.Size -1";
Debug.ShouldStop(32768);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_texts.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="Log (Texts.Get(i))";
Debug.ShouldStop(65536);
gemivspeechreconigtion.__c.runVoidMethod ("LogImpl","31310724",BA.ObjectToString(_texts.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 50;BA.debugLine="Log (\" i: \"&i)";
Debug.ShouldStop(131072);
gemivspeechreconigtion.__c.runVoidMethod ("LogImpl","31310725",RemoteObject.concat(RemoteObject.createImmutable(" i: "),RemoteObject.createImmutable(_i)),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 52;BA.debugLine="recognizedText = Texts";
Debug.ShouldStop(524288);
__ref.setField ("_recognizedtext" /*RemoteObject*/ ,_texts);
 BA.debugLineNum = 53;BA.debugLine="CallSub(Main,\"setRecTextField\")";
Debug.ShouldStop(1048576);
gemivspeechreconigtion.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((gemivspeechreconigtion._main.getObject())),(Object)(RemoteObject.createImmutable("setRecTextField")));
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}