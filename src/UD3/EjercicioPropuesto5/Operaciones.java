package UD3.EjercicioPropuesto5;

import java.util.ArrayList;

public class Operaciones extends Almacen {
    boolean lleno, vacio;

    int productoRandom() {
        return (int) (Math.random()*49+1);
    }

    public synchronized ArrayList<Integer> producir(ArrayList<Integer> productos) throws InterruptedException {
        this.lleno = productos.size() == 5;

        while(lleno) {
            wait();
        }

        productos.add(productoRandom());

        vacio = false;
        notifyAll();
        return productos;
    }

    synchronized ArrayList<Integer> consumir(ArrayList<Integer> productos) throws InterruptedException {
        vacio = productos.size() == 0;

        while(vacio) {
            wait();
        }

        System.out.println("Producto nº: " + productos.indexOf(0) + " COMPRADO");
        productos.remove(0);

        lleno = false;
        notifyAll();

        return productos;
    }
}
