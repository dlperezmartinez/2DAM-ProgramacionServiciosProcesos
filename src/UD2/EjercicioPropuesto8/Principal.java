package UD2.EjercicioPropuesto8;

import java.util.concurrent.Semaphore;

public class Principal{
    static int Random(int max)
    {
        return (int) (Math.random() * max + 1);
    }

    public static void main(String[] args)
    {
        Operaciones operacion = new Operaciones();
        Cajero caja = new Cajero(2000);

        Thread ingresar = new Thread(operacion);
        Thread retirar = new Thread();





    }
}