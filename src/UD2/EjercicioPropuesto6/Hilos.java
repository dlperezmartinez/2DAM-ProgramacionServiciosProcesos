package UD2.EjercicioPropuesto6;

public class Hilos implements Runnable
{
    //ATRIBUTOS
    int inicio, fin, id;
    //CONSTRUCTOR
    public Hilos(int id) {
        this.id = id;
    }

    boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    @Override
    public void run()
    {
        inicio = id*1000+1;
        fin = inicio+1000;

        for (int i = inicio; i < fin; i++)
        {
            if (esPrimo(i))
            {
                System.out.println(i);
            }
        }
    }
}
