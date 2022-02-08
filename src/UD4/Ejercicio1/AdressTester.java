package UD4.Ejercicio1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class AdressTester {
    public static void main(String[] args) throws UnknownHostException {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("\n-ADRESS TESTER-\n");
        System.out.println("Introduce una dirección IP o un nombre de DOMINIO (\"exit\" o \"quit\" para salir)");

        while (continuar) {
            System.out.print("->");
            testAdress(in.nextLine());
        }
    }

    static void testAdress(String s) {
        if (s.matches("[a-z._%+-]*")) {
            System.out.println("funciona");
        } else {

        }
    }
}
