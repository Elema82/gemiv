package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivspeechreconigtion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivspeechreconigtion");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.gemiv.app.hub.gemivspeechreconigtion.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _recognizedtext = null;
public String _recognizedlanguage = "";
public String _recprompttext = "";
public anywheresoftware.b4a.phone.Phone.VoiceRecognition _vr = null;
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private recognizedText As List";
_recognizedtext = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3;BA.debugLine="Private recognizedLanguage As String";
_recognizedlanguage = "";
 //BA.debugLineNum = 4;BA.debugLine="Private recPromptText As String";
_recprompttext = "";
 //BA.debugLineNum = 5;BA.debugLine="Private VR As VoiceRecognition";
_vr = new anywheresoftware.b4a.phone.Phone.VoiceRecognition();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getrecognizedtext() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub getRecognizedText As List";
 //BA.debugLineNum = 33;BA.debugLine="Return recognizedText";
if (true) return _recognizedtext;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _getreconigzedlanguage() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub getReconigzedLanguage As String";
 //BA.debugLineNum = 37;BA.debugLine="Return recognizedLanguage";
if (true) return _recognizedlanguage;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _getrecprompttext() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub getRecPromptText As String";
 //BA.debugLineNum = 46;BA.debugLine="Return recPromptText";
if (true) return _recprompttext;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _reclang,String _recprompt) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(recLang As String, recPrompt";
 //BA.debugLineNum = 10;BA.debugLine="VR.Initialize(\"VR\")";
_vr.Initialize("VR");
 //BA.debugLineNum = 11;BA.debugLine="recognizedLanguage = recLang";
_recognizedlanguage = _reclang;
 //BA.debugLineNum = 12;BA.debugLine="If Not(recLang = Null) Then";
if (__c.Not(_reclang== null)) { 
 //BA.debugLineNum = 13;BA.debugLine="VR.Language = \"es\"";
_vr.setLanguage("es");
 };
 //BA.debugLineNum = 15;BA.debugLine="recPromptText = recPrompt";
_recprompttext = _recprompt;
 //BA.debugLineNum = 16;BA.debugLine="VR.Prompt = recPrompt";
_vr.setPrompt(_recprompt);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _listenspeech() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub listenSpeech";
 //BA.debugLineNum = 29;BA.debugLine="VR.Listen";
_vr.Listen(ba);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _recognizevoice() throws Exception{
ResumableSub_RecognizeVoice rsub = new ResumableSub_RecognizeVoice(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RecognizeVoice extends BA.ResumableSub {
public ResumableSub_RecognizeVoice(b4a.gemiv.app.hub.gemivspeechreconigtion parent) {
this.parent = parent;
}
b4a.gemiv.app.hub.gemivspeechreconigtion parent;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _texts = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 21;BA.debugLine="Wait For VR_Result (Success As Boolean, Texts As";
parent.__c.WaitFor("vr_result", ba, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[0];
_texts = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 //BA.debugLineNum = 22;BA.debugLine="If Success And Texts.Size > 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success && _texts.getSize()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 23;BA.debugLine="Return Texts.Get(0)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_texts.Get((int) (0)));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 25;BA.debugLine="Return \"\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(""));return;};
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _vr_result(boolean _success,anywheresoftware.b4a.objects.collections.List _texts) throws Exception{
}
public String  _setreconigzedlanguage(String _textlang) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub setReconigzedLanguage(textLang As Strin";
 //BA.debugLineNum = 41;BA.debugLine="recognizedLanguage = textLang";
_recognizedlanguage = _textlang;
 //BA.debugLineNum = 42;BA.debugLine="VR.Language = \"es\"";
_vr.setLanguage("es");
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _setrecpromptext(String _recprompt) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub setRecPrompText(recPrompt As String)";
 //BA.debugLineNum = 50;BA.debugLine="recPromptText = recPromptText";
_recprompttext = _recprompttext;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
