package UD2.PracticaEvaluableSemaforos.Parte2;

public class Repartidor extends Thread {
    //ATRIBUTOS
    Restaurante restaurante;
    int ID;

    //CONSTRUCTOR
    public Repartidor(Restaurante restaurante, int id) {
        this.restaurante = restaurante;
        this.ID = id;
    }

    //MÉTODOS
    @Override
    public void run() {
        restaurante.repartir(ID);
    }
}
