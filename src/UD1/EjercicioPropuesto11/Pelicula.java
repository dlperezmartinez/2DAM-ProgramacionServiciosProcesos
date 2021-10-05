package UD1.EjercicioPropuesto11;

public class Pelicula extends Material
{
    //ATRIBUTOS
    int duracion;

    //CONSTRUCTOR
    public Pelicula(String codigo, String titulo, int duracion) {
        super(codigo, titulo);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(String codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " Duración: " + duracion;
    }

}
