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

    // Este es el método que hace los waits para otras clases
    synchronized void espera() throws InterruptedException {
        while (!MainRuleta.iniciada ) { //|| !MainRuleta.ronda
            wait();
        }

        notifyAll();
        System.out.println("notificado2");
    }

    synchronized void notificar() {
        notifyAll();
    }

    // Este método pide el número al que apuestan los clientes y lo compara con el resultado de la tirada
    // si coincide devuelve true si no false.
    synchronized boolean ronda(int numeroApostar, int apuesta, String nombre) throws InterruptedException {
        while (MainRuleta.apostado < 6) {
            wait();
        }
        System.out.println("ronda comienza");

        numTiradas--;

        System.out.println("El jugador " + nombre + " apuesta " + apuesta + " al número " + numeroApostar + ".");

        MainRuleta.apostado++;
        System.out.println("apostado = true");

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

    synchronized int girarRuleta() throws InterruptedException {
        while (MainRuleta.apostado < 6) {
            wait();
        }
        return (int) (Math.random() * 36 + 0);
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

        while (true) {
            try {
                tirada = girarRuleta();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                finPartida();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
