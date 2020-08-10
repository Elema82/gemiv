package b4a.gemiv.app.hub;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbutils {
private static dbutils mostCurrent = new dbutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _dbfieldinfo{
public boolean IsInitialized;
public String FieldName;
public String DataType;
public boolean CanBeNull;
public Object DefValue;
public void Initialize() {
IsInitialized = true;
FieldName = "";
DataType = "";
CanBeNull = false;
DefValue = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
public b4a.gemiv.app.hub.main _main = null;
public b4a.gemiv.app.hub.gemivglobals _gemivglobals = null;
public b4a.gemiv.app.hub.starter _starter = null;
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "copydbfromassets", true))
	 {return ((String) Debug.delegate(null, "copydbfromassets", new Object[] {_ba,_filename}));}
String _targetdir = "";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim TargetDir As String = GetDBFolder";
_targetdir = _getdbfolder(_ba);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbfolder", true))
	 {return ((String) Debug.delegate(null, "getdbfolder", new Object[] {_ba}));}
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub GetDBFolder As String";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="If File.ExternalWritable Then Return rp.GetSafeDi";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
if (true) return _rp.GetSafeDirDefaultExternal("");}
else {
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirInternal();};
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "createtable", true))
	 {return ((String) Debug.delegate(null, "createtable", new Object[] {_ba,_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_ba,_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_ba,_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("93604494","CreateTable: "+_query,0);
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(anywheresoftware.b4a.BA _ba,String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "escapefield", true))
	 {return ((String) Debug.delegate(null, "escapefield", new Object[] {_ba,_f}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "deleterecord", true))
	 {return ((String) Debug.delegate(null, "deleterecord", new Object[] {_ba,_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_ba,_tablename)+" WHERE ");
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("94587525","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("94587535","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=4587537;
 //BA.debugLineNum = 4587537;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "droptable", true))
	 {return ((String) Debug.delegate(null, "droptable", new Object[] {_ba,_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_ba,_tablename);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("93670018","DropTable: "+_query,0);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executehtml", true))
	 {return ((String) Debug.delegate(null, "executehtml", new Object[] {_ba,_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("94259847","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=4259867;
 //BA.debugLineNum = 4259867;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4259868;
 //BA.debugLineNum = 4259868;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=4259869;
 //BA.debugLineNum = 4259869;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=4259870;
 //BA.debugLineNum = 4259870;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=4259871;
 //BA.debugLineNum = 4259871;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=4259873;
 //BA.debugLineNum = 4259873;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=4259875;
 //BA.debugLineNum = 4259875;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=4259876;
 //BA.debugLineNum = 4259876;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=4259877;
 //BA.debugLineNum = 4259877;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=4259878;
 //BA.debugLineNum = 4259878;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=4259879;
 //BA.debugLineNum = 4259879;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=4259880;
 //BA.debugLineNum = 4259880;BA.debugLine="sb.Append(\".stub'>\").Append(cur.GetString2(i))";
_sb.Append(".stub'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=4259882;
 //BA.debugLineNum = 4259882;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=4259884;
 //BA.debugLineNum = 4259884;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=4259886;
 //BA.debugLineNum = 4259886;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4259887;
 //BA.debugLineNum = 4259887;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=4259889;
 //BA.debugLineNum = 4259889;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=4259890;
 //BA.debugLineNum = 4259890;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=4259891;
 //BA.debugLineNum = 4259891;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=4259892;
 //BA.debugLineNum = 4259892;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executejson", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executejson", new Object[] {_ba,_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("94194312","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("94194327","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=4194331;
 //BA.debugLineNum = 4194331;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=4194334;
 //BA.debugLineNum = 4194334;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4194335;
 //BA.debugLineNum = 4194335;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=4194336;
 //BA.debugLineNum = 4194336;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=4194337;
 //BA.debugLineNum = 4194337;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=4194338;
 //BA.debugLineNum = 4194338;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executelist", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executememorytable", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executememorytable", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("93801094","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=3801105;
 //BA.debugLineNum = 3801105;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist2", true))
	 {return ((String) Debug.delegate(null, "executelist2", new Object[] {_ba,_sql,_query,_stringargs,_limit,_list}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="List.Clear";
_list.Clear();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_ba,_sql,_query,_stringargs,_limit));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="End Sub";
return "";
}
public static String  _executelistview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1,boolean _twolines) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelistview", true))
	 {return ((String) Debug.delegate(null, "executelistview", new Object[] {_ba,_sql,_query,_stringargs,_limit,_listview1,_twolines}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="ListView1.Clear";
_listview1.Clear();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="If TwoLines Then";
if (_twolines) { 
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
_listview1.AddTwoLines2(BA.ObjectToCharSequence(_cols[(int) (0)]),BA.ObjectToCharSequence(_cols[(int) (1)]),(Object)(_cols));
 }else {
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
_listview1.AddSingleLine2(BA.ObjectToCharSequence(_cols[(int) (0)]),(Object)(_cols));
 };
 }
};
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executemap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executemap", new Object[] {_ba,_sql,_query,_stringargs}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("93866632","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("93866634","No records found.",0);
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="End Sub";
return null;
}
public static String  _executespinner(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executespinner", true))
	 {return ((String) Debug.delegate(null, "executespinner", new Object[] {_ba,_sql,_query,_stringargs,_limit,_spinner1}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Spinner1.Clear";
_spinner1.Clear();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Spinner1.Add(Cols(0))";
_spinner1.Add(_cols[(int) (0)]);
 }
};
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbversion", true))
	 {return ((Integer) Debug.delegate(null, "getdbversion", new Object[] {_ba,_sql}));}
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim version As Int";
_version = 0;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="If TableExists(SQL, \"DBVersion\") Then";
if (_tableexists(_ba,_sql,"DBVersion")) { 
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_ba,_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="End Sub";
return 0;
}
public static boolean  _tableexists(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "tableexists", true))
	 {return ((Boolean) Debug.delegate(null, "tableexists", new Object[] {_ba,_sql,_tablename}));}
int _count = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub TableExists(SQL As SQL, TableName As St";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim count As Int = SQL.ExecQuerySingleResult2(\"SE";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult2("SELECT count(name) FROM sqlite_master WHERE type='table' AND name=? COLLATE NOCASE",new String[]{_tablename})));
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Return count > 0";
if (true) return _count>0;
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _getfieldsinfo(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _db,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getfieldsinfo", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getfieldsinfo", new Object[] {_ba,_db,_tablename}));}
anywheresoftware.b4a.objects.collections.List _lstfieldsinfo = null;
anywheresoftware.b4a.objects.collections.List _fieldslist = null;
String[] _values = null;
b4a.gemiv.app.hub.dbutils._dbfieldinfo _fieldinfo = null;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub GetFieldsInfo(DB As SQL, TableName As S";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim lstFieldsInfo As List";
_lstfieldsinfo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="lstFieldsInfo.Initialize";
_lstfieldsinfo.Initialize();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim FieldsList As List = ExecuteMemoryTable(DB, \"";
_fieldslist = new anywheresoftware.b4a.objects.collections.List();
_fieldslist = _executememorytable(_ba,_db,"PRAGMA table_info ('"+_tablename+"')",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="For Each values() As String In FieldsList";
{
final anywheresoftware.b4a.BA.IterableList group4 = _fieldslist;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_values = (String[])(group4.Get(index4));
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Dim FieldInfo As DBFieldInfo";
_fieldinfo = new b4a.gemiv.app.hub.dbutils._dbfieldinfo();
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="FieldInfo.Initialize";
_fieldinfo.Initialize();
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="FieldInfo.FieldName = values(1)";
_fieldinfo.FieldName /*String*/  = _values[(int) (1)];
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="FieldInfo.DataType = values(2)";
_fieldinfo.DataType /*String*/  = _values[(int) (2)];
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="FieldInfo.CanBeNull = (values(3) = 1)";
_fieldinfo.CanBeNull /*boolean*/  = ((_values[(int) (3)]).equals(BA.NumberToString(1)));
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="FieldInfo.DefValue = values(4)";
_fieldinfo.DefValue /*Object*/  = (Object)(_values[(int) (4)]);
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="lstFieldsInfo.Add(FieldInfo)";
_lstfieldsinfo.Add((Object)(_fieldinfo));
 }
};
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="Return lstFieldsInfo";
if (true) return _lstfieldsinfo;
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _gettables(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _db) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "gettables", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "gettables", new Object[] {_ba,_db}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub GetTables(DB As SQL) As List";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return ExecuteList(DB, \"SELECT name FROM sqlite_m";
if (true) return _executelist(_ba,_db,"SELECT name FROM sqlite_master WHERE type = 'table'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return null;
}
public static String  _insertmaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "insertmaps", true))
	 {return ((String) Debug.delegate(null, "insertmaps", new Object[] {_ba,_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("93735556","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="Try";
try {RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=3735569;
 //BA.debugLineNum = 3735569;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = _m.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=3735570;
 //BA.debugLineNum = 3735570;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=3735571;
 //BA.debugLineNum = 3735571;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=3735572;
 //BA.debugLineNum = 3735572;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=3735573;
 //BA.debugLineNum = 3735573;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=3735575;
 //BA.debugLineNum = 3735575;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_ba,_col));
RDebugUtils.currentLine=3735576;
 //BA.debugLineNum = 3735576;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=3735577;
 //BA.debugLineNum = 3735577;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=3735579;
 //BA.debugLineNum = 3735579;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=3735580;
 //BA.debugLineNum = 3735580;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("93735580","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=3735581;
 //BA.debugLineNum = 3735581;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=3735583;
 //BA.debugLineNum = 3735583;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e32) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e32);RDebugUtils.currentLine=3735585;
 //BA.debugLineNum = 3735585;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("93735585",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=3735591;
 //BA.debugLineNum = 3735591;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=3735593;
 //BA.debugLineNum = 3735593;BA.debugLine="End Sub";
return "";
}
public static String  _setdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "setdbversion", true))
	 {return ((String) Debug.delegate(null, "setdbversion", new Object[] {_ba,_sql,_version}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord", true))
	 {return ((String) Debug.delegate(null, "updaterecord", new Object[] {_ba,_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_ba,_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord2", true))
	 {return ((String) Debug.delegate(null, "updaterecord2", new Object[] {_ba,_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("94521986","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("94521990","Fields empty",0);
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_ba,_tablename)).Append(" SET ");
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_ba,_col)).Append("=?");
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("94522011","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=4522012;
 //BA.debugLineNum = 4522012;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="End Sub";
return "";
}
}