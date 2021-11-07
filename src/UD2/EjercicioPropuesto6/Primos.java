package UD2.EjercicioPropuesto6;

public class Primos {
    int contador = 2;
    boolean primo = true;

    boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
