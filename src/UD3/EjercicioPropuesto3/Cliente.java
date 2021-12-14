package UD3.EjercicioPropuesto3;

public class Cliente extends Thread{
    int ID;

    public Cliente(int ID) {
        this.ID = ID;
    }

    public void run(Agencia a) {
        System.out.println("Cliente " + ID + " --> comienza la reserva");
        a.asientosLibres(ID, 3);
    }
}
