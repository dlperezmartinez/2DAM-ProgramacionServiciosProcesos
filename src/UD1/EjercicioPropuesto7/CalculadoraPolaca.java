package UD1.EjercicioPropuesto7;

import java.util.*;

public class CalculadoraPolaca
{
    static boolean IsOperator(String cosa)
    {
        if (cosa == "+" || cosa == "-" || cosa == "*" || cosa == "/")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        Deque<String> elementos = new ArrayDeque<String>();

        int i = 1; //se usa para numerar los elementos
        boolean continuar = true; //se usa para el while
        int resultado = 0;
        String elemento;

        System.out.println("\n-CALCULADORA POLACA-\n");

        System.out.println("Introduce cada elemento por separado.");
        System.out.println("(Si introduces un =, se realizará la operación)");

        //Introducción de datos
        while (continuar)
        {
            System.out.print( i++ + "º: ");

            elementos.push(elemento = in.nextLine());

            if (elemento == "=")
            {
                elementos.removeFirst();
                continuar = false;
            }
        }

        while (!elementos.isEmpty())
        {
            if (IsOperator(elementos.peek()))
            {
                Calcular(elementos.pop(), elementos.pop(), elementos.pop());
            }
        }


        System.out.println("Resultado: " + resultado);

        System.out.println("GRACIAS POR ÚTILIZAR ESTA CALCULADORA.");
    }

    static int Calcular(String signo, String derecha, String izquierda)
    {
        int resultado = 0;

        switch (signo)
        {
            case "+":
                if (!IsOperator(derecha) && !IsOperator(izquierda))
                {
                    resultado = Integer.parseInt(izquierda + derecha);
                }

                break;
            case "-":
                resultado = izquierda - derecha;
                break;
            case "*":
                resultado = izquierda * derecha;
                break;
            case "/":
                resultado = izquierda / derecha;
                break;
            default:
                System.out.println("Introduce un número entero o un signo (+ - * /)");
                break;
        }

        return resultado;
    }
}
