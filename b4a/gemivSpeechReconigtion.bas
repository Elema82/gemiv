B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.801
@EndOfDesignText@
Sub Class_Globals
	Private recognizedText As List
	Private recognizedLanguage As String
	Private recPromptText As String
	Private VR As VoiceRecognition
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(recLang As String, recPrompt As String)
	VR.Initialize("VR")
	recognizedLanguage = recLang
	If Not(recLang = Null) Then
		VR.Language = "es"
	End If
	recPromptText = recPrompt
	VR.Prompt = recPrompt
End Sub

Public Sub RecognizeVoice As ResumableSub
	VR.Listen
	Wait For VR_Result (Success As Boolean, Texts As List)
	If Success And Texts.Size > 0 Then
		Return Texts.Get(0)
	End If
	Return ""
End Sub

Public Sub listenSpeech
	VR.Listen
End Sub

Public Sub getRecognizedText As List
	Return recognizedText
End Sub

Public Sub getReconigzedLanguage As String
	Return recognizedLanguage
End Sub

Public Sub setReconigzedLanguage(textLang As String)
	recognizedLanguage = textLang
	VR.Language = "es"
End Sub

Public Sub getRecPromptText As String
	Return recPromptText
End Sub

Public Sub setRecPrompText(recPrompt As String)
	recPromptText = recPromptText
End Sub


Public Sub VR_Result (Success As Boolean, Texts As List)
	If Success Then
		recognizedText = Texts
		For i = 0 To Texts.Size -1
			Log (Texts.Get(i))
			Log (" i: "&i)
		Next
		recognizedText = Texts
		CallSub(Main,"setRecTextField")
	End If
End Sub
