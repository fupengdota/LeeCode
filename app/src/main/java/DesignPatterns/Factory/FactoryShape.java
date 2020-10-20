package DesignPatterns.Factory;

public class FactoryShape {

    public  Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }

        if(shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equals("SQUARE")) {
           return  new Square();
        }
        return null;
    }

}
