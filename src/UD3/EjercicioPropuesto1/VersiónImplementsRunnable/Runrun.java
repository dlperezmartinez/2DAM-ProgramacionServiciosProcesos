package UD3.EjercicioPropuesto1.VersiĆ³nImplementsRunnable;

public class Runrun implements Runnable{
    @Override
    public void run() {
        System.out.println(Math.random()*100+1);
    }
}
