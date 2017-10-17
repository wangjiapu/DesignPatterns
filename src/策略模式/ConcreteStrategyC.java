package 策略模式;

public class ConcreteStrategyC implements Strategy {

    @Override
    public double strategyInterface(double d) {
        return d*0.95;
    }
}
