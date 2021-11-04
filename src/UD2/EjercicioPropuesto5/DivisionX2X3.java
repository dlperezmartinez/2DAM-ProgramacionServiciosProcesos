package UD2.EjercicioPropuesto5;

import java.util.concurrent.Callable;

public class DivisionX2X3 implements Callable<Integer>
{
    //ATRIBUTOS
    int num;

    public DivisionX2X3(int num)
    {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        if (num % 2 == 0 || num % 3 == 0)
        {
            return num;
        }
        return null;
    }
}
