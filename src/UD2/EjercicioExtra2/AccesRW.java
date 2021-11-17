package UD2.EjercicioExtra2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class AccesRW
{
    //ATRIBUTOS
    ArrayList<String> recursos = new ArrayList<>();

    //INSTANCIAS
    Semaphore mutex = new Semaphore(1);

    //CONSTRUCTOR
    public AccesRW() {
    }

    //MÉTODOS
    //Método para ESCRIBIR en el array
    public void escribir(Escritor escritor)
    {
        recursos.add("Soy el escritor %d y son las %d".formatted(escritor.ID, Time.getTime()));
    }

    //Método para LEER el array
    public String leer(Lector lector)
    {
        if (recursos.isEmpty())
        {
            //MUTEX
            try {
                mutex.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else
        {
            return String.valueOf("Soy el lector " + lector.getId() + " y son las ");
        }
        return null;
    }
}
