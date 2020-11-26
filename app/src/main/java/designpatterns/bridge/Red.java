package designpatterns.bridge;

public class Red extends Color {
    @Override
    void bePaint(String shape) {
        System.out.println("红色的"+shape);
    }
}
