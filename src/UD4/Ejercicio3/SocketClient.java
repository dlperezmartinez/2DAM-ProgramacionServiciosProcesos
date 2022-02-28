package UD4.Ejercicio3;

import java.net.*;
import java.io.IOException;

public class SocketClient {

    public static class DatagramSocketClient {
        InetAddress serverIP;
        int serverPort;
        DatagramSocket socket;

        public void init(String host, int port) throws SocketException,
                UnknownHostException{
            serverIP = InetAddress.getByName(host);
            serverPort = port;
            socket = new DatagramSocket();
        }

        public void runClient() throws IOException{
            byte [] receivedData = new byte[1024];
            byte [] sendingData;

            //a l'inici
            sendingData = getFirstRequest();
            //el servidor at�n el port indefinidament
            while(mustContinue(sendingData)){
                DatagramPacket packet = new DatagramPacket(sendingData,
                        sendingData.length, serverIP, serverPort);
                //enviament de la resposta
                socket.send(packet);

                //creaci� del paquet per rebre les dades
                packet = new DatagramPacket(receivedData, 1024);
                //espera de les dades
                socket.receive(packet);
                //processament de les dades rebudes i obtenci� de la resposta
                sendingData = getDataToRequest(packet.getData(), packet.getLength());
            }
        }

        private byte[] getDataToRequest(byte[] data, int length) {
            //proc�s diferent per cada aplicaci�
            //...
            return data;
        }

        private byte[] getFirstRequest() {
            //proc�s diferent per cada aplicaci�
            //...
            byte[] data = new byte[1024];
            //...
            return data;
        }

        private boolean mustContinue(byte[] sendingData) {
            //proc�s diferent per cada aplicaci�
            //...
            return true;
        }
    }
}
