package co.unicauca.figures.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TriangleTest {

    public TriangleTest() {
    }

    @Test
    void calculateArea() {
        System.out.println("calculate area");
        Triangle triangle = new Triangle(4.2, 4.5);
        double expResult = 9.45;
        double result = triangle.calculateArea();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    void calculatePerimeter() {
        System.out.println("calculate Perimeter");
        Triangle triangle = new Triangle(4.2, 4.5);
        double expResult = 14.85;
        double result = triangle.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
}