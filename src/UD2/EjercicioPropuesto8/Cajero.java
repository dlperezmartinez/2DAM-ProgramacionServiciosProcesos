package UD2.EjercicioPropuesto8;

public class Cajero
{
    //ATRIBUTOS
    private float saldo;

    public Cajero(float saldo) {
        this.saldo = saldo;
    }
    //MÉTODOS
    synchronized void Ingresar(float cantidad)
    {
        this.saldo += cantidad;
    }

    synchronized void Retirar(float cantidad)
    {
        this.saldo -= cantidad;
    }

    //GETTERS Y SETTERS
    public float getSaldo() {
        return saldo;
    }
}
