B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.801
@EndOfDesignText@
Sub Class_Globals
	Private packet 			As UDPPacket
	Private socket 			As UDPSocket
	Private broadcastLan 	As String
	Private localPort 		As Int
	Private remotePort 		As Int
	Private srvSocket 		As ServerSocket
	Private receivePackSize As Int
	Private defaultPackSize As Int = 2048
	Type ReceivedData (data As String, ip As String)
	Private messageDatagram As ReceivedData
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(locPort As Int, remPort As Int, recPackSize As Int)
	localPort = locPort
	remotePort= remPort
	broadcastLan = getBroadcastIp
	Dim rPacksize As Int
	rPacksize = recPackSize
	If rPacksize = 0 Then
		rPacksize = defaultPackSize
	End If
	receivePackSize = rPacksize
	socket.Initialize("UDP",localPort,receivePackSize)
End Sub

Public Sub sendBroadcastUdp(msg As String)
	Dim data() As Byte = msg.GetBytes("UTF8")
	packet.Initialize(data,broadcastLan,remotePort)
	socket.Send(packet)
End Sub

Public Sub sendDirectUdp(msg As String,remIp As String, remPort As Int)
	Dim rPort As Int = remPort
	If rPort = 0 Then
		rPort = remotePort
	End If
	Dim data() As Byte = msg.GetBytes("UTF8")
	packet.Initialize(data,remIp,rPort)
	socket.Send(packet)
End Sub

Public Sub getMessageDatagram As ReceivedData
	Return messageDatagram
End Sub

Private Sub getBroadcastIp As String
	srvSocket.Initialize(0,"")
	Dim devIp As String = srvSocket.GetMyIP
	Dim devIpArray() As String 
	devIpArray = Regex.Split("\.",devIp)
	devIp = devIpArray(0) & "." & devIpArray(1) & "." & devIpArray(2) & ".255"
	Return devIp
End Sub

Public Sub setMessageDatagram(data As String,ip As String)
	messageDatagram.data = data
	messageDatagram.ip	 = ip
End Sub