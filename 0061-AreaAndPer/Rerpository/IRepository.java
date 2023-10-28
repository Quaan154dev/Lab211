package AreaAndPer.Rerpository;

import AreaAndPer.model.Circle;
import AreaAndPer.model.Retangle;
import AreaAndPer.model.Triangle;

public interface IRepository {
    public Triangle inputTriangle();
    public Retangle inputRectangle();
    public Circle inputCircle();
    public void display(Triangle trigle, Retangle rectangle, Circle circle);
}
