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
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.starter _starter = null;
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivdbmanager __ref,anywheresoftware.b4a.BA _ba,String _subdir,String _namedb) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_subdir,_namedb}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Initialize(subDir As String, nameDB As";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="dbSubdirectory 	= subDir";
__ref._dbsubdirectory /*String*/  = _subdir;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="dbName			= nameDB";
__ref._dbname /*String*/  = _namedb;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="dbDirectory 	= File.DirRootExternal&\"/\"&dbSubdire";
__ref._dbdirectory /*String*/  = __c.File.getDirRootExternal()+"/"+__ref._dbsubdirectory /*String*/ ;
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="If File.Exists(File.DirRootExternal,dbSubdirector";
if (__c.File.Exists(__c.File.getDirRootExternal(),__ref._dbsubdirectory /*String*/ )==__c.False) { 
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="File.MakeDir(File.DirRootExternal,dbSubdirectory";
__c.File.MakeDir(__c.File.getDirRootExternal(),__ref._dbsubdirectory /*String*/ );
 };
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="If File.Exists(dbDirectory,dbName) = False Then";
if (__c.File.Exists(__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ )==__c.False) { 
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="File.Copy(File.DirAssets, dbName, dbDirectory, d";
__c.File.Copy(__c.File.getDirAssets(),__ref._dbname /*String*/ ,__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ );
 };
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="connectDataBase";
__ref._connectdatabase /*String*/ (null);
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="End Sub";
return "";
}
public boolean  _execnonquerystatment(b4a.gemiv.app.hub.gemivdbmanager __ref,String _query) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "execnonquerystatment", false))
	 {return ((Boolean) Debug.delegate(ba, "execnonquerystatment", new Object[] {_query}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub ExecNonQueryStatment(query As String) A";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
if ((_query== null || _query.length()<=0)) { 
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="dataBase.ExecNonQuery(query)";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_query);
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="End Sub";
return false;
}
public String  _begintransaction(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "begintransaction", false))
	 {return ((String) Debug.delegate(ba, "begintransaction", null));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub beginTransaction";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="dataBase.BeginTransaction";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public String  _sucessfultransaction(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "sucessfultransaction", false))
	 {return ((String) Debug.delegate(ba, "sucessfultransaction", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub sucessfulTransaction";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="dataBase.TransactionSuccessful";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public String  _endtransaction(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "endtransaction", false))
	 {return ((String) Debug.delegate(ba, "endtransaction", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub endTransaction";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="dataBase.EndTransaction";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .EndTransaction();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _execquerystatment(b4a.gemiv.app.hub.gemivdbmanager __ref,String _query) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "execquerystatment", false))
	 {return ((anywheresoftware.b4a.sql.SQL.CursorWrapper) Debug.delegate(ba, "execquerystatment", new Object[] {_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub ExecQueryStatment(query As String) As C";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If (query = Null Or query.Length <= 0) Then";
if ((_query== null || _query.length()<=0)) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__c.Null));
 };
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="cursor = dataBase.ExecQuery(query)";
_cursor.setObject((android.database.Cursor)(__ref._database /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_query)));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Return cursor";
if (true) return _cursor;
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim dataBase 			As SQL";
_database = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Public dbSubdirectory 	As String";
_dbsubdirectory = "";
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Public dbDirectory 		As String";
_dbdirectory = "";
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Public dbName 			As String";
_dbname = "";
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="End Sub";
return "";
}
public String  _connectdatabase(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "connectdatabase", false))
	 {return ((String) Debug.delegate(ba, "connectdatabase", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub connectDataBase";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="dataBase.Initialize(dbDirectory,dbName,True)";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ ,__c.True);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _logdefaultdirs(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "logdefaultdirs", false))
	 {return ((String) Debug.delegate(ba, "logdefaultdirs", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub logDefaultDirs()";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Log(\"DirAssets: \"&File.DirAssets)";
__c.LogImpl("11966081","DirAssets: "+__c.File.getDirAssets(),0);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Log(\"DirDefaultExternal: \"&File.DirDefaultExterna";
__c.LogImpl("11966082","DirDefaultExternal: "+__c.File.getDirDefaultExternal(),0);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Log(\"DirInternal: \"&File.DirInternal)";
__c.LogImpl("11966083","DirInternal: "+__c.File.getDirInternal(),0);
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Log(\"DirInternalCache: \"&File.DirInternalCache)";
__c.LogImpl("11966084","DirInternalCache: "+__c.File.getDirInternalCache(),0);
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Log(\"DirRootExternal: \"&File.DirRootExternal)";
__c.LogImpl("11966085","DirRootExternal: "+__c.File.getDirRootExternal(),0);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="End Sub";
return "";
}
}