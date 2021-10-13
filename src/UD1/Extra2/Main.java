package UD1.Extra2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int i = 1;

        //INSTANCIAS
        Trabajador t1 = new Trabajador("nombre1", "Director general", "Madrid", 14, 51, 30, 3100);
        Trabajador t2 = new Trabajador("nombre2", "Director oficina", "Madrid", 14, 42, 21, 2900);
        Trabajador t3 = new Trabajador("nombre3", "Director oficina", "Valencia", 14, 41, 18, 2900);
        Trabajador t4 = new Trabajador("nombre4", "Jefe proyecto", "Madrid", 14, 38, 17, 3100);
        Trabajador t5 = new Trabajador("nombre5", "Jefe proyecto", "Valencia", 14, 33, 9, 3100);
        Trabajador t6 = new Trabajador("nombre6", "Analista", "Madrid", 14, 28, 7, 3100);
        Trabajador t7 = new Trabajador("nombre7", "Analista", "Madrid", 14, 29, 7, 3100);
        Trabajador t8 = new Trabajador("nombre8", "Analista", "Valencia", 14, 27, 5, 3100);
        Trabajador t9 = new Trabajador("nombre9", "Analista", "Valencia", 12, 28, 6, 3100);
        Trabajador t10 = new Trabajador("nombre10", "Programador", "Madrid", 14, 22, 2, 3100);
        Trabajador t11 = new Trabajador("nombre11", "Programador", "Madrid", 12, 21, 0, 3100);
        Trabajador t12 = new Trabajador("nombre12", "Programador", "Valencia", 14, 26, 4, 3100);
        Trabajador t13 = new Trabajador("nombre13", "Programador", "Valencia", 12, 24, 3, 3100);

        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();

        //ADD's
        listaTrabajadores.add(t1);
        listaTrabajadores.add(t2);
        listaTrabajadores.add(t3);
        listaTrabajadores.add(t4);
        listaTrabajadores.add(t5);
        listaTrabajadores.add(t6);
        listaTrabajadores.add(t7);
        listaTrabajadores.add(t8);
        listaTrabajadores.add(t9);
        listaTrabajadores.add(t10);
        listaTrabajadores.add(t11);
        listaTrabajadores.add(t12);
        listaTrabajadores.add(t13);

        t1.compareTo(listaTrabajadores);

        for (Trabajador n : listaTrabajadores)
        {
            System.out.println(i + ": " + n.toString());
            i++;
        }
    }
}
