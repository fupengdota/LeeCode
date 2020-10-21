package DesignPatterns.Factory;

public interface AbstractFactory {
   public abstract Shape getShape(String shapeType);
   public abstract  Color getCorlor(String colorType);
}
