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
		Debug.PushSubsStack("getRecognizedText (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("getrecognizedtext")) { return __ref.runUserSub(false, "gemivspeechreconigtion","getrecognizedtext", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Public Sub getRecognizedText As List";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Return recognizedText";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_recognizedtext" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("getReconigzedLanguage (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("getreconigzedlanguage")) { return __ref.runUserSub(false, "gemivspeechreconigtion","getreconigzedlanguage", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub getReconigzedLanguage As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return recognizedLanguage";
Debug.ShouldStop(8);
if (true) return __ref.getField(true,"_recognizedlanguage" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("getRecPromptText (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("getrecprompttext")) { return __ref.runUserSub(false, "gemivspeechreconigtion","getrecprompttext", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Public Sub getRecPromptText As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return recPromptText";
Debug.ShouldStop(4096);
if (true) return __ref.getField(true,"_recprompttext" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,9);
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
		Debug.PushSubsStack("listenSpeech (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("listenspeech")) { return __ref.runUserSub(false, "gemivspeechreconigtion","listenspeech", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Public Sub listenSpeech";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="VR.Listen";
Debug.ShouldStop(134217728);
__ref.getField(false,"_vr" /*RemoteObject*/ ).runVoidMethod ("Listen",__ref.getField(false, "ba"));
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
public static RemoteObject  _recognizevoice(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RecognizeVoice (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("recognizevoice")) { return __ref.runUserSub(false, "gemivspeechreconigtion","recognizevoice", __ref);}
ResumableSub_RecognizeVoice rsub = new ResumableSub_RecognizeVoice(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RecognizeVoice extends BA.ResumableSub {
public ResumableSub_RecognizeVoice(b4a.gemiv.app.hub.gemivspeechreconigtion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.gemiv.app.hub.gemivspeechreconigtion parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _texts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RecognizeVoice (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,19);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 20;BA.debugLine="Wait For VR_Result (Success As Boolean, Texts As";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","vr_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "gemivspeechreconigtion", "recognizevoice"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_texts = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Texts", _texts);
;
 BA.debugLineNum = 21;BA.debugLine="If Success And Texts.Size > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean(">",_texts.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 22;BA.debugLine="Return Texts.Get(0)";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,_texts.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 24;BA.debugLine="Return \"\"";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("")));return;};
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _vr_result(RemoteObject __ref,RemoteObject _success,RemoteObject _texts) throws Exception{
}
public static RemoteObject  _setreconigzedlanguage(RemoteObject __ref,RemoteObject _textlang) throws Exception{
try {
		Debug.PushSubsStack("setReconigzedLanguage (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setreconigzedlanguage")) { return __ref.runUserSub(false, "gemivspeechreconigtion","setreconigzedlanguage", __ref, _textlang);}
Debug.locals.put("textLang", _textlang);
 BA.debugLineNum = 39;BA.debugLine="Public Sub setReconigzedLanguage(textLang As Strin";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="recognizedLanguage = textLang";
Debug.ShouldStop(128);
__ref.setField ("_recognizedlanguage" /*RemoteObject*/ ,_textlang);
 BA.debugLineNum = 41;BA.debugLine="VR.Language = \"es\"";
Debug.ShouldStop(256);
__ref.getField(false,"_vr" /*RemoteObject*/ ).runVoidMethod ("setLanguage",BA.ObjectToString("es"));
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
public static RemoteObject  _setrecpromptext(RemoteObject __ref,RemoteObject _recprompt) throws Exception{
try {
		Debug.PushSubsStack("setRecPrompText (gemivspeechreconigtion) ","gemivspeechreconigtion",3,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setrecpromptext")) { return __ref.runUserSub(false, "gemivspeechreconigtion","setrecpromptext", __ref, _recprompt);}
Debug.locals.put("recPrompt", _recprompt);
 BA.debugLineNum = 48;BA.debugLine="Public Sub setRecPrompText(recPrompt As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="recPromptText = recPromptText";
Debug.ShouldStop(65536);
__ref.setField ("_recprompttext" /*RemoteObject*/ ,__ref.getField(true,"_recprompttext" /*RemoteObject*/ ));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}