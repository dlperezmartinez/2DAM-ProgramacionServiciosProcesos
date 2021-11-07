package UD2.EjercicioPropuesto9;

public class Principal
{
    public static void main(String[] args)
    {
        Contador contador = new Contador(2222);

        Hilos h1 = new Hilos("H1", contador);
        Hilos h2 = new Hilos("H2", contador);
        Hilos h3 = new Hilos("H3", contador);
        Hilos h4 = new Hilos("H4", contador);
        Hilos h5 = new Hilos("H5", contador);
        Hilos h6 = new Hilos("H6", contador);
        Hilos h7 = new Hilos("H7", contador);
        Hilos h8 = new Hilos("H8", contador);
        Hilos h9 = new Hilos("H9", contador);
        Hilos h10 = new Hilos("H10", contador);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        h7.start();
        h8.start();
        h9.start();
        h10.start();
    }
}
