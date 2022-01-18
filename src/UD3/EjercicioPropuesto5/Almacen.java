package UD3.EjercicioPropuesto5;

import java.util.ArrayList;

public class Almacen {
    ArrayList<Integer> productos = new ArrayList<>();

    int productoRandom() {
        return (int) (Math.random()*49+1);
    }

    public synchronized void producir() throws InterruptedException {
        while(productos.size() == 5) {
            System.out.println("No hay ESPACIO en el almacen");

            wait();
        }

        productos.add(productoRandom());
        System.out.println("Producto CREADO.");

        notify();
    }

    synchronized void consumir() throws InterruptedException {
        while(productos.size() <= 0) {
            System.out.println("No hay productos DISPONIBLES");
            wait();
        }

        System.out.println("Producto COMPRADO");
        productos.remove(1);

        notify();
    }
}
