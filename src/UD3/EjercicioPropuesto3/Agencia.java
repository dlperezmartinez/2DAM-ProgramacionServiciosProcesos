package UD3.EjercicioPropuesto3;

public class Agencia {
    int asientos = 5;

    void asientosLibres(int reserva) {
        asientos -= reserva;
    }
}
