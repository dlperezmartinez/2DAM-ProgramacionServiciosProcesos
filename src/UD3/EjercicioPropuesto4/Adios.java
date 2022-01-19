package UD3.EjercicioPropuesto4;

public class Adios extends Data implements Runnable{
    @Override
    public void run() {
//        Data data = new Data();
//
//        try {
//            data.adios();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            adios();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
