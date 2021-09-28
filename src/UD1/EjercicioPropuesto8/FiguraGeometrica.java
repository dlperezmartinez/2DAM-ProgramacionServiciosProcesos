package UD1.EjercicioPropuesto8;

public interface FiguraGeometrica extends Dibujable {
    public float CalcularArea();

    public float CalcularPerimetro();

    @Override
    default void Dibujar() {

    }
}