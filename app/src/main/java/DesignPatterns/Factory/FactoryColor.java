package DesignPatterns.Factory;

public class FactoryColor  implements AbstractFactory {


    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getCorlor(String colorType) {
        if(colorType == null) {
            return null;
        }

        if(colorType.equals("green")) {
            return new Green();
        } else if(colorType.equals("blue")) {
            return  new Bule();
        }
        return null;
    }
}
