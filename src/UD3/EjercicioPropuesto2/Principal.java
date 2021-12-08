package UD3.EjercicioPropuesto2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Dado> listaDados = new ArrayList<>();
        int tiradaTotal = 0;

        //Creación hilos
        for (int i = 0; i < 3; i++) {
            listaDados.add(new Dado(i));
        }

        //Start hilos
        for (Dado n : listaDados) {
            n.start();
        }

        //Join's
        for (Dado n : listaDados) {
            try {
                n.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Suma tiradas
        for (Dado n : listaDados) {
            tiradaTotal += n.getTirada();
        }

        System.out.println("Tirada total: " + tiradaTotal);
    }
}
