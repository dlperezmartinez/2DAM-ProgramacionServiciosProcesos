package UD3.EjercicioPropuesto3;

public class Cliente extends Thread{

    public void run(Agencia a) {
        a.asientosLibres(3);
    }
}
