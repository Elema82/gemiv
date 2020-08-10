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
public static b4a.gemiv.app.hub.gemivspeechreconigtion _voicerec = null;
public static b4a.gemiv.app.hub.gemivudpcomunication _udpcom = null;
public static b4a.gemiv.app.hub.gemivdbmanager _dbmanager = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _runtimeadmin = null;
public static b4a.gemiv.app.hub.gemivtts _text2speech = null;
public static String[] _comandos = null;
public static String _comando = "";
public static String[] _habitaciones = null;
public static String _habitacion = "";
public static String[] _perifericos = null;
public static String _periferico = "";
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public static String  _createfirsttimedbstructure(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "createfirsttimedbstructure", false))
	 {return ((String) Debug.delegate(null, "createfirsttimedbstructure", new Object[] {_ba}));}
String _qry = "";
String _insertcomandos = "";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub createFirstTimeDBStructure";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim qry As String";
_qry = "";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If isDbConfigurada Then";
if (_isdbconfigurada(_ba)) { 
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="dbManager.beginTransaction";
_dbmanager._begintransaction /*String*/ (null);
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Try";
try {RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="If Not(existConfiguraciones) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_existconfiguraciones(_ba))) { 
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="qry = \" insert into gemiv_configuraciones (db_c";
_qry = " insert into gemiv_configuraciones (db_configurada,gemiv_version_actual) values (0, '') ";
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="dbManager.ExecNonQueryStatment(qry)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_qry);
 };
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="Dim insertComandos As String = \"insert into gemi";
_insertcomandos = "insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (1,'prender','prender')";
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="insertComandos  = \"insert into gemiv_comandos(co";
_insertcomandos = "insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (2,'apagar','apagar')";
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="insertComandos  = \"insert into gemiv_comandos(co";
_insertcomandos = "insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (3,'intensidad','intensidad')";
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="insertComandos  = \"insert into gemiv_sinonimos(c";
_insertcomandos = "insert into gemiv_sinonimos(comando_id,sinonimo) values (1,'encender')";
RDebugUtils.currentLine=1572885;
 //BA.debugLineNum = 1572885;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572886;
 //BA.debugLineNum = 1572886;BA.debugLine="insertComandos  = \"insert into gemiv_sinonimos(c";
_insertcomandos = "insert into gemiv_sinonimos(comando_id,sinonimo) values (1,'activar')";
RDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572888;
 //BA.debugLineNum = 1572888;BA.debugLine="insertComandos  = \"insert into gemiv_sinonimos(c";
_insertcomandos = "insert into gemiv_sinonimos(comando_id,sinonimo) values (3,'nivel')";
RDebugUtils.currentLine=1572889;
 //BA.debugLineNum = 1572889;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572891;
 //BA.debugLineNum = 1572891;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
_insertcomandos = "insert into gemiv_tipoperifericos(tipoperiferico_id,nombre) values (1,'ON/OFF')";
RDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572893;
 //BA.debugLineNum = 1572893;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
_insertcomandos = "insert into gemiv_tipoperifericos(tipoperiferico_id,nombre) values (2,'DIMMER')";
RDebugUtils.currentLine=1572894;
 //BA.debugLineNum = 1572894;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572896;
 //BA.debugLineNum = 1572896;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
_insertcomandos = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (1,1)";
RDebugUtils.currentLine=1572897;
 //BA.debugLineNum = 1572897;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572898;
 //BA.debugLineNum = 1572898;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
_insertcomandos = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (1,2)";
RDebugUtils.currentLine=1572899;
 //BA.debugLineNum = 1572899;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572900;
 //BA.debugLineNum = 1572900;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
_insertcomandos = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,1)";
RDebugUtils.currentLine=1572901;
 //BA.debugLineNum = 1572901;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572902;
 //BA.debugLineNum = 1572902;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
_insertcomandos = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,2)";
RDebugUtils.currentLine=1572903;
 //BA.debugLineNum = 1572903;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572904;
 //BA.debugLineNum = 1572904;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
_insertcomandos = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,3)";
RDebugUtils.currentLine=1572905;
 //BA.debugLineNum = 1572905;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572907;
 //BA.debugLineNum = 1572907;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Living')";
RDebugUtils.currentLine=1572908;
 //BA.debugLineNum = 1572908;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572909;
 //BA.debugLineNum = 1572909;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Cocina')";
RDebugUtils.currentLine=1572910;
 //BA.debugLineNum = 1572910;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572911;
 //BA.debugLineNum = 1572911;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Comedor')";
RDebugUtils.currentLine=1572912;
 //BA.debugLineNum = 1572912;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572913;
 //BA.debugLineNum = 1572913;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Baño')";
RDebugUtils.currentLine=1572914;
 //BA.debugLineNum = 1572914;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572915;
 //BA.debugLineNum = 1572915;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Dormitorio 1')";
RDebugUtils.currentLine=1572916;
 //BA.debugLineNum = 1572916;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572917;
 //BA.debugLineNum = 1572917;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Dormitorio 2')";
RDebugUtils.currentLine=1572918;
 //BA.debugLineNum = 1572918;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572919;
 //BA.debugLineNum = 1572919;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Patio')";
RDebugUtils.currentLine=1572920;
 //BA.debugLineNum = 1572920;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572921;
 //BA.debugLineNum = 1572921;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Lavadero')";
RDebugUtils.currentLine=1572922;
 //BA.debugLineNum = 1572922;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572923;
 //BA.debugLineNum = 1572923;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Garage')";
RDebugUtils.currentLine=1572924;
 //BA.debugLineNum = 1572924;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572925;
 //BA.debugLineNum = 1572925;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
_insertcomandos = "insert into gemiv_habitaciones(nombre) values ('Porche')";
RDebugUtils.currentLine=1572926;
 //BA.debugLineNum = 1572926;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572928;
 //BA.debugLineNum = 1572928;BA.debugLine="insertComandos = \" update gemiv_configuraciones";
_insertcomandos = " update gemiv_configuraciones set db_configurada = 1 ";
RDebugUtils.currentLine=1572929;
 //BA.debugLineNum = 1572929;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
RDebugUtils.currentLine=1572930;
 //BA.debugLineNum = 1572930;BA.debugLine="dbManager.sucessfulTransaction";
_dbmanager._sucessfultransaction /*String*/ (null);
 } 
       catch (Exception e61) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e61);RDebugUtils.currentLine=1572932;
 //BA.debugLineNum = 1572932;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("11572932",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=1572934;
 //BA.debugLineNum = 1572934;BA.debugLine="dbManager.endTransaction";
_dbmanager._endtransaction /*String*/ (null);
RDebugUtils.currentLine=1572935;
 //BA.debugLineNum = 1572935;BA.debugLine="End Sub";
return "";
}
public static String  _processdispositivo(anywheresoftware.b4a.BA _ba,String _mac,String _ip) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "processdispositivo", false))
	 {return ((String) Debug.delegate(null, "processdispositivo", new Object[] {_ba,_mac,_ip}));}
String _qry = "";
int _dispositivo_id = 0;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub processDispositivo(mac As String,ip As";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Dim qry As String";
_qry = "";
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="If existMac(mac) Then";
if (_existmac(_ba,_mac)) { 
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="Try";
try {RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="qry = \"update gemiv_dispositivos set ip = '\"&ip";
_qry = "update gemiv_dispositivos set ip = '"+_ip+"' where mac like '"+_mac+"'";
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="dbManager.ExecNonQueryStatment(qry)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_qry);
 } 
       catch (Exception e7) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e7);RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("112845063",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 }else {
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="qry  = qryInsertDevices(\"\",ip,mac,0)";
_qry = _qryinsertdevices(_ba,"",_ip,_mac,(int) (0));
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="Try";
try {RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="dbManager.ExecNonQueryStatment(qry)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_qry);
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="Dim dispositivo_id As Int = getLastDispositivoI";
_dispositivo_id = _getlastdispositivoid(_ba);
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="If dispositivo_id > 0 Then";
if (_dispositivo_id>0) { 
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="createPerifericos(dispositivo_id)";
_createperifericos(_ba,_dispositivo_id);
 };
 } 
       catch (Exception e18) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e18);RDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("112845074",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="End Sub";
return "";
}
public static String  _qrydeletedevices(anywheresoftware.b4a.BA _ba,String _name) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "qrydeletedevices", false))
	 {return ((String) Debug.delegate(null, "qrydeletedevices", new Object[] {_ba,_name}));}
String _qryheader = "";
String _qrybody = "";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub qryDeleteDevices(name As String) As Str";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim qryHeader As String = \" DELETE FROM  gemiv_di";
_qryheader = " DELETE FROM  gemiv_dispositivos WHERE ";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim qryBody   As String = \" nombre = '\" & name &";
_qrybody = " nombre = '"+_name+"'";
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Return qryHeader & qryBody";
if (true) return _qryheader+_qrybody;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="End Sub";
return "";
}
public static String  _gettexttospeech(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "gettexttospeech", false))
	 {return ((String) Debug.delegate(null, "gettexttospeech", new Object[] {_ba,_text}));}
String[] _palabras = null;
String _pregunta = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.List _list1 = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub getTextToSpeech(text As String) As Stri";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim palabras() As String";
_palabras = new String[(int) (0)];
java.util.Arrays.fill(_palabras,"");
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim pregunta As String";
_pregunta = "";
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim palabras() As String = Regex.Split(\" \",text)";
_palabras = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_text);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="For i=0 To palabras.Length-1";
{
final int step4 = 1;
final int limit4 = (int) (_palabras.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="list1.Initialize2(comandos)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_comandos));
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="comando=palabras(i)";
_comando = _palabras[_i];
 };
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="list1.Initialize2(habitaciones)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_habitaciones));
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="habitacion=palabras(i)";
_habitacion = _palabras[_i];
 };
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="list1.Initialize2(perifericos)";
_list1.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_perifericos));
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
if (_list1.IndexOf((Object)(_palabras[_i].toLowerCase()))!=-1) { 
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="periferico=palabras(i)";
_periferico = _palabras[_i];
 };
 }
};
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="pregunta=\"¿\"";
_pregunta = "¿";
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="If comando=\"\" Then";
if ((_comando).equals("")) { 
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="pregunta=pregunta&\"que quiere hacer\"";
_pregunta = _pregunta+"que quiere hacer";
 };
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="If habitacion=\"\" Then";
if ((_habitacion).equals("")) { 
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="pregunta=pregunta&\" en cual habitación\"";
_pregunta = _pregunta+" en cual habitación";
 };
RDebugUtils.currentLine=1507354;
 //BA.debugLineNum = 1507354;BA.debugLine="If periferico=\"\" Then";
if ((_periferico).equals("")) { 
RDebugUtils.currentLine=1507355;
 //BA.debugLineNum = 1507355;BA.debugLine="pregunta=pregunta&\" en cual periférico\"";
_pregunta = _pregunta+" en cual periférico";
 };
RDebugUtils.currentLine=1507357;
 //BA.debugLineNum = 1507357;BA.debugLine="pregunta=pregunta&\"?\"";
_pregunta = _pregunta+"?";
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="If pregunta.Length>2 Then";
if (_pregunta.length()>2) { 
RDebugUtils.currentLine=1507359;
 //BA.debugLineNum = 1507359;BA.debugLine="Return pregunta";
if (true) return _pregunta;
 }else {
RDebugUtils.currentLine=1507361;
 //BA.debugLineNum = 1507361;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=1507364;
 //BA.debugLineNum = 1507364;BA.debugLine="End Sub";
return "";
}
public static boolean  _isdbconfigurada(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "isdbconfigurada", false))
	 {return ((Boolean) Debug.delegate(null, "isdbconfigurada", new Object[] {_ba}));}
String _selectconfiguraciones = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _response = null;
int _dbconfigurada = 0;
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub isDbConfigurada As Boolean";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Dim selectConfiguraciones As String = \"select db_";
_selectconfiguraciones = "select db_configurada from gemiv_configuraciones";
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
_response = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_response = _dbmanager._execquerystatment /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (null,_selectconfiguraciones);
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="If response.RowCount > 0 Then";
if (_response.getRowCount()>0) { 
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="response.Position = 0";
_response.setPosition((int) (0));
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="Dim dbConfigurada As Int= response.GetInt(\"db_co";
_dbconfigurada = _response.GetInt("db_configurada");
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="If (dbConfigurada = 1) Then";
if ((_dbconfigurada==1)) { 
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=17760265;
 //BA.debugLineNum = 17760265;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=17760267;
 //BA.debugLineNum = 17760267;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17760268;
 //BA.debugLineNum = 17760268;BA.debugLine="End Sub";
return false;
}
public static boolean  _existconfiguraciones(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "existconfiguraciones", false))
	 {return ((Boolean) Debug.delegate(null, "existconfiguraciones", new Object[] {_ba}));}
String _selectconfiguraciones = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _response = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub existConfiguraciones As Boolean";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Dim selectConfiguraciones As String = \"select * f";
_selectconfiguraciones = "select * from gemiv_configuraciones";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
_response = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_response = _dbmanager._execquerystatment /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (null,_selectconfiguraciones);
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="If response.RowCount > 0 Then";
if (_response.getRowCount()>0) { 
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="End Sub";
return false;
}
public static boolean  _createperifericos(anywheresoftware.b4a.BA _ba,int _dispositivo_id) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "createperifericos", false))
	 {return ((Boolean) Debug.delegate(null, "createperifericos", new Object[] {_ba,_dispositivo_id}));}
String _insertcomandos = "";
int _i = 0;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub createPerifericos(dispositivo_id As Int";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim insertComandos As String";
_insertcomandos = "";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="dbManager.beginTransaction";
_dbmanager._begintransaction /*String*/ (null);
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Try";
try {RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="For i = 1 To 10";
{
final int step4 = 1;
final int limit4 = (int) (10);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="insertComandos  = \"insert into gemiv_periferico";
_insertcomandos = "insert into gemiv_perifericos(dispositivo_id,pin) values ("+BA.NumberToString(_dispositivo_id)+","+BA.NumberToString(_i)+")";
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
_dbmanager._execnonquerystatment /*boolean*/ (null,_insertcomandos);
 }
};
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="dbManager.sucessfulTransaction";
_dbmanager._sucessfultransaction /*String*/ (null);
 } 
       catch (Exception e10) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e10);RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("110158090",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=10158091;
 //BA.debugLineNum = 10158091;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=10158093;
 //BA.debugLineNum = 10158093;BA.debugLine="dbManager.endTransaction";
_dbmanager._endtransaction /*String*/ (null);
RDebugUtils.currentLine=10158094;
 //BA.debugLineNum = 10158094;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=10158095;
 //BA.debugLineNum = 10158095;BA.debugLine="End Sub";
return false;
}
public static boolean  _existmac(anywheresoftware.b4a.BA _ba,String _mac) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "existmac", false))
	 {return ((Boolean) Debug.delegate(null, "existmac", new Object[] {_ba,_mac}));}
String _selectdispositivo = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _response = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub existMac(mac As String) As Boolean";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim selectDispositivo As String = \"select disposi";
_selectdispositivo = "select dispositivo_id from gemiv_dispositivos where mac like '"+_mac+"'";
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
_response = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_response = _dbmanager._execquerystatment /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (null,_selectdispositivo);
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="If response.RowCount > 0 Then";
if (_response.getRowCount()>0) { 
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="End Sub";
return false;
}
public static int  _getlastdispositivoid(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "getlastdispositivoid", false))
	 {return ((Integer) Debug.delegate(null, "getlastdispositivoid", new Object[] {_ba}));}
String _selectdispositivo = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _response = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub getLastDispositivoId As Int";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim selectDispositivo As String = \"select disposi";
_selectdispositivo = "select dispositivo_id from gemiv_dispositivos order by dispositivo_id desc limit 1";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
_response = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_response = _dbmanager._execquerystatment /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (null,_selectdispositivo);
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="If response.RowCount > 0 Then";
if (_response.getRowCount()>0) { 
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="response.Position = 0";
_response.setPosition((int) (0));
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Return response.GetInt(\"dispositivo_id\")";
if (true) return _response.GetInt("dispositivo_id");
 };
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="End Sub";
return 0;
}
public static String  _qryinsertdevices(anywheresoftware.b4a.BA _ba,String _name,String _ip,String _mac,int _habitacion_id) throws Exception{
RDebugUtils.currentModule="gemivglobals";
if (Debug.shouldDelegate(null, "qryinsertdevices", false))
	 {return ((String) Debug.delegate(null, "qryinsertdevices", new Object[] {_ba,_name,_ip,_mac,_habitacion_id}));}
String _qryheader = "";
String _qrybody = "";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub qryInsertDevices(name As String,ip As S";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim qryHeader As String = \" INSERT INTO gemiv_dis";
_qryheader = " INSERT INTO gemiv_dispositivos (ip,mac,nombre,habitacion_id) ";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim qryBody   As String = \" VALUES ('\"&ip&\"', '\"&";
_qrybody = " VALUES ('"+_ip+"', '"+_mac+"', '"+_name+"', "+BA.NumberToString(_habitacion_id)+")";
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Return qryHeader & qryBody";
if (true) return _qryheader+_qrybody;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return "";
}
}