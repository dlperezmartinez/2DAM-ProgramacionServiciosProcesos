package UD3.Ruleta;

public class Casino extends Thread{
    // ATRIBUTOS
    int numTiradas = 50;
    int tirada;

    synchronized void inicioPartida() throws InterruptedException {
        sleep(2000);
        System.out.println("La partida va a comenzar. ¡Hagan sus apuestas!");

        MainRuleta.iniciada = true;

        notifyAll();

        System.out.println("notificado");
    }

    // Este método pide el número al que apuestan los clientes y lo compara con el resultado de la tirada
    // si coincide devuelve true si no false.
    synchronized boolean ronda(int numeroApostar, int apuesta, String nombre) throws InterruptedException {
        while (!MainRuleta.apostado) {
            wait();
        }

        numTiradas--;

        System.out.println("El jugador " + nombre + " apuesta " + apuesta + " al número " + numeroApostar + ".");

        MainRuleta.apostado = false;

        if (tirada != 0) {
            if (numeroApostar == tirada) {
                MainRuleta.ronda = false;
                return true;

            } else {
                MainRuleta.ronda = false;
                return false;

            }
        } else {
            MainRuleta.ronda = false;
            return false;
        }
    }

    int girarRuleta() {
        return (int) (Math.random()*36+0);
    }

    synchronized void finPartida() throws InterruptedException {
        while (numTiradas > 0) {
            wait();
        }

        System.out.println("Fin de la partida. Gracias por participar.");
        MainRuleta.iniciada = false;
    }

    @Override
    public void run() {
        try {
            inicioPartida();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tirada = girarRuleta();

        try {
            finPartida();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
