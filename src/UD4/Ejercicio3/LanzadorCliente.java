package UD4.Ejercicio3;

import java.io.IOException;

public class LanzadorCliente {
    public static void main(String[] args) throws IOException {
        SocketClient.DatagramSocketClient socketClient = new SocketClient.DatagramSocketClient();

        socketClient.init("localhost", 40000);
        socketClient.runClient();
    }
}
