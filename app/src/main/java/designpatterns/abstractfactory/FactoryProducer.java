package designpatterns.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equals("shape")) {
            return new ShapeFactory();
        } else if (factory.equals("corlor")) {
            return new CorlorFactory();
        }

        return null;
    }
}
