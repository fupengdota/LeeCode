package designpatterns.abstractfactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("打印正方形");
    }
}
