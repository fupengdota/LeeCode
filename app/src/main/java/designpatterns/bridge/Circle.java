package designpatterns.bridge;

public class Circle extends Shape {
    @Override
   public  void draw() {
        color.bePaint("圆形");
    }
}
