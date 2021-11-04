package UD2.EjercicioPropuesto5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Principal
{
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        ArrayList<DivisionX2X3> numeros = new ArrayList<>();
        for (int i = 1; i <= 100; i++)
        {
            DivisionX2X3 div = new DivisionX2X3(i);
            numeros.add(div);
        }

        List<Future<Integer>> resultados;
        resultados = executor.invokeAll(numeros);

        executor.shutdown();

        for (Future<Integer> n : resultados)
        {
            System.out.println(n);
        }

    }
}

