package UD3.EjercicioPropuesto5;

public class Produccion implements Runnable{
    Consumicion consumicion;

    public Produccion() {
    }

    @Override
    synchronized public void run() {
        while (true) {
            while (Almacen.productos.size() == 5) {
                System.out.println("No hay ESPACIO en el almacen");

                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (Almacen.productos.size() == 0) {
                consumicion.notificar();
            }

            Almacen.productos.add(Almacen.productoRandom());
            System.out.println("Producto CREADO.");

        }
    }

    public void setConsumicion(Consumicion consumicion) {
        this.consumicion = consumicion;
    }

    synchronized public void notificar() {
        this.notify();
    }
}
