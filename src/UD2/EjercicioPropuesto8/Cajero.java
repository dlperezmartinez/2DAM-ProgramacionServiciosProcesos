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

        System.out.println("Ingreso: " + cantidad);
        System.out.println("Saldo: " + saldo);
    }

    synchronized void Retirar(float cantidad)
    {
        this.saldo -= cantidad;

        System.out.println("Retirada: " + cantidad);
        System.out.println("Saldo: " + saldo);
    }

    //GETTERS Y SETTERS
    public float getSaldo() {
        return saldo;
    }
}
