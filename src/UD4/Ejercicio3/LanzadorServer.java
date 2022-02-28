package UD4.Ejercicio3;

import java.io.IOException;

public class LanzadorServer {
    public static void main(String[] args) throws IOException {
        SocketServer.DatagramSocketServer socketServer = new SocketServer.DatagramSocketServer();

        socketServer.init(40000);
        socketServer.runServer();
    }
}
