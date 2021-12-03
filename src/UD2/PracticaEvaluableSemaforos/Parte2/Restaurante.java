package UD2.PracticaEvaluableSemaforos.Parte2;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Restaurante {
    //ATRIBUTOS
    ArrayList<Integer> comandas = new ArrayList<>();
    ArrayList<Integer> comandasPreparadas = new ArrayList<>();

    Semaphore mutex = new Semaphore(1);
    Semaphore mutex2 = new Semaphore(1);
    Semaphore mutex3 = new Semaphore(1);

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

            int memoria;

            try {
                mutex2.acquire();

                if (comandas.isEmpty()) {
                    System.out.println("TRABAJADOR " + id + " está esperando comandas.");
                } else {
                    System.out.println("TRABAJADOR " + id + " está preparando la comanda del CLIENTE " + comandas.get(0));
                    comandasPreparadas.add(comandas.get(0)); //Antes de elimarla, se lo pasa a la otra lista
                    memoria = comandas.get(0); //Necesito que se almacene aquí el número para que después del sleep on se encuentre la lista vacía
                    comandas.remove(0);

                    Thread.sleep((long) (Math.random() * 7000 + 4000)); //Añado este sleep para simular que lo está preparando

                    System.out.println("TRABAJADOR " + id + " a terminado de preparar la comanda del CLIENTE " + memoria);
                }

                mutex2.release();

                Thread.sleep((long) (Math.random() * 15000 + 5000));


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void repartir(int id){
        while(true) {
            try {
                Thread.sleep((long) (Math.random() * 45000 + 20000)); //Este sleep lo pongo arriba para que la salida no se llene al instante.

                mutex3.acquire();

                if (comandasPreparadas.isEmpty()) {
                    System.out.println("REPARTIDOR " + id + " está esperando.");
                } else {

                    System.out.println("REPARTIDOR " + id + " está repartiendo la comanda del CLIENTE " + comandasPreparadas.get(0));
                    comandasPreparadas.remove(0);
                }

                mutex3.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
