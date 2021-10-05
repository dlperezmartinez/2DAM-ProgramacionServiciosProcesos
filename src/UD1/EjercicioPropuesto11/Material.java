package UD1.EjercicioPropuesto11;

public class Material
{
    //ATRIBUTOS
    protected String codigo, titulo;

    //CONSTRUCTOR
    public Material(String codigo, String titulo)
    {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    //GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //MÉTODOS
    public String mostrar()
    {
        return codigo + ": " + titulo;
    }


}
