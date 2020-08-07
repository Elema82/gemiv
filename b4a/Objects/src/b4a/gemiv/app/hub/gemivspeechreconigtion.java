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
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,anywheresoftware.b4a.BA _ba,String _reclang,String _recprompt) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_reclang,_recprompt}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize(recLang As String, recPrompt";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="VR.Initialize(\"VR\")";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .Initialize("VR");
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="recognizedLanguage = recLang";
__ref._recognizedlanguage /*String*/  = _reclang;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If Not(recLang = Null) Then";
if (__c.Not(_reclang== null)) { 
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="VR.Language = \"es\"";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setLanguage("es");
 };
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="recPromptText = recPrompt";
__ref._recprompttext /*String*/  = _recprompt;
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="VR.Prompt = recPrompt";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setPrompt(_recprompt);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="End Sub";
return "";
}
public String  _listenspeech(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "listenspeech", false))
	 {return ((String) Debug.delegate(ba, "listenspeech", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub listenSpeech";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="VR.Listen";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .Listen(ba);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getrecognizedtext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getrecognizedtext", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getrecognizedtext", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub getRecognizedText As List";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Return recognizedText";
if (true) return __ref._recognizedtext /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Private recognizedText As List";
_recognizedtext = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Private recognizedLanguage As String";
_recognizedlanguage = "";
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Private recPromptText As String";
_recprompttext = "";
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Private VR As VoiceRecognition";
_vr = new anywheresoftware.b4a.phone.Phone.VoiceRecognition();
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="End Sub";
return "";
}
public String  _getreconigzedlanguage(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getreconigzedlanguage", false))
	 {return ((String) Debug.delegate(ba, "getreconigzedlanguage", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub getReconigzedLanguage As String";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Return recognizedLanguage";
if (true) return __ref._recognizedlanguage /*String*/ ;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public String  _getrecprompttext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getrecprompttext", false))
	 {return ((String) Debug.delegate(ba, "getrecprompttext", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub getRecPromptText As String";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Return recPromptText";
if (true) return __ref._recprompttext /*String*/ ;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public String  _setreconigzedlanguage(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,String _textlang) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "setreconigzedlanguage", false))
	 {return ((String) Debug.delegate(ba, "setreconigzedlanguage", new Object[] {_textlang}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub setReconigzedLanguage(textLang As Strin";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="recognizedLanguage = textLang";
__ref._recognizedlanguage /*String*/  = _textlang;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="VR.Language = \"es\"";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setLanguage("es");
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="End Sub";
return "";
}
public String  _setrecpromptext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,String _recprompt) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "setrecpromptext", false))
	 {return ((String) Debug.delegate(ba, "setrecpromptext", new Object[] {_recprompt}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub setRecPrompText(recPrompt As String)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="recPromptText = recPromptText";
__ref._recprompttext /*String*/  = __ref._recprompttext /*String*/ ;
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public String  _vr_result(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,boolean _success,anywheresoftware.b4a.objects.collections.List _texts) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "vr_result", false))
	 {return ((String) Debug.delegate(ba, "vr_result", new Object[] {_success,_texts}));}
int _i = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub VR_Result (Success As Boolean, Texts As";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="recognizedText = Texts";
__ref._recognizedtext /*anywheresoftware.b4a.objects.collections.List*/  = _texts;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="For i = 0 To Texts.Size -1";
{
final int step3 = 1;
final int limit3 = (int) (_texts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Log (Texts.Get(i))";
__c.LogImpl("52949124",BA.ObjectToString(_texts.Get(_i)),0);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Log (\" i: \"&i)";
__c.LogImpl("52949125"," i: "+BA.NumberToString(_i),0);
 }
};
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="recognizedText = Texts";
__ref._recognizedtext /*anywheresoftware.b4a.objects.collections.List*/  = _texts;
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="CallSub(Main,\"setRecTextField\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"setRecTextField");
 };
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="End Sub";
return "";
}
}