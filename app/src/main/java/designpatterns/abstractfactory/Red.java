package designpatterns.abstractfactory;

import designpatterns.abstractfactory.Corlor;

public class Red implements Corlor {
    @Override
    public void fill() {
        System.out.println("填充了红色 ");
    }
}
