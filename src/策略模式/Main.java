package 策略模式;

public class Main {
    public static void main(String[] args){
        Strategy strategy=new ConcreteStrategyA();
        Context context=new Context(strategy);
        System.out.println(context.zhekou(300));
    }
}
