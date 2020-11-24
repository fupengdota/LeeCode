package designpatterns.abstractfactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("打印长方形");
    }
}
