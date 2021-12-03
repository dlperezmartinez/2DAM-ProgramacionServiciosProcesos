package UD2.PracticaEvaluableSemaforos.Parte1;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Restaurante {
    //ATRIBUTOS
    ArrayList<Integer> comandas = new ArrayList<>();

    Semaphore mutex = new Semaphore(1);
    Semaphore mutex2 = new Semaphore(1);

    //CONSTRUCTOR

    //MÉTODOS
    void hacerComanda(int id) {
        try {
            mutex.acquire();

            Thread.sleep((long) (Math.random() * 5000 + 2000));

            comandas.add(id);
            System.out.println("El CLIENTE " + id + " a hecho un pedido - Comandas pendientes: " + comandas.size());

            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void cocinar(int id) {
        while(true) {
            try {
                mutex2.acquire();

                if (comandas.isEmpty()) {
                    System.out.println("TRABAJADOR " + id + " está esperando comandas.");
                } else {

                    System.out.println("TRABAJADOR " + id + " está preparando la comanda del CLIENTE " + comandas.get(0));
                    comandas.remove(0);
                }

                mutex2.release();

                Thread.sleep((long) (Math.random() * 15000 + 5000));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
