package UD3.EjercicioPropuesto2;

public class Principal {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Dado(i).start();
        }
    }
}
