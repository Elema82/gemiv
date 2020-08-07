package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gemivdbmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.gemiv.app.hub.gemivdbmanager");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _database = null;
public String _dbsubdirectory = "";
public String _dbdirectory = "";
public String _dbname = "";
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivdbmanager __ref,anywheresoftware.b4a.BA _ba,String _subdir,String _namedb) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_subdir,_namedb}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub Initialize(subDir As String, nameDB As";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="dbSubdirectory 	= subDir";
__ref._dbsubdirectory /*String*/  = _subdir;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="dbName			= nameDB";
__ref._dbname /*String*/  = _namedb;
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="dbDirectory 	= File.DirRootExternal&\"/\"&dbSubdire";
__ref._dbdirectory /*String*/  = __c.File.getDirRootExternal()+"/"+__ref._dbsubdirectory /*String*/ ;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="If File.Exists(File.DirRootExternal,dbSubdirector";
if (__c.File.Exists(__c.File.getDirRootExternal(),__ref._dbsubdirectory /*String*/ )==__c.False) { 
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="File.MakeDir(File.DirRootExternal,dbSubdirectory";
__c.File.MakeDir(__c.File.getDirRootExternal(),__ref._dbsubdirectory /*String*/ );
 };
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="If File.Exists(dbDirectory,dbName) = False Then";
if (__c.File.Exists(__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ )==__c.False) { 
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="File.Copy(File.DirAssets, dbName, dbDirectory, d";
__c.File.Copy(__c.File.getDirAssets(),__ref._dbname /*String*/ ,__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ );
 };
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="connectDataBase";
__ref._connectdatabase /*String*/ (null);
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="End Sub";
return "";
}
public String  _logdefaultdirs(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "logdefaultdirs", false))
	 {return ((String) Debug.delegate(ba, "logdefaultdirs", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub logDefaultDirs()";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Log(\"DirAssets: \"&File.DirAssets)";
__c.LogImpl("54194305","DirAssets: "+__c.File.getDirAssets(),0);
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Log(\"DirDefaultExternal: \"&File.DirDefaultExterna";
__c.LogImpl("54194306","DirDefaultExternal: "+__c.File.getDirDefaultExternal(),0);
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Log(\"DirInternal: \"&File.DirInternal)";
__c.LogImpl("54194307","DirInternal: "+__c.File.getDirInternal(),0);
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Log(\"DirInternalCache: \"&File.DirInternalCache)";
__c.LogImpl("54194308","DirInternalCache: "+__c.File.getDirInternalCache(),0);
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Log(\"DirRootExternal: \"&File.DirRootExternal)";
__c.LogImpl("54194309","DirRootExternal: "+__c.File.getDirRootExternal(),0);
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="End Sub";
return "";
}
public boolean  _execnonquerystatment(b4a.gemiv.app.hub.gemivdbmanager __ref,String _query) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "execnonquerystatment", false))
	 {return ((Boolean) Debug.delegate(ba, "execnonquerystatment", new Object[] {_query}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub ExecNonQueryStatment(query As String) A";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
if ((_query== null || _query.length()<=0)) { 
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="dataBase.ExecNonQuery(query)";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_query);
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim dataBase 			As SQL";
_database = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Public dbSubdirectory 	As String";
_dbsubdirectory = "";
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Public dbDirectory 		As String";
_dbdirectory = "";
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Public dbName 			As String";
_dbname = "";
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="End Sub";
return "";
}
public String  _connectdatabase(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "connectdatabase", false))
	 {return ((String) Debug.delegate(ba, "connectdatabase", null));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub connectDataBase";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="dataBase.Initialize(dbDirectory,dbName,True)";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ ,__c.True);
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _execquerystatment(b4a.gemiv.app.hub.gemivdbmanager __ref,String _query) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "execquerystatment", false))
	 {return ((anywheresoftware.b4a.sql.SQL.CursorWrapper) Debug.delegate(ba, "execquerystatment", new Object[] {_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub ExecQueryStatment(query As String) As C";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
if ((_query== null || _query.length()<=0)) { 
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__c.Null));
 };
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="cursor = dataBase.ExecQuery(query)";
_cursor.setObject((android.database.Cursor)(__ref._database /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_query)));
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Return cursor";
if (true) return _cursor;
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="End Sub";
return null;
}
}