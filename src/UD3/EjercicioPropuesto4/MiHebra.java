package UD3.EjercicioPropuesto4;

public class MiHebra extends Thread{
    Hola hola = new Hola();
    Adios adios = new Adios();

    @Override
    public void run() {
        hola.hola();
    }
}
