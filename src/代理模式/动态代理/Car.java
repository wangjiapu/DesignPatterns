package 代理模式.动态代理;

import java.util.Random;

public class Car implements IMove {

    @Override
    public void move() throws InterruptedException {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("汽车行驶中…");
    }
}
