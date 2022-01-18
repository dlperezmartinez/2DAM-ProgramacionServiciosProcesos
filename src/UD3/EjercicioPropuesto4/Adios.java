package UD3.EjercicioPropuesto4;

public class Adios extends Data implements Runnable{
    @Override
    synchronized public void run() {
        while (!continuar) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Adiós.");
    }
}
