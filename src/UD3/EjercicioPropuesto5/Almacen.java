package UD3.EjercicioPropuesto5;

import java.util.ArrayList;

public class Almacen {
    static ArrayList<Integer> productos = new ArrayList<>();

    static int productoRandom() {
        return (int) (Math.random()*49+1);
    }
}
