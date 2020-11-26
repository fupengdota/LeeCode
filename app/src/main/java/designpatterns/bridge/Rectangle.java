package designpatterns.bridge;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.bePaint("长方形");
    }
}
