package UD3.EjercicioPropuesto4;

public class Data {
    boolean continuar = false;

    synchronized void hola() {
        System.out.println("Hola!");
        continuar = true;
        notify();
    }

    synchronized void adios() throws InterruptedException {
        while (!continuar) {
            wait();
        }

        System.out.println("Adiós.");
    }
}
