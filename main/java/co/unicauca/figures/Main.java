package co.unicauca.figures;

import co.unicauca.figures.domain.Circle;
import co.unicauca.figures.domain.Triangle;
import co.unicauca.figures.domain.Square;
import co.unicauca.figures.domain.Figure;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Juan Sebastian Latorre Pantoja
 * @author Juliana Andrea Diaz Cardenas
 */

public class Main {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1.0); //radio
        Figure fig2 = new Square(2.3); //lado
        Figure fig3 = new Triangle(4.2, 4.5); //base y altura

        List<Figure> figures = new ArrayList<>() ;
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        for(Figure fig: figures){
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
            System.out.println("---------------------------------------------------");
        }
    }
}
