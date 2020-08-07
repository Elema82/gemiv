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
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public static String  _qryinsertdevices(anywheresoftware.b4a.BA _ba,String _name,String _ip,String _mac,int _habitacion_id) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "qryinsertdevices", false))
	 {return ((String) Debug.delegate(null, "qryinsertdevices", new Object[] {_ba,_name,_ip,_mac,_habitacion_id}));}
String _qryheader = "";
String _qrybody = "";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub qryInsertDevices(name As String,ip As S";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim qryHeader As String = \" INSERT INTO gemiv_dis";
_qryheader = " INSERT INTO gemiv_dispositivos (ip,mac,nombre,habitacion_id) ";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim qryBody   As String = \" VALUES ('\"&ip&\"', '\"&";
_qrybody = " VALUES ('"+_ip+"', '"+_mac+"', '"+_name+"', "+BA.NumberToString(_habitacion_id)+")";
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Return qryHeader & qryBody";
if (true) return _qryheader+_qrybody;
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return "";
}
public static String  _qrydeletedevices(anywheresoftware.b4a.BA _ba,String _name) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "qrydeletedevices", false))
	 {return ((String) Debug.delegate(null, "qrydeletedevices", new Object[] {_ba,_name}));}
String _qryheader = "";
String _qrybody = "";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub qryDeleteDevices(name As String) As Str";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim qryHeader As String = \" DELETE FROM  gemiv_di";
_qryheader = " DELETE FROM  gemiv_dispositivos WHERE ";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim qryBody   As String = \" nombre = '\" & name &";
_qrybody = " nombre = '"+_name+"'";
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Return qryHeader & qryBody";
if (true) return _qryheader+_qrybody;
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="End Sub";
return "";
}
}