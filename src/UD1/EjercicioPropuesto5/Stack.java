package UD1.EjercicioPropuesto5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

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

        System.out.println(palabras.peek());

        for (String n : palabras)
        {
            System.out.println(palabras.pop()); //TODO no sé el objetivo de la actividad
        }
    }
}
