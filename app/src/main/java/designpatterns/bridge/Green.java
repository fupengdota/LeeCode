package designpatterns.bridge;

public class Green extends Color {
    @Override
    void bePaint(String shape) {
        System.out.println("绿色的"+shape);
    }
}
