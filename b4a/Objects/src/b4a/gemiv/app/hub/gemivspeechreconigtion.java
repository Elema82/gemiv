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
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,anywheresoftware.b4a.BA _ba,String _reclang,String _recprompt) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_reclang,_recprompt}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Initialize(recLang As String, recPrompt";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="VR.Initialize(\"VR\")";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .Initialize("VR");
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="recognizedLanguage = recLang";
__ref._recognizedlanguage /*String*/  = _reclang;
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="If Not(recLang = Null) Then";
if (__c.Not(_reclang== null)) { 
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="VR.Language = \"es\"";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setLanguage("es");
 };
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="recPromptText = recPrompt";
__ref._recprompttext /*String*/  = _recprompt;
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="VR.Prompt = recPrompt";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setPrompt(_recprompt);
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="End Sub";
return "";
}
public String  _listenspeech(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "listenspeech", false))
	 {return ((String) Debug.delegate(ba, "listenspeech", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub listenSpeech";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="VR.Listen";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .Listen(ba);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getrecognizedtext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getrecognizedtext", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getrecognizedtext", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub getRecognizedText As List";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return recognizedText";
if (true) return __ref._recognizedtext /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Private recognizedText As List";
_recognizedtext = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private recognizedLanguage As String";
_recognizedlanguage = "";
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Private recPromptText As String";
_recprompttext = "";
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Private VR As VoiceRecognition";
_vr = new anywheresoftware.b4a.phone.Phone.VoiceRecognition();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public String  _getreconigzedlanguage(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getreconigzedlanguage", false))
	 {return ((String) Debug.delegate(ba, "getreconigzedlanguage", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub getReconigzedLanguage As String";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Return recognizedLanguage";
if (true) return __ref._recognizedlanguage /*String*/ ;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _getrecprompttext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "getrecprompttext", false))
	 {return ((String) Debug.delegate(ba, "getrecprompttext", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub getRecPromptText As String";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return recPromptText";
if (true) return __ref._recprompttext /*String*/ ;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _setreconigzedlanguage(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,String _textlang) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "setreconigzedlanguage", false))
	 {return ((String) Debug.delegate(ba, "setreconigzedlanguage", new Object[] {_textlang}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub setReconigzedLanguage(textLang As Strin";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="recognizedLanguage = textLang";
__ref._recognizedlanguage /*String*/  = _textlang;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="VR.Language = \"es\"";
__ref._vr /*anywheresoftware.b4a.phone.Phone.VoiceRecognition*/ .setLanguage("es");
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public String  _setrecpromptext(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,String _recprompt) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "setrecpromptext", false))
	 {return ((String) Debug.delegate(ba, "setrecpromptext", new Object[] {_recprompt}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub setRecPrompText(recPrompt As String)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="recPromptText = recPromptText";
__ref._recprompttext /*String*/  = __ref._recprompttext /*String*/ ;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _vr_result(b4a.gemiv.app.hub.gemivspeechreconigtion __ref,boolean _success,anywheresoftware.b4a.objects.collections.List _texts) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivspeechreconigtion";
if (Debug.shouldDelegate(ba, "vr_result", false))
	 {return ((String) Debug.delegate(ba, "vr_result", new Object[] {_success,_texts}));}
int _i = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub VR_Result (Success As Boolean, Texts As";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="recognizedText = Texts";
__ref._recognizedtext /*anywheresoftware.b4a.objects.collections.List*/  = _texts;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="For i = 0 To Texts.Size -1";
{
final int step3 = 1;
final int limit3 = (int) (_texts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Log (Texts.Get(i))";
__c.LogImpl("31310724",BA.ObjectToString(_texts.Get(_i)),0);
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Log (\" i: \"&i)";
__c.LogImpl("31310725"," i: "+BA.NumberToString(_i),0);
 }
};
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="recognizedText = Texts";
__ref._recognizedtext /*anywheresoftware.b4a.objects.collections.List*/  = _texts;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="CallSub(Main,\"setRecTextField\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"setRecTextField");
 };
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="End Sub";
return "";
}
}