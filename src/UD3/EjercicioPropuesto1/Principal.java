package UD3.EjercicioPropuesto1;

public class Principal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Hilos().start();
        }

        System.out.println("Hilos creados");
    }
}
