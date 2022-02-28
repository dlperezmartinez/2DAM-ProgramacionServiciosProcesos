package UD4.Ejercicio3;

import java.net.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SocketServer {

    public static class DatagramSocketServer {
        DatagramSocket socket;
        Scanner in = new Scanner(System.in);

        int modo;
        boolean menu;
        ArrayList<Double> numerosSumar = new ArrayList<Double>();

        public void init(int port) throws SocketException{
            socket = new DatagramSocket(port);
        }

        public void runServer() throws IOException{
            byte [] receivingData = new byte[1024];
            byte [] sendingData;
            InetAddress clientIP;
            int clientPort;

            //el servidor at�n el port indefinidament
            while(true){

                while (menu) {
                    System.out.println("Elige el modo de funcionamiento: \n" +
                            "1 -> Modo normal.\n" +
                            "2 -> Modo suma.\n");
                    modo = in.nextInt();

                    switch (modo) {
                        case 1:
                            System.out.println("Modo normal seleccionado.");
                            menu = false;
                            break;
                        case 2:
                            System.out.println("Modo suma seleccionado.");
                            menu = false;
                            break;
                        default:
                            System.out.println("Introduce 1 o 2 por favor.");
                            break;
                    }
                }

                //creaci� del paquet per rebre les dades
                DatagramPacket packet = new DatagramPacket(receivingData, 1024);
                //espera de les dades
                socket.receive(packet);
                //processament de les dades rebudes i obtenci� de la resposta
                sendingData = processData(packet.getData(), packet.getLength(), modo);
                //obtenci� de l'adre�a del client
                clientIP = packet.getAddress();
                //obtenci� del port del client
                clientPort = packet.getPort();
                //creaci� del paquet per enviar la resposta
                packet = new DatagramPacket(sendingData, sendingData.length,
                        clientIP, clientPort);
                //enviament de la resposta
                socket.send(packet);
            }
        }

        private byte[] processData(byte[] data, int length, int modo) {
            //proc�s diferent per cada aplicaci�
            if (modo == 2) {
                float resultado = 0;
                boolean continuar = true;

                while (continuar) {
                    if (data.toString().equals("=")) {
                        for (double n : numerosSumar) {
                            resultado += n;
                            continuar = false;
                        }
                    } else {
                        double asDouble = Double.parseDouble(data.toString());
                        numerosSumar.add(asDouble);
                    }
                }

                data = doubleToByteArray(resultado);
            }

            return data;
        }

        // https://www.baeldung.com/java-convert-float-to-byte-array
        public static byte[] doubleToByteArray(double value) {
            long longBits =  Double.doubleToLongBits(value);
            return new byte[] {
                    (byte) (longBits >> 24), (byte) (longBits >> 16), (byte) (longBits >> 8), (byte) (longBits) };
        }

    }
}
