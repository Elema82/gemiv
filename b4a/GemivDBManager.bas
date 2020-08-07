B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.801
@EndOfDesignText@
Sub Class_Globals
	Dim dataBase 			As SQL
	Public dbSubdirectory 	As String	
	Public dbDirectory 		As String 
	Public dbName 			As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(subDir As String, nameDB As String)
	dbSubdirectory 	= subDir
	dbName			= nameDB
	dbDirectory 	= File.DirRootExternal&"/"&dbSubdirectory
	If File.Exists(File.DirRootExternal,dbSubdirectory) = False Then
		File.MakeDir(File.DirRootExternal,dbSubdirectory)
	End If
	If File.Exists(dbDirectory,dbName) = False Then
		File.Copy(File.DirAssets, dbName, dbDirectory, dbName)
	End If
	connectDataBase
End Sub

Public Sub connectDataBase
	dataBase.Initialize(dbDirectory,dbName,True)
End Sub

Public Sub ExecNonQueryStatment(query As String) As Boolean
	If (query = Null Or query.Length <= 0) Then
		Return False
	End If
	dataBase.ExecNonQuery(query)
	Return True
End Sub

Public Sub ExecQueryStatment(query As String) As Cursor
	If (query = Null Or query.Length <= 0) Then
		Return Null
	End If
	Dim cursor As Cursor
	cursor = dataBase.ExecQuery(query)
	Return cursor
End Sub

Public Sub logDefaultDirs()
	Log("DirAssets: "&File.DirAssets)
	Log("DirDefaultExternal: "&File.DirDefaultExternal)
	Log("DirInternal: "&File.DirInternal)
	Log("DirInternalCache: "&File.DirInternalCache)
	Log("DirRootExternal: "&File.DirRootExternal)
End Sub
