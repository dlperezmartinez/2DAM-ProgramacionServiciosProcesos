package UD3.EjercicioPropuesto5;

public class Consumicion implements Runnable{
    Produccion produccion;

    public Consumicion() {
    }

    @Override
    synchronized public void run() {
        while(true) {
            while (Almacen.productos.size() <= 0) {
                System.out.println("No hay productos DISPONIBLES");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (Almacen.productos.size() == 5) {
                produccion.notificar();
            }

            System.out.println("Producto COMPRADO");
            Almacen.productos.remove(0);

        }
    }

    public void setProduccion(Produccion produccion) {
        this.produccion = produccion;
    }

    synchronized public void notificar() {
        this.notify();
    }
}
