package UD2.EjercicioPropuesto8;

import java.util.concurrent.Semaphore;

class MiHebra extends Thread
{
    static int Random(int max)
    {
        return (int) (Math.random() * max + 1);
    }

    //ATRIBUTOS
    int miID;
    Cajero cajero;

    public MiHebra(int miID, Cajero cajero) {
        this.miID = miID;
        this.cajero = cajero;
    }

    @Override
    public void run() {
        for (int i = 0; i > -1; i++)
        {
            if (miID == 0)
            {
                int cantidad = Random(100);

                cajero.Ingresar(cantidad);

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (miID == 1)
            {
                int cantidad = Random(150);

                cajero.Retirar(cantidad);

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
