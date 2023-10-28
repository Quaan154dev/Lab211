package AreaAndPer.Rerpository;

import AreaAndPer.DataAccess.Function;
import AreaAndPer.model.Circle;
import AreaAndPer.model.Retangle;
import AreaAndPer.model.Triangle;

public class Repository implements IRepository{

    Function f = new Function();

    @Override
    public Triangle inputTriangle() {
        return f.inputTriangle();
    }

    @Override
    public Retangle inputRectangle() {
       return f.inputRectangle();
    }

    @Override
    public Circle inputCircle() {
        return f.inputCircle();
    }

    @Override
    public void display(Triangle trigle, Retangle rectangle, Circle circle) {
        f.display(trigle, rectangle, circle);
    }
    
}
