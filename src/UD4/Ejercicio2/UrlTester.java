package UD4.Ejercicio2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UrlTester {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException {
        Scanner in = new Scanner(System.in);

        System.out.println("\n-URL TESTER-\n");
        System.out.println("Introduce una dirección URL (\"exit\" o \"quit\" para salir)");
        System.out.print("-> ");

        while (test(in.nextLine()));
    }

    //Método que comprueba si "String s" es una dirección IP o si es una URL y devuelve respectivamente la opuesta
    static boolean test(String s) throws MalformedURLException {
        if (!s.equals("exit") && !s.equals("quit")) {

            URL url = new URL(s);
            URLConnection urlConnection = new URLConnection(s) {
                @Override
                public void connect() throws IOException {

                }
            };
            urlConnection.getContentType();

            System.out.println( "\nProtocolo: " + url.getProtocol() +
                                "\nAutoridad: " + url.getAuthority() +
                                "\nPath: " + url.getPath() +
                                "\nQuery: " + url.getQuery() +
                                "\nFile: " + url.getFile() +
                                "\nPort: " + url.getPort());
        } else {
            return false;
        }

        System.out.print("\n-> ");

        return true;

//        if (s.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}")) {
//            System.out.println(InetAddress.getByName(s).getHostName());
//        } else if (s.matches("[a-z._%+-]*")) {
//            System.out.println(InetAddress.getByName(s).getHostAddress());
//        } else {
//            System.out.println("\nDirección no válida.\n");
//        }
    }
}
