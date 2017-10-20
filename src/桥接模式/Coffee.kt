package 桥接模式

/**
 * 桥梁
 */
public abstract class Coffee(val impl:CoffeeAdditives){
    public abstract fun makeCoffee();

}