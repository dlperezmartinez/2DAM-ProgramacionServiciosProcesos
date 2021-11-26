package UD2.PracticaEvaluableSemaforos.Parte2;

public class Principal {
    public static void main(String[] args) {
        //INSTANCIAS
        Restaurante restaurante = new Restaurante();

        for (int i=0; i<5; i++) {
            new Trabajador(restaurante, i).start();
        }

        for (int i=0; i<3; i++)
            new Repartidor(restaurante, i).start();

        for (int i=0; i<30; i++){
            new Cliente(restaurante, i).start();
        }
    }
}
