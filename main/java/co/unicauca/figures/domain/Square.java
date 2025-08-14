package co.unicauca.figures.domain;

/**
 * @author Juan Sebastian Latorre Pantoja
 * @author Juliana Andrea Diaz Cardenas
 */

public class Square extends Figure {
    public Square(double side) {
        super(side, 0);
    }

    @Override
    public double calculateArea() {
        return x * x;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * x;
    }
}