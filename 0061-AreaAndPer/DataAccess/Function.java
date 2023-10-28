package AreaAndPer.DataAccess;

import AreaAndPer.common.Valid;
import AreaAndPer.model.Circle;
import AreaAndPer.model.Retangle;
import AreaAndPer.model.Triangle;

public class Function {
    Valid v = new Valid();

     public Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = v.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = v.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = v.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }

    }

    public Retangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = v.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = v.checkInputDouble();
        return new Retangle(width, length);
    }

    public Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = v.checkInputDouble();
        return new Circle(radius);
    }

    public void display(Triangle trigle, Retangle rectangle, Circle circle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }

}
