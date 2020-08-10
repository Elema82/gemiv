package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivspeechreconigtion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivspeechreconigtion");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public String  _initialize(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,anywheresoftware.b4a.BA _ba,String _reclang,String _recprompt) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_reclang,_recprompt}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Initialize(recLang As String, recPrompt";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="VR.Initialize(\"VR\")";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .Initialize("VR");
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="recognizedLanguage = recLang";
__ref._recognizedlanguage /*String*/  = _reclang;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="If Not(recLang = Null) Then";
if (__c.Not(_reclang== null)) { 
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="VR.Language = \"es\"";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setLanguage("es");
 };
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="recPromptText = recPrompt";
__ref._recprompttext /*String*/  = _recprompt;
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="VR.Prompt = recPrompt";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setPrompt(_recprompt);
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="End Sub";
return "";
}
public String  _listenspeech(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "listenspeech", false))
	 {return ((String) Debug.delegate(ba, "listenspeech", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub listenSpeech";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="VR.Listen";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .Listen(ba);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _recognizevoice(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "recognizevoice", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "recognizevoice", null));}
ResumableSub_RecognizeVoice rsub = new ResumableSub_RecognizeVoice(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RecognizeVoice extends BA.ResumableSub {
public ResumableSub_RecognizeVoice(b4a.gemiv.app.hub.gemivspeechreconigtion parent,b4a.gemiv.app.hub.gemivspeechreconigtion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.gemiv.app.hub.gemivspeechreconigtion __ref;
b4a.gemiv.app.hub.gemivspeechreconigtion parent;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _texts = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="gemivspeechreconigtion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Wait For VR_Result (Success As Boolean, Texts As";
parent.__c.WaitFor("vr_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "gemivspeechreconigtion", "recognizevoice"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[1];
_texts = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="If Success And Texts.Size > 0 Then";
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
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Return Texts.Get(0)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_texts.Get((int) (0)));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Return \"\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(""));return;};
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Private recognizedText As List";
_recognizedtext = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Private recognizedLanguage As String";
_recognizedlanguage = "";
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Private recPromptText As String";
_recprompttext = "";
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Private VR As VoiceRecognition";
_vr = new anywheresoftware.b4a.phone.Phone.VoiceRecognition();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getrecognizedtext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getrecognizedtext", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getrecognizedtext", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub getRecognizedText As List";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return recognizedText";
if (true) return __ref._recognizedtext /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return null;
}
public String  _getreconigzedlanguage(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getreconigzedlanguage", false))
	 {return ((String) Debug.delegate(ba, "getreconigzedlanguage", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub getReconigzedLanguage As String";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Return recognizedLanguage";
if (true) return __ref._recognizedlanguage /*String*/ ;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public String  _getrecprompttext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getrecprompttext", false))
	 {return ((String) Debug.delegate(ba, "getrecprompttext", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub getRecPromptText As String";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return recPromptText";
if (true) return __ref._recprompttext /*String*/ ;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public String  _setreconigzedlanguage(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,String _textlang) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "setreconigzedlanguage", false))
	 {return ((String) Debug.delegate(ba, "setreconigzedlanguage", new Object[] {_textlang}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub setReconigzedLanguage(textLang As Strin";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="recognizedLanguage = textLang";
__ref._recognizedlanguage /*String*/  = _textlang;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="VR.Language = \"es\"";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setLanguage("es");
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public String  _setrecpromptext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,String _recprompt) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "setrecpromptext", false))
	 {return ((String) Debug.delegate(ba, "setrecpromptext", new Object[] {_recprompt}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub setRecPrompText(recPrompt As String)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="recPromptText = recPromptText";
__ref._recprompttext /*String*/  = __ref._recprompttext /*String*/ ;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
}