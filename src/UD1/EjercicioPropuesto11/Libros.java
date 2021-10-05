package UD1.EjercicioPropuesto11;

public class Libros extends Material{

    //ATRIBUTOS
    String autor;
    int numPags;

    //CONSTRUCTOR
    public Libros(String codigo, String titulo, String autor, int numPags) {
        super(codigo, titulo);
        this.autor = autor;
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return super.mostrar() + " Autor: " + autor + " Numero de páginas: " + numPags;
    }
}
