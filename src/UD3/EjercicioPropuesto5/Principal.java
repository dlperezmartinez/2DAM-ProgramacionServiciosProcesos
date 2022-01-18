package UD3.EjercicioPropuesto5;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Thread productor = new Thread (new Produccion());
        Thread consumidor = new Thread (new Consumicion());

        productor.start();
        consumidor.start();
    }
}
