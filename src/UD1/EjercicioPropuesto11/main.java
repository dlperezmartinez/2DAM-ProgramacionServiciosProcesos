package UD1.EjercicioPropuesto11;

import java.util.ArrayList;

public class main
{
    public static void main(String[] args) {


        //INSTANCIAS
        ArrayList<Material> materiales = new ArrayList<>();

        Material peli1 = new Pelicula("1", "titulo1", 10);
        Material peli2 = new Pelicula("2", "titulo2", 100);
        Material peli3 = new Pelicula("3", "titulo3", 500);
        Material peli4 = new Pelicula("4", "titulo4", 1000);

        Material libro1 = new Libros("10", "libro1", "autor1", 500);

        //ADD's
        materiales.add(libro1);
        materiales.add(peli1);
        materiales.add(peli2);
        materiales.add(peli3);
        materiales.add(peli4);

        for (Material n : materiales)
        {
            if (n instanceof Pelicula)
            {
                if (((Pelicula) n).getDuracion() >= 500)
                {
                    System.out.println(n.mostrar() + " Esta película es de larga duración");
                }

            }

            System.out.println(n.mostrar());
        }

    }
}
