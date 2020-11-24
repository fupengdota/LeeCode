package designpatterns.abstractfactory;

import designpatterns.abstractfactory.Corlor;

public class Blue implements Corlor {
    @Override
    public void fill() {
        System.out.println("填充了蓝色 ");
    }
}
