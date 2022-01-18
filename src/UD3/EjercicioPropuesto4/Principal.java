package UD3.EjercicioPropuesto4;

public class Principal {
    public static void main(String[] args) {
        Thread hola = new Thread(new Hola());
        Thread adios = new Thread(new Adios());

        adios.start();
        hola.start();
    }
}
