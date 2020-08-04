
package b4a.gemiv.app.hub;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class gemivdbmanager {
    public static RemoteObject myClass;
	public gemivdbmanager() {
	}
    public static PCBA staticBA = new PCBA(null, gemivdbmanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _database = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _dbsubdirectory = RemoteObject.createImmutable("");
public static RemoteObject _dbdirectory = RemoteObject.createImmutable("");
public static RemoteObject _dbname = RemoteObject.createImmutable("");
public static b4a.gemiv.app.hub.main _main = null;
public static b4a.gemiv.app.hub.starter _starter = null;
public static b4a.gemiv.app.hub.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"dataBase",_ref.getField(false, "_database"),"dbDirectory",_ref.getField(false, "_dbdirectory"),"dbName",_ref.getField(false, "_dbname"),"dbSubdirectory",_ref.getField(false, "_dbsubdirectory")};
}
}