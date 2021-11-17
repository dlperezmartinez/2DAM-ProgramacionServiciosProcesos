package UD2.EjercicioExtra2;

public class Escritor extends Thread
{
    //ATRIBUTOS
    int ID;
    AccesRW array;

    //INSTANCIAS


    //CONSTRUCTOR
    public Escritor(int ID, AccesRW array) {
        this.ID = ID;
        this.array = array;
    }

    @Override
    public void run() {

    }
}
