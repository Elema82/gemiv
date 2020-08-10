package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemivdbmanager_subs_0 {


public static RemoteObject  _begintransaction(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("beginTransaction (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("begintransaction")) { return __ref.runUserSub(false, "gemivdbmanager","begintransaction", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Public Sub beginTransaction";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="dataBase.BeginTransaction";
Debug.ShouldStop(67108864);
__ref.getField(false,"_database" /*RemoteObject*/ ).runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim dataBase 			As SQL";
gemivdbmanager._database = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_database",gemivdbmanager._database);
 //BA.debugLineNum = 3;BA.debugLine="Public dbSubdirectory 	As String";
gemivdbmanager._dbsubdirectory = RemoteObject.createImmutable("");__ref.setField("_dbsubdirectory",gemivdbmanager._dbsubdirectory);
 //BA.debugLineNum = 4;BA.debugLine="Public dbDirectory 		As String";
gemivdbmanager._dbdirectory = RemoteObject.createImmutable("");__ref.setField("_dbdirectory",gemivdbmanager._dbdirectory);
 //BA.debugLineNum = 5;BA.debugLine="Public dbName 			As String";
gemivdbmanager._dbname = RemoteObject.createImmutable("");__ref.setField("_dbname",gemivdbmanager._dbname);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _connectdatabase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("connectDataBase (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("connectdatabase")) { return __ref.runUserSub(false, "gemivdbmanager","connectdatabase", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub connectDataBase";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="dataBase.Initialize(dbDirectory,dbName,True)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_database" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_dbdirectory" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ )),(Object)(gemivdbmanager.__c.getField(true,"True")));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _endtransaction(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("endTransaction (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("endtransaction")) { return __ref.runUserSub(false, "gemivdbmanager","endtransaction", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub endTransaction";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="dataBase.EndTransaction";
Debug.ShouldStop(4);
__ref.getField(false,"_database" /*RemoteObject*/ ).runVoidMethod ("EndTransaction");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _execnonquerystatment(RemoteObject __ref,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("ExecNonQueryStatment (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("execnonquerystatment")) { return __ref.runUserSub(false, "gemivdbmanager","execnonquerystatment", __ref, _query);}
Debug.locals.put("query", _query);
 BA.debugLineNum = 39;BA.debugLine="Public Sub ExecNonQueryStatment(query As String) A";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("n",_query) || RemoteObject.solveBoolean("k",_query.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 41;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) return gemivdbmanager.__c.getField(true,"False");
 };
 BA.debugLineNum = 43;BA.debugLine="dataBase.ExecNonQuery(query)";
Debug.ShouldStop(1024);
__ref.getField(false,"_database" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 44;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return gemivdbmanager.__c.getField(true,"True");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _execquerystatment(RemoteObject __ref,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("ExecQueryStatment (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("execquerystatment")) { return __ref.runUserSub(false, "gemivdbmanager","execquerystatment", __ref, _query);}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("query", _query);
 BA.debugLineNum = 47;BA.debugLine="Public Sub ExecQueryStatment(query As String) As C";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("n",_query) || RemoteObject.solveBoolean("k",_query.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 49;BA.debugLine="Return Null";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), gemivdbmanager.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 51;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(262144);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 52;BA.debugLine="cursor = dataBase.ExecQuery(query)";
Debug.ShouldStop(524288);
_cursor.setObject(__ref.getField(false,"_database" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(_query)));
 BA.debugLineNum = 53;BA.debugLine="Return cursor";
Debug.ShouldStop(1048576);
if (true) return _cursor;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _subdir,RemoteObject _namedb) throws Exception{
try {
		Debug.PushSubsStack("Initialize (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "gemivdbmanager","initialize", __ref, _ba, _subdir, _namedb);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("subDir", _subdir);
Debug.locals.put("nameDB", _namedb);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(subDir As String, nameDB As";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="dbSubdirectory 	= subDir";
Debug.ShouldStop(512);
__ref.setField ("_dbsubdirectory" /*RemoteObject*/ ,_subdir);
 BA.debugLineNum = 11;BA.debugLine="dbName			= nameDB";
Debug.ShouldStop(1024);
__ref.setField ("_dbname" /*RemoteObject*/ ,_namedb);
 BA.debugLineNum = 12;BA.debugLine="dbDirectory 	= File.DirRootExternal&\"/\"&dbSubdire";
Debug.ShouldStop(2048);
__ref.setField ("_dbdirectory" /*RemoteObject*/ ,RemoteObject.concat(gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),RemoteObject.createImmutable("/"),__ref.getField(true,"_dbsubdirectory" /*RemoteObject*/ )));
 BA.debugLineNum = 13;BA.debugLine="If File.Exists(File.DirRootExternal,dbSubdirector";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",gemivdbmanager.__c.getField(false,"File").runMethod(true,"Exists",(Object)(gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(__ref.getField(true,"_dbsubdirectory" /*RemoteObject*/ ))),gemivdbmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 14;BA.debugLine="File.MakeDir(File.DirRootExternal,dbSubdirectory";
Debug.ShouldStop(8192);
gemivdbmanager.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(__ref.getField(true,"_dbsubdirectory" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 16;BA.debugLine="If File.Exists(dbDirectory,dbName) = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",gemivdbmanager.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_dbdirectory" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ ))),gemivdbmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 17;BA.debugLine="File.Copy(File.DirAssets, dbName, dbDirectory, d";
Debug.ShouldStop(65536);
gemivdbmanager.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbdirectory" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 19;BA.debugLine="connectDataBase";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_connectdatabase" /*RemoteObject*/ );
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logdefaultdirs(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("logDefaultDirs (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("logdefaultdirs")) { return __ref.runUserSub(false, "gemivdbmanager","logdefaultdirs", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Public Sub logDefaultDirs()";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Log(\"DirAssets: \"&File.DirAssets)";
Debug.ShouldStop(16777216);
gemivdbmanager.__c.runVoidMethod ("LogImpl","11966081",RemoteObject.concat(RemoteObject.createImmutable("DirAssets: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirAssets")),0);
 BA.debugLineNum = 58;BA.debugLine="Log(\"DirDefaultExternal: \"&File.DirDefaultExterna";
Debug.ShouldStop(33554432);
gemivdbmanager.__c.runVoidMethod ("LogImpl","11966082",RemoteObject.concat(RemoteObject.createImmutable("DirDefaultExternal: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),0);
 BA.debugLineNum = 59;BA.debugLine="Log(\"DirInternal: \"&File.DirInternal)";
Debug.ShouldStop(67108864);
gemivdbmanager.__c.runVoidMethod ("LogImpl","11966083",RemoteObject.concat(RemoteObject.createImmutable("DirInternal: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirInternal")),0);
 BA.debugLineNum = 60;BA.debugLine="Log(\"DirInternalCache: \"&File.DirInternalCache)";
Debug.ShouldStop(134217728);
gemivdbmanager.__c.runVoidMethod ("LogImpl","11966084",RemoteObject.concat(RemoteObject.createImmutable("DirInternalCache: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),0);
 BA.debugLineNum = 61;BA.debugLine="Log(\"DirRootExternal: \"&File.DirRootExternal)";
Debug.ShouldStop(268435456);
gemivdbmanager.__c.runVoidMethod ("LogImpl","11966085",RemoteObject.concat(RemoteObject.createImmutable("DirRootExternal: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),0);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sucessfultransaction(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("sucessfulTransaction (gemivdbmanager) ","gemivdbmanager",2,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("sucessfultransaction")) { return __ref.runUserSub(false, "gemivdbmanager","sucessfultransaction", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Public Sub sucessfulTransaction";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="dataBase.TransactionSuccessful";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_database" /*RemoteObject*/ ).runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}