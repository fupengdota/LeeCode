package designpatterns.abstractfactory;

public class CorlorFactory  extends  AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Corlor getCorlor(String corlor) {
        if(corlor.equals("red")) {
            return  new Red();
        } else if(corlor.equals("blue")) {
            return  new Blue();
        } else if(corlor.equals("green")) {
            return  new Green();
        }
        return null;
    }
}
