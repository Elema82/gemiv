package b4a.gemiv.app.hub;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gemivdbmanager_subs_0 {


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
		Debug.PushSubsStack("connectDataBase (gemivdbmanager) ","gemivdbmanager",4,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("connectdatabase")) { return __ref.runUserSub(false, "gemivdbmanager","connectdatabase", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Public Sub connectDataBase";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="dataBase.Initialize(dbDirectory,dbName,True)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_database" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_dbdirectory" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ )),(Object)(gemivdbmanager.__c.getField(true,"True")));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _subdir,RemoteObject _namedb) throws Exception{
try {
		Debug.PushSubsStack("Initialize (gemivdbmanager) ","gemivdbmanager",4,__ref.getField(false, "ba"),__ref,9);
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
 BA.debugLineNum = 13;BA.debugLine="Log(\"DirAssets: \"&File.DirAssets)";
Debug.ShouldStop(4096);
gemivdbmanager.__c.runVoidMethod ("LogImpl","32293764",RemoteObject.concat(RemoteObject.createImmutable("DirAssets: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirAssets")),0);
 BA.debugLineNum = 14;BA.debugLine="Log(\"DirDefaultExternal: \"&File.DirDefaultExterna";
Debug.ShouldStop(8192);
gemivdbmanager.__c.runVoidMethod ("LogImpl","32293765",RemoteObject.concat(RemoteObject.createImmutable("DirDefaultExternal: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),0);
 BA.debugLineNum = 15;BA.debugLine="Log(\"DirInternal: \"&File.DirInternal)";
Debug.ShouldStop(16384);
gemivdbmanager.__c.runVoidMethod ("LogImpl","32293766",RemoteObject.concat(RemoteObject.createImmutable("DirInternal: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirInternal")),0);
 BA.debugLineNum = 16;BA.debugLine="Log(\"DirInternalCache: \"&File.DirInternalCache)";
Debug.ShouldStop(32768);
gemivdbmanager.__c.runVoidMethod ("LogImpl","32293767",RemoteObject.concat(RemoteObject.createImmutable("DirInternalCache: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),0);
 BA.debugLineNum = 17;BA.debugLine="Log(\"DirRootExternal: \"&File.DirRootExternal)";
Debug.ShouldStop(65536);
gemivdbmanager.__c.runVoidMethod ("LogImpl","32293768",RemoteObject.concat(RemoteObject.createImmutable("DirRootExternal: "),gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),0);
 BA.debugLineNum = 18;BA.debugLine="If File.Exists(File.DirRootExternal,dbSubdirector";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",gemivdbmanager.__c.getField(false,"File").runMethod(true,"Exists",(Object)(gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(__ref.getField(true,"_dbsubdirectory" /*RemoteObject*/ ))),gemivdbmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 19;BA.debugLine="File.MakeDir(File.DirRootExternal,dbSubdirectory";
Debug.ShouldStop(262144);
gemivdbmanager.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(__ref.getField(true,"_dbsubdirectory" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 21;BA.debugLine="If File.Exists(dbDirectory,dbName) = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",gemivdbmanager.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_dbdirectory" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ ))),gemivdbmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 22;BA.debugLine="File.Copy(File.DirAssets, dbName, dbDirectory, d";
Debug.ShouldStop(2097152);
gemivdbmanager.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(gemivdbmanager.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbdirectory" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dbname" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 24;BA.debugLine="connectDataBase";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.gemiv.app.hub.gemivdbmanager.class, "_connectdatabase" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}