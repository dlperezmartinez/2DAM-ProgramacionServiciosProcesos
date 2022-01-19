package UD3.EjercicioPropuesto5;

public class Consumicion implements Runnable{
    @Override
    synchronized public void run() {
        while(true) {
            while (Almacen.productos.size() <= 0) {
                System.out.println("No hay productos DISPONIBLES");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Producto COMPRADO");
            Almacen.productos.remove(1);

            notify();
        }
    }
}
