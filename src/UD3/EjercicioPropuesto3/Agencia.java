package UD3.EjercicioPropuesto3;

public class Agencia {
    int asientos = 5;

    void asientosLibres(int reserva) {
        if ((asientos -= reserva) > 0) {
            System.out.println("Asientos disponibles.");

            pagar(reserva);
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }

    void pagar(int reserva) {
        System.out.println("Pagando...");

        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reservarAsientos(reserva);
    }

    void reservarAsientos(int reserva) {
        asientos -= reserva;

        System.out.println("Reserva realizada con éxito!");
    }
}
