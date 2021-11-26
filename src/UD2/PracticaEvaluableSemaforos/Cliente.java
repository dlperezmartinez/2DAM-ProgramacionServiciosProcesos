package UD2.PracticaEvaluableSemaforos;

public class Cliente extends Thread{
    //ATRIBUTOS
    Restaurante restaurante;
    int ID;

    //CONSTRUCTOR
    public Cliente(Restaurante restaurante, int id) {
        this.restaurante = restaurante;
        this.ID = id;
    }

    @Override
    public void run() {
        restaurante.hacerComanda(ID);
    }
}
