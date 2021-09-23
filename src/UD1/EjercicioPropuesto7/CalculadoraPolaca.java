package UD1.EjercicioPropuesto7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class CalculadoraPolaca
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        Deque<String> palabras = new ArrayDeque<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        int i = 1; //se usa para numerar los elementos
        boolean continuar = true; //se usa para el while
        String elemento = "";
        String operador = null;
        String operadorViejo = null;
        int resultado = 0;

        System.out.println("\n-CALCULADORA POLACA-\n");

        System.out.println("Introduce cada elemento por separado.");
        System.out.println("(Si introduces un =, se realizará la operación)");

        //Introducción de datos
        while (continuar)
        {
            System.out.print( i++ + "º: ");
            palabras.push(elemento = in.nextLine());

            if (elemento.equals("="))
            {
                continuar = false;//SALIR
                palabras.removeFirst(); //Necesito borrar el = de la lista
            }
        }

        //CALCULO
        for (String n : palabras)
        {
            elemento = palabras.pop();

            if (elemento == "+")//SUMA
            {
                operador = elemento;
            }
            else if (elemento == "-")//RESTA
            {
                operador = elemento;
            }
            else if (elemento == "*")//MULTIPLICACIÓN
            {
                operador = elemento;
            }
            else if (elemento == "/")//DIVISIÓN
            {
                operador = elemento;
            }
            else
            {
                numeros.add(Integer.valueOf(elemento));
            }

            /*if (operador != operadorViejo)
            {
                for (Integer l : numeros)
                {
                    resultado = Integer.valueOf(resultado + operador + l);
                }

                //operador = null; //resetea el operador
                operadorViejo = operador;
            }*/

            System.out.println(palabras.pop());
        }

        System.out.println("Resultado: " + resultado);

        System.out.println("GRACIAS POR ÚTILIZAR ESTA CALCULADORA.");
    }
}
