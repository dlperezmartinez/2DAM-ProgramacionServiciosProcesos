package UD4.Ejercicio2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UrlTester {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("\n-URL TESTER-\n");
        System.out.println("Introduce una dirección URL (\"exit\" o \"quit\" para salir)");
        System.out.print("-> ");

        while (test(in.nextLine()));
    }

    static boolean test(String s) throws IOException {
        if (!s.equals("exit") && !s.equals("quit")) {

            if (!s.matches("^https://.*")) {
                s = "https://www." + s;
            }

            URL url = new URL(s);
            URLConnection urlConnection = url.openConnection();

            String contenido = urlConnection.getContentType();

            if (contenido.matches("^text.*")) {
                String [] splited = contenido.split(";");

                System.out.println("Formato de archivo: " + splited[0]);
                System.out.println("Codificación: " + splited[1]);
            } else if (contenido.matches("^image.*")) {
                System.out.println("Formato de archivo: " + contenido);
                System.out.println("Tamaño de la imagen (MB's): " + (((double)urlConnection.getContentLength()/1024)/1024));
            } else {
                System.out.println("Formato de archivo: " + contenido);
                System.out.println("Tamaño del archivo: " + urlConnection.getContentLength());
                System.out.println("Última modificación: " + urlConnection.getLastModified());
            }

        } else {
            return false;
        }

        System.out.print("\n-> ");

        return true;

//        "\nProtocolo: " + url.getProtocol() +
//                "\nAutoridad: " + url.getAuthority() +
//                "\nPath: " + url.getPath() +
//                "\nQuery: " + url.getQuery() +
//                "\nFile: " + url.getFile() + https://media.geeksforgeeks.org/wp-content/uploads/20211110131616/mm.png
//                "\nPort: " + url.getPort() https://lol.secure.dyn.riotcdn.net/channels/public/x/installer/current/live.euw.zip
    }
}
