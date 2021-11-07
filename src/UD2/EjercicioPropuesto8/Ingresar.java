package UD2.EjercicioPropuesto8;

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
                cajero.Ingresar(Random(100));
            }
            else if (miID == 1)
            {
                cajero.Retirar(Random(150));
            }
        }
    }
}
