package UD1.EjercicioPropuesto3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)
    {
        //SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        boolean continuar = true; //Se utiliza para los while
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();

        //INSTANCIAS (usuarios que estarán creados por defecto)
        //Usuarios
        listaUsuarios.add(new Usuarios("nombre", "apellido", "apellidodos", "09318409N", "23434345", 1));
        listaUsuarios.add(new Usuarios(listaUsuarios.get(0))); //Usuario copia

        //Libros
        Libros libro1 = new Libros("01", "titulo1", "autor1", 55);
        Libros libro2 = new Libros("02", "titulo2", "autor2", 552);
        Libros libro3 = new Libros("03", "titulo3", "autor3", 553);

        //AÑADIR LIBROS
        listaUsuarios.get(0).prestarLibros(libro1);
        listaUsuarios.get(0).prestarLibros(libro2);

        System.out.println(listaUsuarios.get(0).toString());

        System.out.println("\n Quieres ver los datos de los libros prestados? Y/N");

        while (continuar)
        {
            char sino = in.next().charAt(0);

            if (sino == 'y' || sino == 'Y')
            {
                for (Libros n : listaUsuarios.get(0).getLibrosPrestados()) //Pide la lista de libros de este usuario concreto y imprime los datos de cada uno
                {
                    System.out.println(n.toString());
                }

                continuar = false;

            } else if (sino == 'n' || sino == 'N')
            {
                System.out.println("\n-FIN DEL PROGRAMA-\n");

                continuar = false;

            } else
            {
                System.out.println("No válido.");
            }
        }

        /*System.out.println("\n-BIBLIOTECA-\n");

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
                System.out.print(   "Nombre: " + in.nextLine() +
                        "Primer apellido: " + in.nextLine() +
                        "Segundo apellido: " + in.nextLine() +
                        "DNI: " + in.nextLine() +
                        "Telefono: " + in.nextLine());
            case 3:
            case 4:
            case 5:
            default:
                System.out.println("Introduce un número disponible.");
                break;
        }*/
    }
}
