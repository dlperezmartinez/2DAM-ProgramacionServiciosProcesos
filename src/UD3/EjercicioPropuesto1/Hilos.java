package UD3.EjercicioPropuesto1;

public class Hilos extends Thread{
    @Override
    public void run() {
        System.out.println(Math.random()*100+1);
    }
}
