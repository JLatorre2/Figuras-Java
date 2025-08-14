package co.unicauca.figures.domain;
/**
 * @author Juan Sebastian Latorre Pantoja
 * @author Juliana Andrea Diaz Cardenas
 */
public class Triangle extends Figure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return (x * y) / 2;
    }

    @Override
    public double calculatePerimeter() {
        //Base + Altura + Hipotenusa (Triangulo Rectangulo)
        return x + y + Math.sqrt(x*x + y*y);
    }
}