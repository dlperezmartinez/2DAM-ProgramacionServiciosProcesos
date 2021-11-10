package UD2.EjercicioPropuesto8;

import java.util.concurrent.Semaphore;

public class Cajero
{
    //ATRIBUTOS
    Semaphore mutex = new Semaphore(1);
    private float saldo;

    public Cajero(float saldo) {
        this.saldo = saldo;
    }
    //MÉTODOS
    void Ingresar(float cantidad)
    {
        try {
            mutex.acquire();

            System.out.println("\nHEBRA 1\n");

            System.out.println("Ingreso: " + cantidad);

            this.saldo += cantidad;

            System.out.println("Saldo: " + saldo);

            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void Retirar(float cantidad)
    {
        try {
            mutex.acquire();

            System.out.println("\nHEBRA 2\n");

            System.out.println("Retirada: " + cantidad);

            this.saldo -= cantidad;

            System.out.println("Saldo: " + saldo);

            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //GETTERS Y SETTERS
    public float getSaldo() {
        return saldo;
    }
}
