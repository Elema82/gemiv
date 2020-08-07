B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.801
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Public Sub qryInsertDevices(name As String,ip As String, mac As String, habitacion_id As Int) As String
	Dim qryHeader As String = " INSERT INTO gemiv_dispositivos (ip,mac,nombre,habitacion_id) "
	Dim qryBody   As String = " VALUES ('"&ip&"', '"&mac&"', '"&name&"', "&habitacion_id&")"
	Return qryHeader & qryBody
End Sub

Public Sub qryDeleteDevices(name As String) As String
	Dim qryHeader As String = " DELETE FROM  gemiv_dispositivos WHERE "
	Dim qryBody   As String = " nombre = '" & name & "'"
	Return qryHeader & qryBody
End Sub