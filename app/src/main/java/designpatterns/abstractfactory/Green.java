package designpatterns.abstractfactory;

import designpatterns.abstractfactory.Corlor;

public class Green implements Corlor {
    @Override
    public void fill() {
        System.out.println("填充了绿色 ");
    }
}
