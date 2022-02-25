package UD3.Ruleta;

public class Cliente extends Thread{
    // ATRIBUTOS
    Casino casino;

    String nombre;

    int banco = 1000;
    int apuesta = 1;
    int numeroApostar, estrategia; // estrategia: [1 = Apuesta constante] [2 = Mantingala] [3 = Alembert]
    boolean fijo;

    public Cliente(String nombre, boolean fijo, int estrategia, Casino casino) {
        if (fijo) {
            this.numeroApostar = (int) (Math.random()*35+1);
        }

        this.nombre = nombre;
        this.estrategia = estrategia;
        this.casino = casino;
    }

    // ESTRATEGIAS
    void apuestaConstante(boolean b) {
        banco += apuesta * 36; //En caso de acertar, la última apuesta se multiplica por 36 y se suma al banco
    }

    void mantingala(boolean b) {
        if (b) {
            banco += apuesta * 36;

            apuesta *= 2;
        } else {
            apuesta = 1;
        }
    }

    void alambert(boolean b) {
        if (b) {
            banco += apuesta * 36;

            apuesta += 1;
        } else {
            apuesta -= 1;
        }
    }

    synchronized void apostar() throws InterruptedException {
        System.out.println("Apuesta esperando...");
        while (!MainRuleta.iniciada || !MainRuleta.ronda) {
            wait();
        }
        System.out.println("despues del wait");

        boolean b = casino.ronda(numeroApostar, apuesta, nombre); //Primero apuestan y continuan según la estrategia
        banco -= apuesta; // Se resta la cantidad apostada al banco

        switch (estrategia) {
            case 1:
                apuestaConstante(b);
                break;
            case 2:
                mantingala(b);
                break;
            case 3:
                alambert(b);
                break;
        }

        MainRuleta.apostado = true;
        notifyAll();
    }

    @Override
    public void run() {
        try {
            apostar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
