package UD1.EjercicioPropuesto9;

public class Circulo implements FiguraGeometrica
{
    //ATRIBUTOS
    float radio;
    float area = CalcularArea();

    //CONSTRUCTOR
    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public float getArea() {
        return area;
    }

    //MÉTODOS
    @Override
    public float CalcularArea() {
        return (float) (radio * Math.pow(Math.PI, 2));
    }

    @Override
    public float CalcularPerimetro() {
        return 0;
    }

    @Override
    public void Dibujar() {
        FiguraGeometrica.super.Dibujar();
    }
}
