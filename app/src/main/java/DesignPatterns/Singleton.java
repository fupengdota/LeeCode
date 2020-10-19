package DesignPatterns;

/**
 * 双重检索单例模式
 */
public class Singleton {
    private volatile  static  Singleton singleton;

    private Singleton() {};

    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
