package UD3.EjercicioPropuesto8;

import java.util.ArrayList;

public class Principal {
    private static int tempMaxFinal = 0;

    public static void main(String[] args) throws InterruptedException {
        int[] temperaturas = new int[100];

        int minCiclo = 0;

        ArrayList<Thread> t = new ArrayList<>();

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = (int)(Math.random()*54+1) - 10;
        }

        for (int i = 0; i <= 10; i++) {
            int hilo = i;
            int maxCiclo = minCiclo + 9;

            t.add(
                    new Thread(() -> {
                        int tempMax = 0;

                        for (int j = (maxCiclo-9); j < maxCiclo; j++) { //No sé por que no me dejaba igualar j a minCiclo

                            if (temperaturas[j] > tempMax) {
                                tempMax = temperaturas[j];
                            }
                        }

                        System.out.println("Hilo: " + hilo + " -> " + tempMax + "ºC de MÁXIMA.");

                        if (Principal.tempMaxFinal < tempMax) {
                            Principal.tempMaxFinal = tempMax;
                        }
                    }));

            minCiclo += 9;
        }

        for (Thread n : t) {
            n.start();
        }

        for (Thread n : t) {
            n.join();
        }

        System.out.println("Temperatura máxima final: " + tempMaxFinal);
    }
}
