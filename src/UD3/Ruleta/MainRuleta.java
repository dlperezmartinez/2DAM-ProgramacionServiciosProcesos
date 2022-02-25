package UD3.Ruleta;

public class MainRuleta {
    // Variables para controlar los waits.

    static boolean iniciada = false;
    static boolean ronda = false;
    static boolean apostado = false;

    public static void main(String[] args) {
        // INSTANCIAS
        Casino casino = new Casino();

        Cliente c1 = new Cliente("Ciente1 FIJO E_1", true, 1, casino);
        Cliente c2 = new Cliente("Ciente2 FIJO E_2",true, 2, casino);
        Cliente c3 = new Cliente("Ciente3 FIJO E_3",true, 3, casino);
        Cliente c4 = new Cliente("Ciente4 ALEATORIO E_1",false, 1, casino);
        Cliente c5 = new Cliente("Ciente5 ALEATORIO E_2",false, 2, casino);
        Cliente c6 = new Cliente("Ciente6 ALEATORIO E_3",false, 3, casino);

        // STARTS
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        Thread t5 = new Thread(c5);
        Thread t6 = new Thread(c6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        Thread t = new Thread(casino);
        t.start();
    }
}
