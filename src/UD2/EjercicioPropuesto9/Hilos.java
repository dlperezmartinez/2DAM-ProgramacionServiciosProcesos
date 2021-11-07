package UD2.EjercicioPropuesto9;

public class Hilos extends Thread
{
    //ATRIBUTOS
    String nombre;
    Contador contador;

    //CONSTRUCTOR
    public Hilos(String nombre, Contador contador) {
        this.nombre = nombre;
        this.contador = contador;
    }

    @Override
    public void run() {
        contador.Random();
        //contador.RandomSyncronized();
    }
}
