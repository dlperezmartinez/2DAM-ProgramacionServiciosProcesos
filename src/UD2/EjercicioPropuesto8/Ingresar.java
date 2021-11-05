package UD2.EjercicioPropuesto8;

import java.util.concurrent.Semaphore;

class Randomizar
{
    int Random(int max)
    {
        return (int) (Math.random() * max + 1);
    }
}

public class Ingresar implements Runnable
{
    //Semaphore semaphore = new Semaphore(2, true);

    void IngresoRandom(Cajero c)
    {
        c.Ingresar(new Randomizar().Random(100));
    }

    @Override
    public void run() {
        for (int i = 0; i < -1; i++)
        {
            IngresoRandom(Principal.caja());
        }
    }
}

public class Retirar implements Runnable{


    @Override
    public void run() {
        caja.Retirar(new Randomizar().Random(100);
    }
}
