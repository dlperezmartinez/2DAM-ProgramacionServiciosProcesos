package UD3.EjercicioPropuesto5;

public class Consumicion extends Almacen implements Runnable{
    @Override
    public void run() {
        try {
            consumir();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
