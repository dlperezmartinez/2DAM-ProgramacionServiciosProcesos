package UD2.PracticaEvaluableSemaforos;

public class Principal {
    public static void main(String[] args) {
        //INSTANCIAS
        Restaurante restaurante = new Restaurante();
        Trabajador trabajador = new Trabajador(restaurante, 0);

        for (int i=0; i<30; i++){
            new Cliente(restaurante, i).start();
        }

        trabajador.start();


    }
}
