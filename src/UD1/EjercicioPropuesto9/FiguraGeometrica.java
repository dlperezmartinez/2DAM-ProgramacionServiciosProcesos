package UD1.EjercicioPropuesto9;

public interface FiguraGeometrica extends Dibujable, Comparable
{
    public float CalcularArea();

    public float CalcularPerimetro();

    @Override
    default void Dibujar() {

    }

    @Override
    default int compareTo(Object o) {
        return 0;
    }
}