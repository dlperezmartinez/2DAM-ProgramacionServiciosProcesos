package UD2.EjercicioPropuesto8;

import java.util.concurrent.Semaphore;

public class Principal{

    public static void main(String[] args)
    {
        Cajero caja = new Cajero(2000);

        MiHebra h0 = new MiHebra(0, caja);
        MiHebra h1 = new MiHebra(1, caja);

        h0.start();
        try {
            h0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h1.start();
    }
}