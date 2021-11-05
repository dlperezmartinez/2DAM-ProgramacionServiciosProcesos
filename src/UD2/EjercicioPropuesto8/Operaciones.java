package UD2.EjercicioPropuesto8;

import java.util.concurrent.Semaphore;

public class Operaciones implements Runnable
{
    static int Random(int max)
    {
        return (int) (Math.random() * max + 1);
    }

    Semaphore semaphore = new Semaphore(2, true);
    Cajero caja = new Cajero(2000);

    @Override
    public void run() {
        caja.Ingresar(Random(100));
        caja.Retirar(Random(150));
    }
}
