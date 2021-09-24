package UD1.EjercicioPropuesto7;

import java.util.*;

public class CalculadoraPolaca
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        Deque<String> elementos = new ArrayDeque<String>();

        int i = 1; //se usa para numerar los elementos
        boolean continuar = true; //se usa para el while
        String elemento = "";
        char operador;
        int resultado = 0;

        System.out.println("\n-CALCULADORA POLACA-\n");

        System.out.println("Introduce cada elemento por separado.");
        System.out.println("(Si introduces un =, se realizará la operación)");

        //Introducción de datos
        while (continuar)
        {
            System.out.print( i++ + "º: ");
            elementos.push(elemento = in.nextLine());


            if (elemento.equals("="))
            {
                continuar = false;//SALIR
                elementos.removeFirst(); //Necesito borrar el = de la lista
            }
        }

        //CALCULO
        for (String n : elementos)
        {
            if (elementos.peek() == "+" || elementos.peek() == "-" || elementos.peek() == "*" || elementos.peek() == "/")
            {
                operadores.add(Character.valueOf(elementos.pop()));
            }

            System.out.println(elementos.pop());
        }

        System.out.println("Resultado: " + resultado);

        System.out.println("GRACIAS POR ÚTILIZAR ESTA CALCULADORA.");
    }

    public int Calcular (int primero, int segundo, char signo)
    {
        int resultado;

        switch (signo)
        {
            case "+":

                operador = '+';
                break;
            case "-":
                operador = '-';
                break;
            case "*":
                operador = '*';
                break;
            case "/":
                operador = '/';
                break;
        }

        return resultado;
    }
}
