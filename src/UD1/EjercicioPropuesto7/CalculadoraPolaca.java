package UD1.EjercicioPropuesto7;

import java.util.*;

public class CalculadoraPolaca
{
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        Deque<Integer> elementos = new ArrayDeque<Integer>();

        int i = 1; //se usa para numerar los elementos
        boolean continuar = true; //se usa para el while
        String elemento = "";
        int numeros;
        char operador;
        int resultado = 0;

        System.out.println("\n-CALCULADORA POLACA-\n");

        System.out.println("Introduce cada elemento por separado.");
        System.out.println("(Si introduces un =, se realizará la operación)");

        //Introducción de datos
        while (continuar)
        {
            System.out.print( i++ + "º: ");

            String cosa = in.nextLine();

            if (cosa == (int)Integer.valueOf(cosa))
            {

            }

            /*try
            {
                numeros = in.nextInt();
                elementos.push(numeros);
            }
            catch (InputMismatchException e)
            {
                elementos.push(Calcular(elementos.pop(), elementos.pop(), String.valueOf(elemento)));

                /*if (elemento.equals("="))
                {
                    continuar = false;//SALIR
                    elementos.removeFirst(); //Necesito borrar el = de la lista
                }*/
            //}
        }

        System.out.println("Resultado: " + resultado);

        System.out.println("GRACIAS POR ÚTILIZAR ESTA CALCULADORA.");
    }

    public static int Calcular(int segundo, int primero, String signo)
    {
        int resultado = 0;

        switch (signo)
        {
            case "+":
                resultado = primero + segundo;
                break;
            case "-":
                resultado = primero - segundo;
                break;
            case "*":
                resultado = primero * segundo;
                break;
            case "/":
                resultado = primero / segundo;
                break;
            default:
                System.out.println("Introduce un número entero o un signo (+ - * /)");
                break;
        }

        return resultado;
    }
}
