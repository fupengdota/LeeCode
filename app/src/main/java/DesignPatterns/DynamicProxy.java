package DesignPatterns;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy {

    interface  HelloInterface{
        void sayHello();
    }


    public class Hello implements  HelloInterface {

        @Override
        public void sayHello() {
            System.out.println("LOG SAY HELLO");
        }
    }

    public class  HelloInvocationHandler implements InvocationHandler {

        private  Object object;

        public HelloInvocationHandler(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName());
            return method.invoke(object,args);
        }
    }


    public void call() {
        HelloInterface  hello = new Hello();
        InvocationHandler invocationHandler = new HelloInvocationHandler(hello);
        HelloInterface helloInterface = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(),hello.getClass().getInterfaces(),invocationHandler);
        helloInterface.sayHello();
    }
}
