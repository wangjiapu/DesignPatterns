package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        Car car=new Car();
        InvocationHandler invocationHandler=new TimeHandler(car);
        Class<?> cls=car.getClass();
        IMove move= (IMove) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),invocationHandler);
        try {
            move.move();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
