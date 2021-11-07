package UD2.EjercicioPropuesto9;

public class Contador
{
    int cantidad;

    public Contador(int cantidad) {
        this.cantidad = cantidad;
    }

    void Random()
    {
        //Numero random
        int numero = (int) (Math.random() * 5000 + 1);

        if (numero % 2 == 0) //incrementa
        {
            cantidad += numero;
        }
        else //decrementa
        {
            cantidad -= numero;
        }

        System.out.println(cantidad);
    }

    synchronized void RandomSyncronized()
    {
        //Numero random
        int numero = (int) (Math.random() * 5000 + 1);

        if (numero % 2 == 0) //incrementa
        {
            cantidad += numero;
        }
        else //decrementa
        {
            cantidad -= numero;
        }

        System.out.println(cantidad);
    }
}
