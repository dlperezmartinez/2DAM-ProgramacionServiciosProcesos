package UD3.EjercicioPropuesto5;

public class Produccion extends Almacen implements Runnable{
    @Override
    public void run() {
        try {
            producir();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
