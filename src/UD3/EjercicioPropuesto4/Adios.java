package UD3.EjercicioPropuesto4;

public class Adios {
    public void adios() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Adiós.");
    }
}