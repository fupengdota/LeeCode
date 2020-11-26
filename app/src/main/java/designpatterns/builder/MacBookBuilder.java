package designpatterns.builder;

public class MacBookBuilder extends Builder {

    Computer computer = new MacBook();

    public MacBookBuilder() {
    }


    @Override
    void buildBoard(String mBoard) {
        computer.setmBoard(mBoard);
    }

    @Override
    void buildDisplay(String display) {
        computer.setmDisplay(display);
    }

    @Override
    void buildOs(String os) {
        computer.setOs(os);
    }

    @Override
    public Computer builder() {
        return computer;
    }
}
