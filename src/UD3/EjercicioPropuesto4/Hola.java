package UD3.EjercicioPropuesto4;

public class Hola {
    public synchronized void hola() {
        System.out.println("Hola!");
        notifyAll();
    }
}
