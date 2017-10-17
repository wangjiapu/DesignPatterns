package 策略模式;

public class Context {
    private Strategy strategy;//持有一个具体的策略对象

    public Context(Strategy s){
        this.strategy=s;
    }

    public double zhekou(double d){
        return this.strategy.strategyInterface(d);
    }

}
