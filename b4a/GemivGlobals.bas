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
	Dim comandos()  	As String
	Dim comando	 		As String
	Dim habitaciones()  As String
	Dim habitacion	 	As String
	Dim perifericos()  	As String
	Dim periferico	 	As String
	comando				= ""
	comandos 			= Array As String("prender","apagar")
	habitacion			=""
	habitaciones 		= Array As String("baño","dormitorio","cocina")
	periferico			=""
	perifericos 		= Array As String("luz","aire","ventilador")
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

Public Sub getTextToSpeech(text As String) As String
	Dim palabras() As String
	Dim pregunta As String
	Dim palabras() As String = Regex.Split(" ",text)
	For i=0 To palabras.Length-1
		Dim list1 As List
		list1.Initialize2(comandos)
		If list1.IndexOf(palabras(i).ToLowerCase) <> -1 Then
			comando=palabras(i)
		End If
		list1.Initialize2(habitaciones)
		If list1.IndexOf(palabras(i).ToLowerCase) <> -1  Then
			habitacion=palabras(i)
		End If
		list1.Initialize2(perifericos)
		If list1.IndexOf(palabras(i).ToLowerCase) <> -1  Then
			periferico=palabras(i)
		End If
	Next
	pregunta="¿"
	If comando="" Then
		pregunta=pregunta&"que quiere hacer"
	End If
	If habitacion="" Then
		pregunta=pregunta&" en cual habitación"
	End If
	If periferico="" Then
		pregunta=pregunta&" en cual periférico"
	End If
	pregunta=pregunta&"?"
	If pregunta.Length>2 Then
		Return pregunta
	Else
		Return ""
	End If
	
End Sub