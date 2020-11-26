package designpatterns.builder;

public abstract class Builder {

    abstract void buildBoard(String mBoard);

    abstract void buildDisplay(String display);

    abstract void buildOs(String os);

    public abstract Computer builder();
}
