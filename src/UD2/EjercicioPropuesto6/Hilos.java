package UD2.EjercicioPropuesto6;

public class Hilos implements Runnable
{
    //ATRIBUTOS
    int inicio, fin, id;
    Primos primos;  //Creo que no hace falta pero tiene pinta de que así es más eficiente
                    //Si pongo "new Primos()", estará creando el objeto cada vez
    //CONSTRUCTOR
    public Hilos(int id, Primos primos) {
        this.id = id;
        this.primos = primos;
    }

    @Override
    public void run()
    {
        inicio = id*1000+1;
        fin = inicio+1000;

        for (int i = inicio; i < fin; i++)
        {
            if (primos.esPrimo(i))
            {
                System.out.println(i);
            }
        }
    }
}
