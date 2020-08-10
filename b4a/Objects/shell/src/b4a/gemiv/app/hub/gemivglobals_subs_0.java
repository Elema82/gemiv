package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemivglobals_subs_0 {


public static RemoteObject  _createfirsttimedbstructure(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("createFirstTimeDBStructure (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,77);
if (RapidSub.canDelegate("createfirsttimedbstructure")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","createfirsttimedbstructure", _ba);}
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _insertcomandos = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 77;BA.debugLine="Public Sub createFirstTimeDBStructure";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim qry As String";
Debug.ShouldStop(8192);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 79;BA.debugLine="If isDbConfigurada Then";
Debug.ShouldStop(16384);
if (_isdbconfigurada(_ba).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 82;BA.debugLine="dbManager.beginTransaction";
Debug.ShouldStop(131072);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_begintransaction" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 85;BA.debugLine="If Not(existConfiguraciones) Then";
Debug.ShouldStop(1048576);
if (gemivglobals.mostCurrent.__c.runMethod(true,"Not",(Object)(_existconfiguraciones(_ba))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="qry = \" insert into gemiv_configuraciones (db_c";
Debug.ShouldStop(2097152);
_qry = BA.ObjectToString(" insert into gemiv_configuraciones (db_configurada,gemiv_version_actual) values (0, '') ");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 87;BA.debugLine="dbManager.ExecNonQueryStatment(qry)";
Debug.ShouldStop(4194304);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_qry));
 };
 BA.debugLineNum = 90;BA.debugLine="Dim insertComandos As String = \"insert into gemi";
Debug.ShouldStop(33554432);
_insertcomandos = BA.ObjectToString("insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (1,'prender','prender')");Debug.locals.put("insertComandos", _insertcomandos);Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 91;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(67108864);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 92;BA.debugLine="insertComandos  = \"insert into gemiv_comandos(co";
Debug.ShouldStop(134217728);
_insertcomandos = BA.ObjectToString("insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (2,'apagar','apagar')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 93;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(268435456);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 94;BA.debugLine="insertComandos  = \"insert into gemiv_comandos(co";
Debug.ShouldStop(536870912);
_insertcomandos = BA.ObjectToString("insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (3,'intensidad','intensidad')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 95;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(1073741824);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 97;BA.debugLine="insertComandos  = \"insert into gemiv_sinonimos(c";
Debug.ShouldStop(1);
_insertcomandos = BA.ObjectToString("insert into gemiv_sinonimos(comando_id,sinonimo) values (1,'encender')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 98;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(2);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 99;BA.debugLine="insertComandos  = \"insert into gemiv_sinonimos(c";
Debug.ShouldStop(4);
_insertcomandos = BA.ObjectToString("insert into gemiv_sinonimos(comando_id,sinonimo) values (1,'activar')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 100;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(8);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 101;BA.debugLine="insertComandos  = \"insert into gemiv_sinonimos(c";
Debug.ShouldStop(16);
_insertcomandos = BA.ObjectToString("insert into gemiv_sinonimos(comando_id,sinonimo) values (3,'nivel')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 102;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(32);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 104;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
Debug.ShouldStop(128);
_insertcomandos = BA.ObjectToString("insert into gemiv_tipoperifericos(tipoperiferico_id,nombre) values (1,'ON/OFF')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 105;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(256);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 106;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
Debug.ShouldStop(512);
_insertcomandos = BA.ObjectToString("insert into gemiv_tipoperifericos(tipoperiferico_id,nombre) values (2,'DIMMER')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 107;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(1024);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 109;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
Debug.ShouldStop(4096);
_insertcomandos = BA.ObjectToString("insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (1,1)");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 110;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(8192);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 111;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
Debug.ShouldStop(16384);
_insertcomandos = BA.ObjectToString("insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (1,2)");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 112;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(32768);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 113;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
Debug.ShouldStop(65536);
_insertcomandos = BA.ObjectToString("insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,1)");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 114;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(131072);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 115;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
Debug.ShouldStop(262144);
_insertcomandos = BA.ObjectToString("insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,2)");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 116;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(524288);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 117;BA.debugLine="insertComandos  = \"insert into gemiv_tipoperifer";
Debug.ShouldStop(1048576);
_insertcomandos = BA.ObjectToString("insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,3)");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 118;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(2097152);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 120;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(8388608);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Living')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 121;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(16777216);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 122;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(33554432);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Cocina')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 123;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(67108864);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 124;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(134217728);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Comedor')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 125;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(268435456);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 126;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(536870912);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Baño')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 127;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(1073741824);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 128;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(-2147483648);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Dormitorio 1')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 129;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(1);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 130;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(2);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Dormitorio 2')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 131;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(4);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 132;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(8);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Patio')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 133;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(16);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 134;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(32);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Lavadero')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 135;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(64);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 136;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(128);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Garage')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 137;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(256);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 138;BA.debugLine="insertComandos  = \"insert into gemiv_habitacione";
Debug.ShouldStop(512);
_insertcomandos = BA.ObjectToString("insert into gemiv_habitaciones(nombre) values ('Porche')");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 139;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(1024);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 141;BA.debugLine="insertComandos = \" update gemiv_configuraciones";
Debug.ShouldStop(4096);
_insertcomandos = BA.ObjectToString(" update gemiv_configuraciones set db_configurada = 1 ");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 142;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(8192);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 BA.debugLineNum = 143;BA.debugLine="dbManager.sucessfulTransaction";
Debug.ShouldStop(16384);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_sucessfultransaction" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e61) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e61.toString()); BA.debugLineNum = 145;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
gemivglobals.mostCurrent.__c.runVoidMethod ("LogImpl","11572932",BA.ObjectToString(gemivglobals.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 147;BA.debugLine="dbManager.endTransaction";
Debug.ShouldStop(262144);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_endtransaction" /*RemoteObject*/ );
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createperifericos(RemoteObject _ba,RemoteObject _dispositivo_id) throws Exception{
try {
		Debug.PushSubsStack("createPerifericos (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,150);
if (RapidSub.canDelegate("createperifericos")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","createperifericos", _ba, _dispositivo_id);}
RemoteObject _insertcomandos = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("dispositivo_id", _dispositivo_id);
 BA.debugLineNum = 150;BA.debugLine="Public Sub createPerifericos(dispositivo_id As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Dim insertComandos As String";
Debug.ShouldStop(4194304);
_insertcomandos = RemoteObject.createImmutable("");Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 152;BA.debugLine="dbManager.beginTransaction";
Debug.ShouldStop(8388608);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_begintransaction" /*RemoteObject*/ );
 BA.debugLineNum = 153;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 154;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = 10;
_i = 1 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 155;BA.debugLine="insertComandos  = \"insert into gemiv_periferico";
Debug.ShouldStop(67108864);
_insertcomandos = RemoteObject.concat(RemoteObject.createImmutable("insert into gemiv_perifericos(dispositivo_id,pin) values ("),_dispositivo_id,RemoteObject.createImmutable(","),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(")"));Debug.locals.put("insertComandos", _insertcomandos);
 BA.debugLineNum = 156;BA.debugLine="dbManager.ExecNonQueryStatment(insertComandos)";
Debug.ShouldStop(134217728);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_insertcomandos));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 158;BA.debugLine="dbManager.sucessfulTransaction";
Debug.ShouldStop(536870912);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_sucessfultransaction" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e10.toString()); BA.debugLineNum = 160;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
gemivglobals.mostCurrent.__c.runVoidMethod ("LogImpl","110158090",BA.ObjectToString(gemivglobals.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 161;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 163;BA.debugLine="dbManager.endTransaction";
Debug.ShouldStop(4);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_endtransaction" /*RemoteObject*/ );
 BA.debugLineNum = 164;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _existconfiguraciones(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("existConfiguraciones (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,209);
if (RapidSub.canDelegate("existconfiguraciones")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","existconfiguraciones", _ba);}
RemoteObject _selectconfiguraciones = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
 BA.debugLineNum = 209;BA.debugLine="Public Sub existConfiguraciones As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim selectConfiguraciones As String = \"select * f";
Debug.ShouldStop(131072);
_selectconfiguraciones = BA.ObjectToString("select * from gemiv_configuraciones");Debug.locals.put("selectConfiguraciones", _selectconfiguraciones);Debug.locals.put("selectConfiguraciones", _selectconfiguraciones);
 BA.debugLineNum = 211;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
Debug.ShouldStop(262144);
_response = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_response = gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execquerystatment" /*RemoteObject*/ ,(Object)(_selectconfiguraciones));Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 212;BA.debugLine="If response.RowCount > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_response.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 213;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 215;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _existmac(RemoteObject _ba,RemoteObject _mac) throws Exception{
try {
		Debug.PushSubsStack("existMac (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,200);
if (RapidSub.canDelegate("existmac")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","existmac", _ba, _mac);}
RemoteObject _selectdispositivo = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("mac", _mac);
 BA.debugLineNum = 200;BA.debugLine="Public Sub existMac(mac As String) As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim selectDispositivo As String = \"select disposi";
Debug.ShouldStop(256);
_selectdispositivo = RemoteObject.concat(RemoteObject.createImmutable("select dispositivo_id from gemiv_dispositivos where mac like '"),_mac,RemoteObject.createImmutable("'"));Debug.locals.put("selectDispositivo", _selectdispositivo);Debug.locals.put("selectDispositivo", _selectdispositivo);
 BA.debugLineNum = 202;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
Debug.ShouldStop(512);
_response = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_response = gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execquerystatment" /*RemoteObject*/ ,(Object)(_selectdispositivo));Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 203;BA.debugLine="If response.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_response.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 204;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 206;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastdispositivoid(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getLastDispositivoId (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,167);
if (RapidSub.canDelegate("getlastdispositivoid")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","getlastdispositivoid", _ba);}
RemoteObject _selectdispositivo = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
 BA.debugLineNum = 167;BA.debugLine="Public Sub getLastDispositivoId As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Dim selectDispositivo As String = \"select disposi";
Debug.ShouldStop(128);
_selectdispositivo = BA.ObjectToString("select dispositivo_id from gemiv_dispositivos order by dispositivo_id desc limit 1");Debug.locals.put("selectDispositivo", _selectdispositivo);Debug.locals.put("selectDispositivo", _selectdispositivo);
 BA.debugLineNum = 169;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
Debug.ShouldStop(256);
_response = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_response = gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execquerystatment" /*RemoteObject*/ ,(Object)(_selectdispositivo));Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 170;BA.debugLine="If response.RowCount > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_response.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 171;BA.debugLine="response.Position = 0";
Debug.ShouldStop(1024);
_response.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 172;BA.debugLine="Return response.GetInt(\"dispositivo_id\")";
Debug.ShouldStop(2048);
if (true) return _response.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("dispositivo_id")));
 };
 BA.debugLineNum = 174;BA.debugLine="Return 0";
Debug.ShouldStop(8192);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettexttospeech(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("getTextToSpeech (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,39);
if (RapidSub.canDelegate("gettexttospeech")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","gettexttospeech", _ba, _text);}
RemoteObject _palabras = null;
RemoteObject _pregunta = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 39;BA.debugLine="Public Sub getTextToSpeech(text As String) As Stri";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim palabras() As String";
Debug.ShouldStop(128);
_palabras = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("palabras", _palabras);
 BA.debugLineNum = 41;BA.debugLine="Dim pregunta As String";
Debug.ShouldStop(256);
_pregunta = RemoteObject.createImmutable("");Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 42;BA.debugLine="Dim palabras() As String = Regex.Split(\" \",text)";
Debug.ShouldStop(512);
_palabras = gemivglobals.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_text));Debug.locals.put("palabras", _palabras);Debug.locals.put("palabras", _palabras);
 BA.debugLineNum = 43;BA.debugLine="For i=0 To palabras.Length-1";
Debug.ShouldStop(1024);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_palabras.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 44;BA.debugLine="Dim list1 As List";
Debug.ShouldStop(2048);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list1", _list1);
 BA.debugLineNum = 45;BA.debugLine="list1.Initialize2(comandos)";
Debug.ShouldStop(4096);
_list1.runVoidMethod ("Initialize2",(Object)(gemivglobals.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(gemivglobals._comandos))));
 BA.debugLineNum = 46;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_list1.runMethod(true,"IndexOf",(Object)((_palabras.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"toLowerCase")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 47;BA.debugLine="comando=palabras(i)";
Debug.ShouldStop(16384);
gemivglobals._comando = _palabras.getArrayElement(true,BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 49;BA.debugLine="list1.Initialize2(habitaciones)";
Debug.ShouldStop(65536);
_list1.runVoidMethod ("Initialize2",(Object)(gemivglobals.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(gemivglobals._habitaciones))));
 BA.debugLineNum = 50;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_list1.runMethod(true,"IndexOf",(Object)((_palabras.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"toLowerCase")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 51;BA.debugLine="habitacion=palabras(i)";
Debug.ShouldStop(262144);
gemivglobals._habitacion = _palabras.getArrayElement(true,BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 53;BA.debugLine="list1.Initialize2(perifericos)";
Debug.ShouldStop(1048576);
_list1.runVoidMethod ("Initialize2",(Object)(gemivglobals.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(gemivglobals._perifericos))));
 BA.debugLineNum = 54;BA.debugLine="If list1.IndexOf(palabras(i).ToLowerCase) <> -1";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_list1.runMethod(true,"IndexOf",(Object)((_palabras.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"toLowerCase")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 55;BA.debugLine="periferico=palabras(i)";
Debug.ShouldStop(4194304);
gemivglobals._periferico = _palabras.getArrayElement(true,BA.numberCast(int.class, _i));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 58;BA.debugLine="pregunta=\"¿\"";
Debug.ShouldStop(33554432);
_pregunta = BA.ObjectToString("¿");Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 59;BA.debugLine="If comando=\"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",gemivglobals._comando,BA.ObjectToString(""))) { 
 BA.debugLineNum = 60;BA.debugLine="pregunta=pregunta&\"que quiere hacer\"";
Debug.ShouldStop(134217728);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable("que quiere hacer"));Debug.locals.put("pregunta", _pregunta);
 };
 BA.debugLineNum = 62;BA.debugLine="If habitacion=\"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",gemivglobals._habitacion,BA.ObjectToString(""))) { 
 BA.debugLineNum = 63;BA.debugLine="pregunta=pregunta&\" en cual habitación\"";
Debug.ShouldStop(1073741824);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable(" en cual habitación"));Debug.locals.put("pregunta", _pregunta);
 };
 BA.debugLineNum = 65;BA.debugLine="If periferico=\"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",gemivglobals._periferico,BA.ObjectToString(""))) { 
 BA.debugLineNum = 66;BA.debugLine="pregunta=pregunta&\" en cual periférico\"";
Debug.ShouldStop(2);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable(" en cual periférico"));Debug.locals.put("pregunta", _pregunta);
 };
 BA.debugLineNum = 68;BA.debugLine="pregunta=pregunta&\"?\"";
Debug.ShouldStop(8);
_pregunta = RemoteObject.concat(_pregunta,RemoteObject.createImmutable("?"));Debug.locals.put("pregunta", _pregunta);
 BA.debugLineNum = 69;BA.debugLine="If pregunta.Length>2 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_pregunta.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 70;BA.debugLine="Return pregunta";
Debug.ShouldStop(32);
if (true) return _pregunta;
 }else {
 BA.debugLineNum = 72;BA.debugLine="Return \"\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isdbconfigurada(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("isDbConfigurada (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,218);
if (RapidSub.canDelegate("isdbconfigurada")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","isdbconfigurada", _ba);}
RemoteObject _selectconfiguraciones = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _dbconfigurada = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 218;BA.debugLine="Public Sub isDbConfigurada As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="Dim selectConfiguraciones As String = \"select db_";
Debug.ShouldStop(67108864);
_selectconfiguraciones = BA.ObjectToString("select db_configurada from gemiv_configuraciones");Debug.locals.put("selectConfiguraciones", _selectconfiguraciones);Debug.locals.put("selectConfiguraciones", _selectconfiguraciones);
 BA.debugLineNum = 220;BA.debugLine="Dim response As Cursor = dbManager.ExecQueryStatm";
Debug.ShouldStop(134217728);
_response = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_response = gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execquerystatment" /*RemoteObject*/ ,(Object)(_selectconfiguraciones));Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 221;BA.debugLine="If response.RowCount > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_response.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 222;BA.debugLine="response.Position = 0";
Debug.ShouldStop(536870912);
_response.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 223;BA.debugLine="Dim dbConfigurada As Int= response.GetInt(\"db_co";
Debug.ShouldStop(1073741824);
_dbconfigurada = _response.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("db_configurada")));Debug.locals.put("dbConfigurada", _dbconfigurada);Debug.locals.put("dbConfigurada", _dbconfigurada);
 BA.debugLineNum = 224;BA.debugLine="If (dbConfigurada = 1) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_dbconfigurada,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 225;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 227;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 229;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) return gemivglobals.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim voiceRec 		As GemivSpeechReconigtion";
gemivglobals._voicerec = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivspeechreconigtion");
 //BA.debugLineNum = 7;BA.debugLine="Dim udpCom			As GemivUdpComunication";
gemivglobals._udpcom = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivudpcomunication");
 //BA.debugLineNum = 8;BA.debugLine="Dim dbManager		As GemivDBManager";
gemivglobals._dbmanager = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivdbmanager");
 //BA.debugLineNum = 9;BA.debugLine="Dim runtimeAdmin	As RuntimePermissions";
gemivglobals._runtimeadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 10;BA.debugLine="Dim text2Speech		As GemivTTS";
gemivglobals._text2speech = RemoteObject.createNew ("b4a.gemiv.app.hub.gemivtts");
 //BA.debugLineNum = 12;BA.debugLine="Dim comandos()  	As String";
gemivglobals._comandos = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 13;BA.debugLine="Dim comando	 		As String";
gemivglobals._comando = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim habitaciones()  As String";
gemivglobals._habitaciones = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 15;BA.debugLine="Dim habitacion	 	As String";
gemivglobals._habitacion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim perifericos()  	As String";
gemivglobals._perifericos = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 17;BA.debugLine="Dim periferico	 	As String";
gemivglobals._periferico = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="comando				= \"\"";
gemivglobals._comando = BA.ObjectToString("");
 //BA.debugLineNum = 20;BA.debugLine="comandos 			= Array As String(\"prender\",\"apagar\")";
gemivglobals._comandos = RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("prender"),RemoteObject.createImmutable("apagar")});
 //BA.debugLineNum = 21;BA.debugLine="habitacion			=\"\"";
gemivglobals._habitacion = BA.ObjectToString("");
 //BA.debugLineNum = 22;BA.debugLine="habitaciones 		= Array As String(\"baño\",\"dormitor";
gemivglobals._habitaciones = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("baño"),BA.ObjectToString("dormitorio"),RemoteObject.createImmutable("cocina")});
 //BA.debugLineNum = 23;BA.debugLine="periferico			=\"\"";
gemivglobals._periferico = BA.ObjectToString("");
 //BA.debugLineNum = 24;BA.debugLine="perifericos 		= Array As String(\"luz\",\"aire\",\"ven";
gemivglobals._perifericos = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("luz"),BA.ObjectToString("aire"),RemoteObject.createImmutable("ventilador")});
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _processdispositivo(RemoteObject _ba,RemoteObject _mac,RemoteObject _ip) throws Exception{
try {
		Debug.PushSubsStack("processDispositivo (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,177);
if (RapidSub.canDelegate("processdispositivo")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","processdispositivo", _ba, _mac, _ip);}
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _dispositivo_id = RemoteObject.createImmutable(0);
;
Debug.locals.put("mac", _mac);
Debug.locals.put("ip", _ip);
 BA.debugLineNum = 177;BA.debugLine="Public Sub processDispositivo(mac As String,ip As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Dim qry As String";
Debug.ShouldStop(131072);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 179;BA.debugLine="If existMac(mac) Then";
Debug.ShouldStop(262144);
if (_existmac(_ba,_mac).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 180;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 181;BA.debugLine="qry = \"update gemiv_dispositivos set ip = '\"&ip";
Debug.ShouldStop(1048576);
_qry = RemoteObject.concat(RemoteObject.createImmutable("update gemiv_dispositivos set ip = '"),_ip,RemoteObject.createImmutable("' where mac like '"),_mac,RemoteObject.createImmutable("'"));Debug.locals.put("qry", _qry);
 BA.debugLineNum = 182;BA.debugLine="dbManager.ExecNonQueryStatment(qry)";
Debug.ShouldStop(2097152);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_qry));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e7.toString()); BA.debugLineNum = 184;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
gemivglobals.mostCurrent.__c.runVoidMethod ("LogImpl","112845063",BA.ObjectToString(gemivglobals.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 }else {
 BA.debugLineNum = 187;BA.debugLine="qry  = qryInsertDevices(\"\",ip,mac,0)";
Debug.ShouldStop(67108864);
_qry = _qryinsertdevices(_ba,BA.ObjectToString(""),_ip,_mac,BA.numberCast(int.class, 0));Debug.locals.put("qry", _qry);
 BA.debugLineNum = 188;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 189;BA.debugLine="dbManager.ExecNonQueryStatment(qry)";
Debug.ShouldStop(268435456);
gemivglobals._dbmanager.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_execnonquerystatment" /*RemoteObject*/ ,(Object)(_qry));
 BA.debugLineNum = 190;BA.debugLine="Dim dispositivo_id As Int = getLastDispositivoI";
Debug.ShouldStop(536870912);
_dispositivo_id = _getlastdispositivoid(_ba);Debug.locals.put("dispositivo_id", _dispositivo_id);Debug.locals.put("dispositivo_id", _dispositivo_id);
 BA.debugLineNum = 191;BA.debugLine="If dispositivo_id > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_dispositivo_id,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 192;BA.debugLine="createPerifericos(dispositivo_id)";
Debug.ShouldStop(-2147483648);
_createperifericos(_ba,_dispositivo_id);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e18.toString()); BA.debugLineNum = 195;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
gemivglobals.mostCurrent.__c.runVoidMethod ("LogImpl","112845074",BA.ObjectToString(gemivglobals.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _qrydeletedevices(RemoteObject _ba,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("qryDeleteDevices (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,33);
if (RapidSub.canDelegate("qrydeletedevices")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","qrydeletedevices", _ba, _name);}
RemoteObject _qryheader = RemoteObject.createImmutable("");
RemoteObject _qrybody = RemoteObject.createImmutable("");
;
Debug.locals.put("name", _name);
 BA.debugLineNum = 33;BA.debugLine="Public Sub qryDeleteDevices(name As String) As Str";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim qryHeader As String = \" DELETE FROM  gemiv_di";
Debug.ShouldStop(2);
_qryheader = BA.ObjectToString(" DELETE FROM  gemiv_dispositivos WHERE ");Debug.locals.put("qryHeader", _qryheader);Debug.locals.put("qryHeader", _qryheader);
 BA.debugLineNum = 35;BA.debugLine="Dim qryBody   As String = \" nombre = '\" & name &";
Debug.ShouldStop(4);
_qrybody = RemoteObject.concat(RemoteObject.createImmutable(" nombre = '"),_name,RemoteObject.createImmutable("'"));Debug.locals.put("qryBody", _qrybody);Debug.locals.put("qryBody", _qrybody);
 BA.debugLineNum = 36;BA.debugLine="Return qryHeader & qryBody";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(_qryheader,_qrybody);
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
public static RemoteObject  _qryinsertdevices(RemoteObject _ba,RemoteObject _name,RemoteObject _ip,RemoteObject _mac,RemoteObject _habitacion_id) throws Exception{
try {
		Debug.PushSubsStack("qryInsertDevices (gemivglobals) ","gemivglobals",1,_ba,gemivglobals.mostCurrent,27);
if (RapidSub.canDelegate("qryinsertdevices")) { return b4a.gemiv.app.hub.gemivglobals.remoteMe.runUserSub(false, "gemivglobals","qryinsertdevices", _ba, _name, _ip, _mac, _habitacion_id);}
RemoteObject _qryheader = RemoteObject.createImmutable("");
RemoteObject _qrybody = RemoteObject.createImmutable("");
;
Debug.locals.put("name", _name);
Debug.locals.put("ip", _ip);
Debug.locals.put("mac", _mac);
Debug.locals.put("habitacion_id", _habitacion_id);
 BA.debugLineNum = 27;BA.debugLine="Public Sub qryInsertDevices(name As String,ip As S";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Dim qryHeader As String = \" INSERT INTO gemiv_dis";
Debug.ShouldStop(134217728);
_qryheader = BA.ObjectToString(" INSERT INTO gemiv_dispositivos (ip,mac,nombre,habitacion_id) ");Debug.locals.put("qryHeader", _qryheader);Debug.locals.put("qryHeader", _qryheader);
 BA.debugLineNum = 29;BA.debugLine="Dim qryBody   As String = \" VALUES ('\"&ip&\"', '\"&";
Debug.ShouldStop(268435456);
_qrybody = RemoteObject.concat(RemoteObject.createImmutable(" VALUES ('"),_ip,RemoteObject.createImmutable("', '"),_mac,RemoteObject.createImmutable("', '"),_name,RemoteObject.createImmutable("', "),_habitacion_id,RemoteObject.createImmutable(")"));Debug.locals.put("qryBody", _qrybody);Debug.locals.put("qryBody", _qrybody);
 BA.debugLineNum = 30;BA.debugLine="Return qryHeader & qryBody";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.concat(_qryheader,_qrybody);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}