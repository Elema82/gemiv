package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivglobals {
private static gemivglobals mostCurrent = new gemivglobals();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static String[] _comandos = null;
public static String _comando = "";
public static String[] _habitaciones = null;
public static String _habitacion = "";
public static String[] _perifericos = null;
public static String _periferico = "";
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public static String  _gettexttospeech(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
String[] _palabras = null;
String _pregunta = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.List _list1 = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub getTextToSpeech(text As String) As Stri";
 //BA.debugLineNum = 33;BA.debugLine="Dim palabras() As String";
_palabras = new String[(int) (0)];
java.util.Arrays.fill(_palabras,"");
 //BA.debugLineNum = 34;BA.debugLine="Dim pregunta As String";
_pregunta = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim palabras() As String = Regex.Split(\" \",text)";
_palabras = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_text);
 //BA.debugLineNum = 36;BA.debugLine="For i=0 To palabras.Length-1";
{
final int step4 = 1;
final int limit4 = (int) (_palabras.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 37;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 38;BA.debugLine="list1.Initialize2(comandos)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_comandos));
 //BA.debugLineNum = 39;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
 //BA.debugLineNum = 40;BA.debugLine="comando=palabras(i)";
_comando = _palabras[_i];
 };
 //BA.debugLineNum = 42;BA.debugLine="list1.Initialize2(habitaciones)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_habitaciones));
 //BA.debugLineNum = 43;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
 //BA.debugLineNum = 44;BA.debugLine="habitacion=palabras(i)";
_habitacion = _palabras[_i];
 };
 //BA.debugLineNum = 46;BA.debugLine="list1.Initialize2(perifericos)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_perifericos));
 //BA.debugLineNum = 47;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
 //BA.debugLineNum = 48;BA.debugLine="periferico=palabras(i)";
_periferico = _palabras[_i];
 };
 }
};
 //BA.debugLineNum = 51;BA.debugLine="pregunta=\"¿\"";
_pregunta = "¿";
 //BA.debugLineNum = 52;BA.debugLine="If comando=\"\" Then";
if ((_comando).equals("")) { 
 //BA.debugLineNum = 53;BA.debugLine="pregunta=pregunta&\"que quiere hacer\"";
_pregunta = _pregunta+"que quiere hacer";
 };
 //BA.debugLineNum = 55;BA.debugLine="If habitacion=\"\" Then";
if ((_habitacion).equals("")) { 
 //BA.debugLineNum = 56;BA.debugLine="pregunta=pregunta&\" en cual habitación\"";
_pregunta = _pregunta+" en cual habitación";
 };
 //BA.debugLineNum = 58;BA.debugLine="If periferico=\"\" Then";
if ((_periferico).equals("")) { 
 //BA.debugLineNum = 59;BA.debugLine="pregunta=pregunta&\" en cual periférico\"";
_pregunta = _pregunta+" en cual periférico";
 };
 //BA.debugLineNum = 61;BA.debugLine="pregunta=pregunta&\"?\"";
_pregunta = _pregunta+"?";
 //BA.debugLineNum = 62;BA.debugLine="If pregunta.Length>2 Then";
if (_pregunta.length()>2) { 
 //BA.debugLineNum = 63;BA.debugLine="Return pregunta";
if (true) return _pregunta;
 }else {
 //BA.debugLineNum = 65;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim comandos()  	As String";
_comandos = new String[(int) (0)];
java.util.Arrays.fill(_comandos,"");
 //BA.debugLineNum = 7;BA.debugLine="Dim comando	 		As String";
_comando = "";
 //BA.debugLineNum = 8;BA.debugLine="Dim habitaciones()  As String";
_habitaciones = new String[(int) (0)];
java.util.Arrays.fill(_habitaciones,"");
 //BA.debugLineNum = 9;BA.debugLine="Dim habitacion	 	As String";
_habitacion = "";
 //BA.debugLineNum = 10;BA.debugLine="Dim perifericos()  	As String";
_perifericos = new String[(int) (0)];
java.util.Arrays.fill(_perifericos,"");
 //BA.debugLineNum = 11;BA.debugLine="Dim periferico	 	As String";
_periferico = "";
 //BA.debugLineNum = 12;BA.debugLine="comando				= \"\"";
_comando = "";
 //BA.debugLineNum = 13;BA.debugLine="comandos 			= Array As String(\"prender\",\"apagar\")";
_comandos = new String[]{"prender","apagar"};
 //BA.debugLineNum = 14;BA.debugLine="habitacion			=\"\"";
_habitacion = "";
 //BA.debugLineNum = 15;BA.debugLine="habitaciones 		= Array As String(\"baño\",\"dormitor";
_habitaciones = new String[]{"baño","dormitorio","cocina"};
 //BA.debugLineNum = 16;BA.debugLine="periferico			=\"\"";
_periferico = "";
 //BA.debugLineNum = 17;BA.debugLine="perifericos 		= Array As String(\"luz\",\"aire\",\"ven";
_perifericos = new String[]{"luz","aire","ventilador"};
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public static String  _qrydeletedevices(anywheresoftware.b4a.BA _ba,String _name) throws Exception{
String _qryheader = "";
String _qrybody = "";
 //BA.debugLineNum = 26;BA.debugLine="Public Sub qryDeleteDevices(name As String) As Str";
 //BA.debugLineNum = 27;BA.debugLine="Dim qryHeader As String = \" DELETE FROM  gemiv_di";
_qryheader = " DELETE FROM  gemiv_dispositivos WHERE ";
 //BA.debugLineNum = 28;BA.debugLine="Dim qryBody   As String = \" nombre = '\" & name &";
_qrybody = " nombre = '"+_name+"'";
 //BA.debugLineNum = 29;BA.debugLine="Return qryHeader & qryBody";
if (true) return _qryheader+_qrybody;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _qryinsertdevices(anywheresoftware.b4a.BA _ba,String _name,String _ip,String _mac,int _habitacion_id) throws Exception{
String _qryheader = "";
String _qrybody = "";
 //BA.debugLineNum = 20;BA.debugLine="Public Sub qryInsertDevices(name As String,ip As S";
 //BA.debugLineNum = 21;BA.debugLine="Dim qryHeader As String = \" INSERT INTO gemiv_dis";
_qryheader = " INSERT INTO gemiv_dispositivos (ip,mac,nombre,habitacion_id) ";
 //BA.debugLineNum = 22;BA.debugLine="Dim qryBody   As String = \" VALUES ('\"&ip&\"', '\"&";
_qrybody = " VALUES ('"+_ip+"', '"+_mac+"', '"+_name+"', "+BA.NumberToString(_habitacion_id)+")";
 //BA.debugLineNum = 23;BA.debugLine="Return qryHeader & qryBody";
if (true) return _qryheader+_qrybody;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
}
