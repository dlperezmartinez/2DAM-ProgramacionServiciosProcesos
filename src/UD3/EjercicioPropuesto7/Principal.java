package UD3.EjercicioPropuesto7;

public class Principal {
    public static void main(String[] args) {

        for (int i = 0; i < 40; i++) {
            new Thread(new Coche(i)).start();
        }
    }
}
