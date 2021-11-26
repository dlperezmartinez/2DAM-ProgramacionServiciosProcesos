package UD2.PracticaEvaluableSemaforos;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Restaurante{
    //ATRIBUTOS
    ArrayList<Integer> comandas = new ArrayList<>();

    Semaphore mutex = new Semaphore(1);
    Semaphore mutex2 = new Semaphore(1);

    //CONSTRUCTOR

    //MÉTODOS
    void hacerComanda(int id){
        try {
            mutex.acquire();
            Thread.sleep((long) (Math.random()*5000+2000));

            comandas.add(id);
            System.out.println("El cliente " + id + " a hecho un pedido - Comandas pendientes: " + comandas.size());

            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void cocinar(int id){
        if(comandas.isEmpty())
        {
            System.out.println("Trabajador " + id + " está esperando comandas.");
        } else {
            try {
                mutex2.acquire();

                System.out.println("Trabajador " + id + " está preparando la comanda de " + comandas.indexOf(0));
                comandas.remove(0);

                mutex2.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
