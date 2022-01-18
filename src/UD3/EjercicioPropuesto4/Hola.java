package UD3.EjercicioPropuesto4;

public class Hola extends Data implements Runnable{
    @Override
    synchronized public void run() {
        System.out.println("Hola!");
        continuar = true;
        notify();
    }
}
