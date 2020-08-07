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
public b4a.gemiv.app.hub.dbutils _dbutils = null;
public String  _initialize(b4a.gemiv.app.hub.gemivdbmanager __ref,anywheresoftware.b4a.BA _ba,String _subdir,String _namedb) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_subdir,_namedb}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Initialize(subDir As String, nameDB As";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="dbSubdirectory 	= subDir";
__ref._dbsubdirectory /*String*/  = _subdir;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="dbName			= nameDB";
__ref._dbname /*String*/  = _namedb;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="dbDirectory 	= File.DirRootExternal&\"/\"&dbSubdire";
__ref._dbdirectory /*String*/  = __c.File.getDirRootExternal()+"/"+__ref._dbsubdirectory /*String*/ ;
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="If File.Exists(File.DirRootExternal,dbSubdirector";
if (__c.File.Exists(__c.File.getDirRootExternal(),__ref._dbsubdirectory /*String*/ )==__c.False) { 
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="File.MakeDir(File.DirRootExternal,dbSubdirectory";
__c.File.MakeDir(__c.File.getDirRootExternal(),__ref._dbsubdirectory /*String*/ );
 };
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="If File.Exists(dbDirectory,dbName) = False Then";
if (__c.File.Exists(__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ )==__c.False) { 
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="File.Copy(File.DirAssets, dbName, dbDirectory, d";
__c.File.Copy(__c.File.getDirAssets(),__ref._dbname /*String*/ ,__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ );
 };
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="connectDataBase";
__ref._connectdatabase /*String*/ (null);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="End Sub";
return "";
}
public String  _logdefaultdirs(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "logdefaultdirs", false))
	 {return ((String) Debug.delegate(ba, "logdefaultdirs", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub logDefaultDirs()";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Log(\"DirAssets: \"&File.DirAssets)";
__c.LogImpl("05242881","DirAssets: "+__c.File.getDirAssets(),0);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Log(\"DirDefaultExternal: \"&File.DirDefaultExterna";
__c.LogImpl("05242882","DirDefaultExternal: "+__c.File.getDirDefaultExternal(),0);
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Log(\"DirInternal: \"&File.DirInternal)";
__c.LogImpl("05242883","DirInternal: "+__c.File.getDirInternal(),0);
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="Log(\"DirInternalCache: \"&File.DirInternalCache)";
__c.LogImpl("05242884","DirInternalCache: "+__c.File.getDirInternalCache(),0);
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Log(\"DirRootExternal: \"&File.DirRootExternal)";
__c.LogImpl("05242885","DirRootExternal: "+__c.File.getDirRootExternal(),0);
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim dataBase 			As SQL";
_database = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Public dbSubdirectory 	As String";
_dbsubdirectory = "";
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Public dbDirectory 		As String";
_dbdirectory = "";
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Public dbName 			As String";
_dbname = "";
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="End Sub";
return "";
}
public String  _connectdatabase(b4a.gemiv.app.hub.gemivdbmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "connectdatabase", false))
	 {return ((String) Debug.delegate(ba, "connectdatabase", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub connectDataBase";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="dataBase.Initialize(dbDirectory,dbName,True)";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__ref._dbdirectory /*String*/ ,__ref._dbname /*String*/ ,__c.True);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public String  _createdevices(b4a.gemiv.app.hub.gemivdbmanager __ref,String _ip,String _mac,String _nombre,int _habitacion) throws Exception{
__ref = this;
RDebugUtils.currentModule="gemivdbmanager";
if (Debug.shouldDelegate(ba, "createdevices", false))
	 {return ((String) Debug.delegate(ba, "createdevices", new Object[] {_ip,_mac,_nombre,_habitacion}));}
String _insertheader = "";
String _insertfields = "";
String _query = "";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub createDevices(ip As String, mac As Stri";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim insertHeader As String = \"insert into gemiv_d";
_insertheader = "insert into gemiv_dispositivos(ip,mac,nombre,habitacion_id) ";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim insertFields As String = \"values (\" & ip & \",";
_insertfields = "values ("+_ip+", "+_mac+", "+_nombre+",  "+BA.ObjectToString(__c.Chr(_habitacion))+")";
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim query 		 As String = insertHeader & insertFie";
_query = _insertheader+_insertfields;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="dataBase.ExecNonQuery(query)";
__ref._database /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_query);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="End Sub";
return "";
}
}