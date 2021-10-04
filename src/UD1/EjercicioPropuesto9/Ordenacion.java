package UD1.EjercicioPropuesto9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ordenacion
{
    public static void main(String[] args)
    {
        ArrayList<Circulo> listaCirculos = new ArrayList<>();
        ArrayList<Cuadrado> listaCuadrados = new ArrayList<>();
        ArrayList<Rectangulo> listaRectangulos = new ArrayList<>();

        //INSTANCIAS
        listaCirculos.add(new Circulo(20));
        listaCirculos.add(new Circulo(78));
        listaCirculos.add(new Circulo(2));

        listaCuadrados.add(new Cuadrado(20, 40));
        listaCuadrados.add(new Cuadrado(10, 100));
        listaCuadrados.add(new Cuadrado(24, 67));

        listaRectangulos.add(new Rectangulo(40, 50));
        listaRectangulos.add(new Rectangulo(20, 12));
        listaRectangulos.add(new Rectangulo(45, 89));
    }


    void ordenar(ArrayList lista)
    {
        if(lista.get(0) instanceof Circulo)
        {
            //lista.sort(compareTo());
        }
    }
}