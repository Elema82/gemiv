package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivtts extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivtts");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.obejcts.TTS _texttospeech = null;
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private textToSpeech 			As TTS";
_texttospeech = new anywheresoftware.b4a.obejcts.TTS();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.obejcts.TTS  _gettexttospeech() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub getTextToSpeech As TTS";
 //BA.debugLineNum = 11;BA.debugLine="Return textToSpeech";
if (true) return _texttospeech;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="textToSpeech.Initialize(\"TTS\")";
_texttospeech.Initialize(ba,"TTS");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _speak(String _text,boolean _clear) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub speak(text As String,clear As Boolean)";
 //BA.debugLineNum = 15;BA.debugLine="textToSpeech.Speak(text,clear)";
_texttospeech.Speak(_text,_clear);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
