package UD3.EjercicioPropuesto5;

public class Principal {
    public static void main(String[] args) throws InterruptedException {

        //He tratado de arreglarlo y he llegado a la conclusión de que notify() no notifica a hilos que estén en otra clase,
        //la solución es tratar los wait() notify() en la misma clase como ya he hecho en los demás ejercicios
        //21/01/2022

        Produccion produccion = new Produccion();
        Consumicion consumicion = new Consumicion();

        produccion.setConsumicion(consumicion);
        consumicion.setProduccion(produccion);

        Thread productor = new Thread (produccion);
        Thread consumidor = new Thread (consumicion);

        productor.start();
        consumidor.start();
    }
}
