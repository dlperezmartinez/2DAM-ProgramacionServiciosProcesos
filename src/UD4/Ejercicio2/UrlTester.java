package UD4.Ejercicio2;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UrlTester {
    public static void main(String[] args) throws UnknownHostException {
        Scanner in = new Scanner(System.in);

        System.out.println("\n-ADRESS TESTER-\n");
        System.out.println("Introduce una dirección IP o un nombre de DOMINIO (\"exit\" o \"quit\" para salir)");
        System.out.print("-> ");

        while (test(in.nextLine()));
    }

    //Método que comprueba si "String s" es una dirección IP o si es una URL y devuelve respectivamente la opuesta
    static boolean test(String s) throws UnknownHostException {
        if (!s.equals("exit") && !s.equals("quit")) {
            URL url;

//            if (address.getHostName().equals(s)) {
//                System.out.print("Adress: " + address.getHostAddress() + "\n");
//            }
//
//            if (address.getHostAddress().equals(s)) {
//                System.out.print("Servidor: " + address.getHostName() + "\n");
//            }

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
