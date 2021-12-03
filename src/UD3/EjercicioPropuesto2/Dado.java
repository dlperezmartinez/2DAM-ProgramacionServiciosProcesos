package UD3.EjercicioPropuesto2;

public class Dado extends Thread{
    int ID, tirada;

    public Dado(int ID) {
        this.ID = ID;
    }

    @Override
    public void run() {
        tirada = (int) (Math.random()*5+1);
    }
}
