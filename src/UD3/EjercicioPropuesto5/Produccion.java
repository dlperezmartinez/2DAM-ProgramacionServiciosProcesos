package UD3.EjercicioPropuesto5;

public class Produccion implements Runnable{
    @Override
    synchronized public void run() {
        while (true) {
            while (Almacen.productos.size() == 5) {
                System.out.println("No hay ESPACIO en el almacen");

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Almacen.productos.add(Almacen.productoRandom());
            System.out.println("Producto CREADO.");

            notify();
        }
    }
}
