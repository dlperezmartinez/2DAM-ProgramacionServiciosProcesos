package UD3.EjercicioPropuesto4;

public class MiHebra extends Thread{
    Hola hola = new Hola();
    Adios adios = new Adios();

    @Override
    public void run() {

    }

    synchronized void hola() {
        System.out.println("Hola!");
        notifyAll();
    }

    synchronized void adios() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Adiós.");
    }
}
