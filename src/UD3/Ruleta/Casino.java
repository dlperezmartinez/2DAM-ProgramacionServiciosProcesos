package UD3.Ruleta;

import UD1.Extra2.Main;

public class Casino extends Thread{
    // ATRIBUTOS
    int numTiradas = 50;
    int tirada;
    boolean ruletaGirada = false;

    synchronized void inicioPartida() throws InterruptedException {
        sleep(2000);
        System.out.println("La partida va a comenzar. ¡Hagan sus apuestas!");

        MainRuleta.iniciada = true;

        notifyAll();
    }

    // Este es el método que hace los waits para otras clases
    synchronized void espera() throws InterruptedException {
        while (!MainRuleta.iniciada || !(MainRuleta.apostado < 6)) { //|| !MainRuleta.ronda
            wait();
        }

        MainRuleta.apostado++;

        notifyAll();
    }

    synchronized void notificar() {
        notifyAll();
    }

    // Este método pide el número al que apuestan los clientes y lo compara con el resultado de la tirada
    // si coincide devuelve true si no false.
    synchronized boolean ronda(int numeroApostar, int apuesta, String nombre) throws InterruptedException {
        sleep(2000);

        while (MainRuleta.apostado < 6) {
            wait();
        }

        System.out.println("El jugador " + nombre + " apuesta " + apuesta + " al número " + numeroApostar + ".");

        MainRuleta.apostado++;

        while (!ruletaGirada) {
            wait();
        }

        if (tirada != 0) {
            if (numeroApostar == tirada) {
                MainRuleta.ronda = false;
                MainRuleta.apostado = 0;
                ruletaGirada = false;
                return true;

            } else {
                MainRuleta.ronda = false;
                MainRuleta.apostado = 0;
                ruletaGirada = false;
                return false;
            }
        } else {
            MainRuleta.ronda = false;
            MainRuleta.apostado = 0;
            ruletaGirada = false;
            return false;
        }
    }

    synchronized int girarRuleta() throws InterruptedException {
        int tirada;

        while (MainRuleta.apostado < 6) {
            wait();
        }

        System.out.println("Girando ruleta...");
        sleep(2000);

        tirada = (int) (Math.random() * 36 + 0);

        ruletaGirada = true;
        numTiradas--;
        notifyAll();

        System.out.println("Tirada " + numTiradas + ": " + tirada);
        MainRuleta.apostado = 0; // Una vez tirada la ruleta se puede apostar otra vez

        return tirada;
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

//            try {
//                finPartida();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
