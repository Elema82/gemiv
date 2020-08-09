B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.801
@EndOfDesignText@
Sub Class_Globals
	Private textToSpeech 			As TTS
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	textToSpeech.Initialize("TTS")
End Sub

Public Sub getTextToSpeech As TTS
	Return textToSpeech
End Sub

Public Sub speak(text As String,clear As Boolean)
	textToSpeech.Speak(text,clear)
End Sub