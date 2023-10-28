package AreaAndPer.controller;

import AreaAndPer.Rerpository.Repository;
import AreaAndPer.model.Circle;
import AreaAndPer.model.Retangle;
import AreaAndPer.model.Triangle;

public class ShapeController {
    Repository repository = new Repository();

    public Triangle inputTriangle() {
        return repository.inputTriangle();
    }

    public Retangle inputRectangle() {
        return repository.inputRectangle();
    }

    public Circle inputCircle() {
        return repository.inputCircle();
    }

    public void display(Triangle trigle, Retangle rectangle, Circle circle) {
        repository.display(trigle, rectangle, circle);
    }
}
