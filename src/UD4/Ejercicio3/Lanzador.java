package UD4.Ejercicio3;

import java.io.IOException;

public class Lanzador {
    public static void main(String[] args) throws IOException {
        SocketServer.DatagramSocketServer socketServer = new SocketServer.DatagramSocketServer();

        socketServer.init(60000);
        socketServer.runServer();
    }
}
