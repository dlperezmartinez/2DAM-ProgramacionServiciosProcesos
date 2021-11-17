package UD2.EjercicioExtra2;

public class Lector extends Thread
{
    //ATRIBUTOS
    int ID;
    AccesRW array;

    //CONSTRUCTOR
    public Lector(int ID, AccesRW array) {
        this.ID = ID;
        this.array = array;
    }

    @Override
    public void run() {

    }
}
