package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    public SquareTest() {
    }

    @Test
    void calculateArea() {
        System.out.println("calculate area");
        Square square = new Square(2.3);
        double expResult = 5.29;
        double result = square.calculateArea();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    void calculatePerimeter() {
        System.out.println("calculate Perimeter");
        Square square = new Square(2.3);
        double expResult = 9.2;
        double result = square.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
}