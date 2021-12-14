package UD3.EjercicioPropuesto3;

public class Principal {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        for (int i = 0; i <= 2; i++)
        {
            new Cliente(i).run(agencia);
        }
    }
}
