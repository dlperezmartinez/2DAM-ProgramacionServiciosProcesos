package UD1.EjercicioPropuesto6;

import java.util.*;

public class Cola
{
    public static void main(String[] args)
    {
        Queue<String> cola = new LinkedList<>();

        cola.add("Uno");
        cola.add("Dos");
        cola.add("Tres");
        cola.add("Cuatro");
        cola.add("Cinco");

        while (!cola.isEmpty())
        {
            System.out.println(cola.peek());
            cola.remove();
        }
    }
}
