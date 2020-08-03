#include <ESP8266WiFi.h>
#include <WiFiUdp.h>
#include <WiFiManager.h>
  
///////////////////Organizar en Librerias/////////////////////////////////////////////////////////
#define RESET_WIFI D0
#define LUZ1 D1

WiFiUDP UDP;
WiFiManager wifimanager;
IPAddress broadcast;
byte mac[6];
String macS="";
unsigned int localPort = 8888;
unsigned int remotePort = 8889;
char packetBuffer[UDP_TX_PACKET_MAX_SIZE];
String hubCommand;
boolean isRegister;
String commandSet[] = {"prender","apagar"};
///////////////////////////////////////////////////////////////////////////////////////////////7


void setup() {
  Serial.begin(9600);
  pinMode(RESET_WIFI, INPUT_PULLUP);
  pinMode(LUZ1, OUTPUT);
  Serial.println("Intentando conectar......");
  delay(5000);  
  wifimanager.autoConnect("GEMIV");
  connectUDP();
  Serial.println("Espere......");
  broadcast = getIPBroadcast(WiFi.localIP());
  isRegister = false;
  hubCommand = "";
  delay(5000);
  Serial.println("Enviando Broadcast......");
  WiFi.macAddress(mac); 
  sendUDPBroadCastPacket("IP: "+convertIPToString(WiFi.localIP()));
 Serial.print("MAC: ");
  Serial.print(mac[5],HEX);
  Serial.print(":");
  Serial.print(mac[4],HEX);
  Serial.print(":");
  Serial.print(mac[3],HEX);
  Serial.print(":");
  Serial.print(mac[2],HEX);
  Serial.print(":");
  Serial.print(mac[1],HEX);
  Serial.print(":");
  Serial.println(mac[0],HEX);
  macS = String(mac[5],HEX) + ":" + String(mac[4],HEX) + ":" + String(mac[3],HEX) + ":" + String(mac[2],HEX) + ":" + String(mac[1],HEX) + ":" + String(mac[0],HEX);
  Serial.println(macS);
  sendUDPBroadCastPacket("MAC: "+macS);
  //sendUDPBroadCastPacket("REGISTERIP");
  pinMode(LED_BUILTIN, OUTPUT);
  Serial.println("Ready!......");
}

void loop() {
  ResetWIFI();
  getUDPPacket();
  if (isRegister) {
      Serial.println("Esperando comandos del HUB.....");
     listenCommand(hubCommand);
     hubCommand = "";
     delay(1000);
  } else {
      digitalWrite(LED_BUILTIN, HIGH); 
      delay(1000);                      
      digitalWrite(LED_BUILTIN, LOW);   
      delay(1000);
      if (hubCommand.equals("GETCOMMAND")) {
          Serial.println("Enviando set de comandos al Hub");
          sendCommandSet();
          hubCommand = "";
      }
      if (hubCommand.equals("BEGINLISTEN")) {
        Serial.println("Switcher registrado en el Hub");
        digitalWrite(LED_BUILTIN, HIGH); 
        delay(1000);         
        isRegister = true;
        hubCommand = "";
      }
  }
}
//////////////////////////RESET CONFIGURACION WIFI EN PIN D0///////////////////////////////////////////
void ResetWIFI(){
  int debounce = 50;
  if ( digitalRead(RESET_WIFI) == LOW ){
    delay(debounce);
    if(digitalRead(RESET_WIFI) == LOW ){
      WiFiManager wifiManager;      
      wifiManager.resetSettings();
      delay(1000);
      ESP.reset();
    }
  }
}


//////////////////////////Organizar en Librerias///////////////////////////////////////////
/*void connectWiFiSTA(){
   Serial.println("");
   WiFi.mode(WIFI_STA);
   WiFi.begin(ssid, password);
   while (WiFi.status() != WL_CONNECTED){ 
     delay(100);  
     Serial.print('.'); 
   }
   Serial.println("");
   Serial.print("Iniciado STA:\t");
   Serial.println(ssid);
   Serial.print("IP address:\t");
   Serial.println(WiFi.localIP());
}
*/
boolean connectUDP(){
  Serial.println();
  Serial.println("Iniciando UDP");
  if (UDP.begin(localPort) != 1){
    Serial.println("Error de conección");
    while (true) { delay(1000); } 
  }
  Serial.println("UDP iniciado correctamente");
}

void sendUDPBroadCastPacket(String content){
  UDP.beginPacket(broadcast, remotePort);
  UDP.write(content.c_str());
  UDP.endPacket();
}

void getUDPPacket(){
    int packetSize = UDP.parsePacket();
      if (packetSize){
        UDP.read(packetBuffer, UDP_TX_PACKET_MAX_SIZE);
        Serial.println();
        Serial.print("Tamaño de paquete recibido ");
        Serial.print(packetSize);
        Serial.print(" desde ");
        Serial.print(UDP.remoteIP());
        Serial.print(":");
        Serial.println(UDP.remotePort());
        Serial.print("Contenido del paquete: ");
        Serial.write((uint8_t*)packetBuffer, (size_t)packetSize);
        Serial.println();
        processPacket(String(packetBuffer));
        sendUDPOK();
      }
      delay(10);  
}

String convertIPToString(IPAddress ip){
    return String() + ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
}

IPAddress getIPBroadcast(IPAddress ip){
  IPAddress tmp_ip = ip;
  tmp_ip[3] = 255;
  return tmp_ip;
}

void sendUDPOK(){
  UDP.beginPacket(UDP.remoteIP(), remotePort);
  UDP.write("OK");
  UDP.endPacket();
}

void processPacket(String response){
   hubCommand = response;
   hubCommand.trim();
   if(hubCommand=="prender") digitalWrite(LUZ1, HIGH);
   if(hubCommand=="apagar") digitalWrite(LUZ1, LOW);
   Serial.println("Hub Command: "+hubCommand);
   UDP.flush();
   for (int i=0; i <= UDP_TX_PACKET_MAX_SIZE; i++){
    packetBuffer[i] = 0;
   } 
}

void sendCommandSet() {
    String command = "SETCOMMAND|" + commandSet[0] + "|" + commandSet[1]; //TODO: Remplazarlo por un for para usarlo para cualquier tipo de set de comandos
    UDP.beginPacket(UDP.remoteIP(), remotePort);
    UDP.write(command.c_str());
    UDP.endPacket();
}

void listenCommand(String command) {
   if (command != NULL && command.length() > 0) {
      if (command.equals("ON")) {
        digitalWrite(LED_BUILTIN, LOW); //Xq el led se prende con LOW??????????
        delay(1000);
        return;                      
      }
      if (command.equals("OFF")) {
        digitalWrite(LED_BUILTIN, HIGH); 
        delay(1000);
        return;              
      }
      Serial.println("Comando no reconocido!");
   }
}
