package UD3.EjercicioPropuesto3;

public class Agencia {
    int asientos = 5;

    synchronized void asientosLibres(int id, int reserva) {
        if ((asientos -= reserva) > 0) {
            System.out.println("Cliente " + id + " --> Asientos disponibles.");

            pagar(id, reserva);
        } else {
            System.out.println("Cliente " + id + " --> No hay asientos disponibles.");
        }
    }

    synchronized void pagar(int id, int reserva) {
        System.out.println("Cliente " + id + " --> Pagando...");

        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reservarAsientos(id, reserva);
    }

    synchronized void reservarAsientos(int id, int reserva) {
        asientos -= reserva;

        System.out.println("Cliente " + id + " --> Reserva realizada con éxito!");
    }
}
