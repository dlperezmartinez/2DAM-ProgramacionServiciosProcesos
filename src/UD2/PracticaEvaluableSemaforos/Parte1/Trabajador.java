package UD2.PracticaEvaluableSemaforos.Parte1;

public class Trabajador extends Thread{
    //ATRIBUTOS
    Restaurante restaurante;
    int ID;

    //CONSTRUCTOR
    public Trabajador(Restaurante restaurante, int id) {
        this.restaurante = restaurante;
        this.ID = id;
    }

    //MÉTODOS
    @Override
    public void run() {
        restaurante.cocinar(ID);
    }
}
