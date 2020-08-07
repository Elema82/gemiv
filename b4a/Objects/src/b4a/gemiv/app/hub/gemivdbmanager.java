package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivdbmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivdbmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.gemiv.app.hub.gemivdbmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _database = null;
public String _dbsubdirectory = "";
public String _dbdirectory = "";
public String _dbname = "";
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim dataBase 			As SQL";
_database = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 3;BA.debugLine="Public dbSubdirectory 	As String";
_dbsubdirectory = "";
 //BA.debugLineNum = 4;BA.debugLine="Public dbDirectory 		As String";
_dbdirectory = "";
 //BA.debugLineNum = 5;BA.debugLine="Public dbName 			As String";
_dbname = "";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _connectdatabase() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub connectDataBase";
 //BA.debugLineNum = 23;BA.debugLine="dataBase.Initialize(dbDirectory,dbName,True)";
_database.Initialize(_dbdirectory,_dbname,__c.True);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public boolean  _execnonquerystatment(String _query) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub ExecNonQueryStatment(query As String) A";
 //BA.debugLineNum = 27;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
if ((_query== null || _query.length()<=0)) { 
 //BA.debugLineNum = 28;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 30;BA.debugLine="dataBase.ExecNonQuery(query)";
_database.ExecNonQuery(_query);
 //BA.debugLineNum = 31;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _execquerystatment(String _query) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub ExecQueryStatment(query As String) As C";
 //BA.debugLineNum = 35;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
if ((_query== null || _query.length()<=0)) { 
 //BA.debugLineNum = 36;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__c.Null));
 };
 //BA.debugLineNum = 38;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 39;BA.debugLine="cursor = dataBase.ExecQuery(query)";
_cursor.setObject((android.database.Cursor)(_database.ExecQuery(_query)));
 //BA.debugLineNum = 40;BA.debugLine="Return cursor";
if (true) return _cursor;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _subdir,String _namedb) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(subDir As String, nameDB As";
 //BA.debugLineNum = 10;BA.debugLine="dbSubdirectory 	= subDir";
_dbsubdirectory = _subdir;
 //BA.debugLineNum = 11;BA.debugLine="dbName			= nameDB";
_dbname = _namedb;
 //BA.debugLineNum = 12;BA.debugLine="dbDirectory 	= File.DirRootExternal&\"/\"&dbSubdire";
_dbdirectory = __c.File.getDirRootExternal()+"/"+_dbsubdirectory;
 //BA.debugLineNum = 13;BA.debugLine="If File.Exists(File.DirRootExternal,dbSubdirector";
if (__c.File.Exists(__c.File.getDirRootExternal(),_dbsubdirectory)==__c.False) { 
 //BA.debugLineNum = 14;BA.debugLine="File.MakeDir(File.DirRootExternal,dbSubdirectory";
__c.File.MakeDir(__c.File.getDirRootExternal(),_dbsubdirectory);
 };
 //BA.debugLineNum = 16;BA.debugLine="If File.Exists(dbDirectory,dbName) = False Then";
if (__c.File.Exists(_dbdirectory,_dbname)==__c.False) { 
 //BA.debugLineNum = 17;BA.debugLine="File.Copy(File.DirAssets, dbName, dbDirectory, d";
__c.File.Copy(__c.File.getDirAssets(),_dbname,_dbdirectory,_dbname);
 };
 //BA.debugLineNum = 19;BA.debugLine="connectDataBase";
_connectdatabase();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _logdefaultdirs() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub logDefaultDirs()";
 //BA.debugLineNum = 44;BA.debugLine="Log(\"DirAssets: \"&File.DirAssets)";
__c.LogImpl("32555905","DirAssets: "+__c.File.getDirAssets(),0);
 //BA.debugLineNum = 45;BA.debugLine="Log(\"DirDefaultExternal: \"&File.DirDefaultExterna";
__c.LogImpl("32555906","DirDefaultExternal: "+__c.File.getDirDefaultExternal(),0);
 //BA.debugLineNum = 46;BA.debugLine="Log(\"DirInternal: \"&File.DirInternal)";
__c.LogImpl("32555907","DirInternal: "+__c.File.getDirInternal(),0);
 //BA.debugLineNum = 47;BA.debugLine="Log(\"DirInternalCache: \"&File.DirInternalCache)";
__c.LogImpl("32555908","DirInternalCache: "+__c.File.getDirInternalCache(),0);
 //BA.debugLineNum = 48;BA.debugLine="Log(\"DirRootExternal: \"&File.DirRootExternal)";
__c.LogImpl("32555909","DirRootExternal: "+__c.File.getDirRootExternal(),0);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
