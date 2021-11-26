package UD2.PracticaEvaluableSemaforos;

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
    boolean timer(){
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void run() {
        boolean continuar;
        continuar = timer();

        while(true) {
            try {
                Thread.sleep((long) (Math.random()*15000+5000));

                restaurante.cocinar(ID);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
