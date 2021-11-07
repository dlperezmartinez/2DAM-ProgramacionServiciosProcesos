package UD2.EjercicioPropuesto6;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Primos primos = new Primos();

        System.out.print("Introduce el número de hebras con las que quieres operar (1 al 10): ");
        int numHebras = in.nextInt();

        Thread vHilos[] = new Thread[numHebras];

        for (int i = 0; i < numHebras; i++) {
            vHilos [i] = new Thread(new Hilos(i, primos));
            vHilos[i].start();
        }

        for (int i = 0; i < numHebras; i++)
        {
            try {
                vHilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
