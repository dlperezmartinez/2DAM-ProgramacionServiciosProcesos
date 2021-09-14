package UD1.EjercicioPropuesto3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        ArrayList<Usuarios> listaUsuarios = null;

        //INSTANCIAS (usuarios que estarán creados por defecto)
        listaUsuarios.add(new Usuarios("nombre", "apellido", "apellidodos", "09318409N", "23434345", 1));
        listaUsuarios.add(new Usuarios(listaUsuarios.get(0))); //Usuario copia

        System.out.println("\n-BIBLIOTECA-\n");

        System.out.println("| VER USUARIOS | CREAR USUARIO | VER LIBROS | PRESTAR LIBROS | SALIR |");
        System.out.println("|      1       |       2       |     3      |        4       |   5   |");
        System.out.println("|");
        System.out.println("V");

        //MENU
        switch (in.nextInt())
        {
            case 1: //Muestra los datos de todos los usuarios
                for (Usuarios n : listaUsuarios )
                {
                    n.toString();
                }
            case 2: //Crea un usuario y lo añade a la ArrayList

            case 3:
            case 4:
            case 5:
            default:
                System.out.println("Introduce un número disponible.");
                break;
        }

    }
}
