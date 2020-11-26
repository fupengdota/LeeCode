package designpatterns.builder;

public abstract class Computer {
    private String mBoard;
    private String mDisplay;
    public String os;

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    abstract void setOs(String os);

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + os + '\'' +
                '}';
    }

}
