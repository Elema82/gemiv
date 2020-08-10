package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivtts extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivtts");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.gemiv.app.hub.gemivtts.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.obejcts.TTS _texttospeech = null;
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivtts __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivtts";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="textToSpeech.Initialize(\"TTS\")";
__ref._texttospeech /*anywheresoftware.b4a.obejcts.TTS*/ .Initialize(ba,"TTS");
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.obejcts.TTS  _gettexttospeech(b4a.gemiv.app.hub.gemivtts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivtts";
if (Debug.shouldDelegate(ba, "gettexttospeech", false))
	 {return ((anywheresoftware.b4a.obejcts.TTS) Debug.delegate(ba, "gettexttospeech", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub getTextToSpeech As TTS";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Return textToSpeech";
if (true) return __ref._texttospeech /*anywheresoftware.b4a.obejcts.TTS*/ ;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return null;
}
public String  _speak(b4a.gemiv.app.hub.gemivtts __ref,String _text,boolean _clear) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivtts";
if (Debug.shouldDelegate(ba, "speak", false))
	 {return ((String) Debug.delegate(ba, "speak", new Object[] {_text,_clear}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub speak(text As String,clear As Boolean)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="textToSpeech.Speak(text,clear)";
__ref._texttospeech /*anywheresoftware.b4a.obejcts.TTS*/ .Speak(_text,_clear);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.gemiv.app.hub.gemivtts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivtts";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Private textToSpeech 			As TTS";
_texttospeech = new anywheresoftware.b4a.obejcts.TTS();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
}