package UD1.Extra2;

import java.util.ArrayList;

public class Trabajador //implements Comparable
{
    //ATRIBUTOS
    String nombre, cargo, oficina;
    int numPagas, edad, añosExp, sueldoMensual;

    public Trabajador(String nombre, String cargo, String oficina, int numPagas, int edad, int añosExp, int sueldoMensual) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.oficina = oficina;
        this.numPagas = numPagas;
        this.edad = edad;
        this.añosExp = añosExp;
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public String toString() {
        return nombre + "(" + edad + ")-" + cargo + " en la oficina de " + oficina + ". Experiencia: " + añosExp + " años. Sueldo: " + sueldoMensual + ".";
    }

    public int compareTo(ArrayList<Trabajador> lista) {
        for (Trabajador n : lista)
        {
            switch (n.cargo)
            {
                case "Director general":
                    return 1;
                case "Director oficina":
                    return 2;
                case "Jefe Proyecto":
                    return 3;
                case "Analista":
                    return 4;
                case "Programador":
                    return 5;
            }
        }
        return 0;
    }
}
