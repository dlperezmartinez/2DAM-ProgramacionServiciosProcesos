package UD2.EjercicioExtra2;

public class Principal
{
    public static void main(String[] args) {
        //INSTANCIAS
        AccesRW array = new AccesRW();

        for (int i = 0; i <= 10; i++)
        {
            new Escritor(i, array);
        }

        for (int i = 0; i <= 10; i++)
        {
            new Lector(i, array);
        }
    }
}
