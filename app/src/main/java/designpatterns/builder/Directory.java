package designpatterns.builder;

public class Directory {
    Builder builder;

    public Directory(Builder builder) {
        this.builder = builder;
    }

    public void construct(String mBoard,String mDisplay) {
        builder.buildBoard(mBoard);
        builder.buildDisplay(mDisplay);
        builder.buildOs("苹果系统  啦啦啦");
    }
}
