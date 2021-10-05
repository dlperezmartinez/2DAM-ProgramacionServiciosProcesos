package UD1.EjercicioPropuesto9;

public class Rectangulo implements FiguraGeometrica
{
    //ATRIBUTOS
    float base, altura;

    //CONSTRUCTOR
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //MÉTODOS
    @Override
    public float CalcularArea() {
        return base * altura;
    }

    @Override
    public float CalcularPerimetro() {
        return 0;
    }

    @Override
    public void Dibujar() {
        FiguraGeometrica.super.Dibujar();
    }

    //@Override
    public float compareTo(Rectangulo o) {
        return this.CalcularArea() - o.CalcularArea();
    }
}
