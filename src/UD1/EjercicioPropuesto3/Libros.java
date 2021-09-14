package UD1.EjercicioPropuesto3;

public class Libros {

    //ATRIBUTOS
    String codigo, titulo, autor;
    int numPags;

    //CONSTRUCTOR

    public Libros(String codigo, String titulo, String autor, int numPags)
    {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPags=" + numPags +
                '}';
    }
}
