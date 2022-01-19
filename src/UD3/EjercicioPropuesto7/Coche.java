package UD3.EjercicioPropuesto7;

public class Coche implements Runnable {
    int matricula;

    public Coche(int matricula) {
        this.matricula = matricula;
    }

    @Override
    synchronized public void run() {
        //Llegada aleatoria
        try {
            //Simulación de lo que tarda el coche en aparcar
            Thread.sleep(Parking.tiempoRandom(59000,1000));

            //Si está lleno el parking se pone en COLA
            while (Parking.aparcamientos.size() >= 10) {
                System.out.println("No hay aparcamientos DISPONIBLES. (Coche de MATRICULA : " + this.matricula + " se pone a la COLA)");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //El coche aparca
        Parking.aparcamientos.add(this);
        System.out.println("Coche de MATRICULA: " + this.matricula + " ENTRA al parking. (Plazas libres: " + (10 - Parking.aparcamientos.size()) + ")");

        try {
            Thread.sleep(Parking.tiempoRandom(29000,1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //El coche se va
        Parking.aparcamientos.remove(this);
        System.out.println("Coche de MATRICULA: " + this.matricula + " SALE al parking. (Plazas libres: " + (10 - Parking.aparcamientos.size()) + ")");

        notify();
    }
}
