package co.unicauca.figures.domain;

/**
 * @author Juan Sebastian Latorre Pantoja
 * @author Juliana Andrea Diaz Cardenas
 */
public abstract class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}