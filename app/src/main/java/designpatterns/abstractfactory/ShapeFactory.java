package designpatterns.abstractfactory;

public class ShapeFactory  extends  AbstractFactory{

    @Override
    public Shape getShape(String  shape) {
        if(shape.equals("circle")) {
            return new Circle();
        } else if(shape.equals("square"))  {
            return new Square();
        } else if(shape.equals("rectangle")) {
            return new Rectangle();
        }else {
            return null;
        }
    }

    @Override
    public Corlor getCorlor(String corlor) {
        return null;
    }
}
