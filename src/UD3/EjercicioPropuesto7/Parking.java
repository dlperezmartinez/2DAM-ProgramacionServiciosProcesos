package UD3.EjercicioPropuesto7;

import java.util.ArrayList;

public class Parking {
    static ArrayList<Coche> aparcamientos = new ArrayList<>();

    static int tiempoRandom(int max, int min) {
        return (int) (Math.random()*max+min);
    }
}
