package AreaAndPer.view;

import AreaAndPer.controller.ShapeController;
import AreaAndPer.model.Circle;
import AreaAndPer.model.Retangle;
import AreaAndPer.model.Triangle;

public class Main {
    public static void main(String[] args) {
        ShapeController shapeController = new ShapeController();
        Retangle rectangle = shapeController.inputRectangle();
        Circle circle = shapeController.inputCircle();
        Triangle trigle = shapeController.inputTriangle();
        shapeController.display(trigle, rectangle, circle);
    }
}
