package UD1.EjercicioPropuesto2;

public class Principal {
    public static void main(String[] args)
    {//INSTANCIAS
        Usuarios usuario1 = new Usuarios("nombre", "apellido", "apellidodos", "09318409N", "23434345", 1);
        Usuarios usuario2 = new Usuarios(usuario1); //Usuario copia

        System.out.println("Usuario 1: " + usuario1.toString());
        System.out.println("Usuario copia: " + usuario2.toString());
    }
}
