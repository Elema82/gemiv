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
	Dim voiceRec 		As GemivSpeechReconigtion
	Dim udpCom			As GemivUdpComunication
	Dim dbManager		As GemivDBManager
	Dim runtimeAdmin	As RuntimePermissions
	Dim text2Speech		As GemivTTS
	'------------------------------------------------'
	Dim comandos()  	As String
	Dim comando	 		As String
	Dim habitaciones()  As String
	Dim habitacion	 	As String
	Dim perifericos()  	As String
	Dim periferico	 	As String
	'-------------------------------------------------'
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

Public Sub qryDeleteDevicesByName(name As String) As String
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

Public Sub createFirstTimeDBStructure
	Dim qry As String
	If isDbConfigurada Then
		Return
	End If
	dbManager.beginTransaction
	Try
		'----Insertar registro de configuracion---------------------------------'
		If Not(existConfiguraciones) Then
			qry = " insert into gemiv_configuraciones (db_configurada,gemiv_version_actual) values (0, '') "
			dbManager.ExecNonQueryStatment(qry)
		End If
		'----Insertar comandos---------------------------------'
		Dim insertComandos As String = "insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (1,'prender','prender')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (2,'apagar','apagar')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_comandos(comando_id,nombre,nombre_en_dispositivo) values (3,'intensidad','intensidad')"
		dbManager.ExecNonQueryStatment(insertComandos)
		'----Insertar Sinonimos-------------------------------'
		insertComandos  = "insert into gemiv_sinonimos(comando_id,sinonimo) values (1,'encender')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_sinonimos(comando_id,sinonimo) values (1,'activar')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_sinonimos(comando_id,sinonimo) values (3,'nivel')"
		dbManager.ExecNonQueryStatment(insertComandos)
		'----Insertar Tipo de Dispositivos-------------------'
		insertComandos  = "insert into gemiv_tipoperifericos(tipoperiferico_id,nombre) values (1,'ON/OFF')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_tipoperifericos(tipoperiferico_id,nombre) values (2,'DIMMER')"
		dbManager.ExecNonQueryStatment(insertComandos)
		'----Insertar Relacion Dispositivos Tipos------------'
		insertComandos  = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (1,1)"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (1,2)"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,1)"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,2)"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_tipoperifericos_comandos(tipoperiferico_id,comando_id) values (2,3)"
		dbManager.ExecNonQueryStatment(insertComandos)
		'----Insertar Habitaciones-----------------------'
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Living')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Cocina')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Comedor')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Baño')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Dormitorio 1')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Dormitorio 2')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Patio')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Lavadero')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Garage')"
		dbManager.ExecNonQueryStatment(insertComandos)
		insertComandos  = "insert into gemiv_habitaciones(nombre) values ('Porche')"
		dbManager.ExecNonQueryStatment(insertComandos)
		'----Actualizar estados de Configuracion-----------------------'
		insertComandos = " update gemiv_configuraciones set db_configurada = 1 "
		dbManager.ExecNonQueryStatment(insertComandos)
		dbManager.sucessfulTransaction
	Catch
		Log(LastException)
	End Try
	dbManager.endTransaction
End Sub

Public Sub createPerifericos(dispositivo_id As Int) As Boolean
	Dim insertComandos As String
	dbManager.beginTransaction
	Try
		For i = 1 To 10
			insertComandos  = "insert into gemiv_perifericos(dispositivo_id,pin) values ("&dispositivo_id&","&i&")"
			dbManager.ExecNonQueryStatment(insertComandos)
		Next
		dbManager.sucessfulTransaction
	Catch
		Log(LastException)
		Return False
	End Try
	dbManager.endTransaction
	Return True
End Sub

Public Sub getLastDispositivoId As Int
	Dim selectDispositivo As String = "select dispositivo_id from gemiv_dispositivos order by dispositivo_id desc limit 1"
	Dim response As Cursor = dbManager.ExecQueryStatment(selectDispositivo)
	If response.RowCount > 0 Then
		response.Position = 0
		Return response.GetInt("dispositivo_id")
	End If
	Return 0
End Sub

Public Sub processDispositivo(mac As String,ip As String)
	Dim qry As String
	If existMac(mac) Then
		Try
			qry = "update gemiv_dispositivos set ip = '"&ip&"' where mac like '"&mac&"'"
			dbManager.ExecNonQueryStatment(qry)
		Catch
			Log(LastException)
		End Try
	Else
		qry  = qryInsertDevices("",ip,mac,0)
		Try
			dbManager.ExecNonQueryStatment(qry)
			Dim dispositivo_id As Int = getLastDispositivoId
			If dispositivo_id > 0 Then
				createPerifericos(dispositivo_id)
			End If
		Catch
			Log(LastException)
		End Try
	End If
End Sub

Public Sub existMac(mac As String) As Boolean
	Dim selectDispositivo As String = "select dispositivo_id from gemiv_dispositivos where mac like '"&mac&"'"
	Dim response As Cursor = dbManager.ExecQueryStatment(selectDispositivo)
	If response.RowCount > 0 Then
		Return True
	End If
	Return False
End Sub

Public Sub existConfiguraciones As Boolean
	Dim selectConfiguraciones As String = "select * from gemiv_configuraciones"
	Dim response As Cursor = dbManager.ExecQueryStatment(selectConfiguraciones)
	If response.RowCount > 0 Then
		Return True
	End If
	Return False
End Sub

Public Sub isDbConfigurada As Boolean
	Dim selectConfiguraciones As String = "select db_configurada from gemiv_configuraciones"
	Dim response As Cursor = dbManager.ExecQueryStatment(selectConfiguraciones)
	If response.RowCount > 0 Then
		response.Position = 0
		Dim dbConfigurada As Int= response.GetInt("db_configurada")
		If (dbConfigurada = 1) Then
			Return True
		End If
		Return False
	End If
	Return False
End Sub
