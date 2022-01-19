package UD3.EjercicioPropuesto4;

public class Principal {
    public static void main(String[] args) {
        Data data = new Data();

        //Adiós
        new Thread(() -> {
            try {
                data.adios();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //Hola
        new Thread(() -> data.hola()).start();
    }
}
