package DesignPatterns.Factory;

public class FactoryShape  implements  AbstractFactory{



    @Override
    public Shape getShape(String shapeType) {
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

    @Override
    public Color getCorlor(String corlorType) {
        return null;
    }
}
