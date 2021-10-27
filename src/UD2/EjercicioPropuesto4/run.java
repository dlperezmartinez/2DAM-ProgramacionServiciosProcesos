package UD2.EjercicioPropuesto4;

import java.util.ArrayList;

public class run
{
    public static void main(String[] args) {
        ArrayList<Proceso> procesos = new ArrayList<>();

        Proceso A = new Proceso("A", 2, 6);
        Proceso B = new Proceso("B", 1, 4);
        Proceso C = new Proceso("C", 3, 2);
        Proceso D = new Proceso("D", 4, 6);
        Proceso E = new Proceso("E", 0, 12);
        Proceso F = new Proceso("F", 3, 8);

        procesos.add(A);
        procesos.add(B);
        procesos.add(C);
        procesos.add(D);
        procesos.add(E);
        procesos.add(F);

        procesos.sort(procesos.get(0).getTiempoLlegada());

        for(Proceso n : procesos)
        {
            System.out.println(n);
        }

        FCFS(procesos);
    }

    static void FCFS(ArrayList p)
    {
        //p.sort(p.g);
    }
}
