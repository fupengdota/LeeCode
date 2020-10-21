package DesignPatterns.Factory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填满green");
    }
}
