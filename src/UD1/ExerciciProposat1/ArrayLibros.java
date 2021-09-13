package UD1.ExerciciProposat1;

public class ArrayLibros
{
    public static void main(String[] args)
    {
        //ARRAY
        Libros array[] = new Libros[5];


        //INSTANCIAS
        Libros l1 = new Libros("AAA", "titulo1", "autor1", 55);
        Libros l2 = new Libros("BBB", "titulo2", "autor2", 552);
        Libros l3 = new Libros("CCC", "titulo3", "autor3", 553);
        Libros l4 = new Libros("DDD", "titulo4", "autor4", 554);
        Libros l5 = new Libros("EEE", "titulo5", "autor5", 555);

        array[0] = l1;
        array[1] = l2;
        array[2] = l3;
        array[3] = l4;
        array[4] = l5;

        //PRINT
        System.out.println("\n-LIBROS-\n");

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Posición [" + i + "] = " + array[i].toString());
        }
    }
}
