package 策略模式;

public class ConcreteStrateyB implements Strategy {

    @Override
    public double strategyInterface(double d) {
        return d*0.85;
    }
}
