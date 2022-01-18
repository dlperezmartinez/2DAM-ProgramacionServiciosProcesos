package UD3.EjercicioPropuesto6;

public class system {
    public static void main(String[] args) {
        //Grupo PRINCIPAL
        ThreadGroup system = new ThreadGroup("System");

        //Grupo MAIN / hijo del PRINCIPAL
        ThreadGroup tMain = new ThreadGroup(system, "Main");

        //Subgrupos del MAIN
        ThreadGroup subgrupo_1 = new ThreadGroup(tMain, "subgrupo_1");
        ThreadGroup subgrupo_2 = new ThreadGroup(tMain, "subgrupo_2");

        //Hilo del MAIN
        Thread tmain = new Thread(tMain, "main");

        //Hilos del SUBGRUPO1
        Thread hilo1 = new Thread(subgrupo_1, "hilo1");
        Thread hilo2 = new Thread(subgrupo_1, "hilo2");

        //Hilo del SUBGRUPO2
        Thread hilo3 = new Thread(subgrupo_2, "hilo3");

        //.............
        System.out.println("\n-NOMBRE DEL GRUPO DEL HILO-\n");
        System.out.println("-main: " + tmain.getThreadGroup());
        System.out.println("-hilo1: " + hilo1.getThreadGroup());
        System.out.println("-hilo2: " + hilo2.getThreadGroup());
        System.out.println("-hilo3: " + hilo3.getThreadGroup());
        //.............
        System.out.println("\n-NÚMERO DE GRUPOS ACTIVOS-\n");
        System.out.println(tMain.activeGroupCount());
        //.............
        System.out.println("\n-DETALLES DE LOS GRUPOS ACTIVOS-\n");
        system.list();
        //.............
        System.out.println("\n-PRIORIDADES DE LOS GRUPOS EXISTENTES-\n");
        System.out.println("System: " + system.getMaxPriority());
        System.out.println("Main: " + tMain.getMaxPriority());
        System.out.println("subgrupo_1: " + subgrupo_1.getMaxPriority());
        System.out.println("subgrupo_2: " + subgrupo_2.getMaxPriority());
        //.............
        System.out.println("\n-CAMBIO DE PRIORIDADES A LOS SUBGRUPOS EXISTENTES-\n");
        tMain.setMaxPriority(5);
        subgrupo_1.setMaxPriority(3);
        subgrupo_2.setMaxPriority(2);
        System.out.println("Main: " + tMain.getMaxPriority());
        System.out.println("subgrupo_1: " + subgrupo_1.getMaxPriority());
        System.out.println("subgrupo_2: " + subgrupo_2.getMaxPriority());
        //.............
        System.out.println("\n-NOMBRE DEL PADRE-\n");
        System.out.println("Main: " + tMain.getParent());
        System.out.println("subgrupo_1: " + subgrupo_1.getParent());
        System.out.println("subgrupo_2: " + subgrupo_2.getParent());
        //.............
        System.out.println("\n-COMPROBACIÓN DEL PADRE-\n");
        System.out.println("Main: " + tMain.parentOf(system));
        System.out.println("subgrupo_1: " + subgrupo_1.parentOf(system));
        System.out.println("subgrupo_2: " + subgrupo_2.parentOf(system));
        //.............
        //.............

    }
}
