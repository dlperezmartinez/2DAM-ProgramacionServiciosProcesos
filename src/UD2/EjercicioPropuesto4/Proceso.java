package UD2.EjercicioPropuesto4;

import java.util.Comparator;

public class Proceso
{
    //ATRIBUTOS
    String nombre;
    int tiempoLlegada, tiempoEjecución;

    //CONSTRUCTOR
    public Proceso(String nombre, int tiempoLlegada, int tiempoEjecución) {
        this.nombre = nombre;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoEjecución = tiempoEjecución;
    }

//    public Comparator<? super Proceso> getTiempoLlegada() {
//        return 1;
//    }
}
