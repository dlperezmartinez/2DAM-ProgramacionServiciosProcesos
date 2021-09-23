package UD1.EjercicioPropuesto5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack
{
    public static void main(String[] args)
    {
        Deque<String> palabras = new ArrayDeque<String>();

        palabras.push("Uno");
        palabras.push("Dos");
        palabras.push("Tres");
        palabras.push("Cuatro");
        palabras.push("Cinco");

        for (String n : palabras)
        {
            System.out.println(palabras.getFirst()); //TODO no sé el objetivo de la actividad
        }
    }
}
