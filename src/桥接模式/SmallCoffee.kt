package 桥接模式

public class SmallCoffee(impl: CoffeeAdditives): Coffee(impl){
    override fun makeCoffee() {
        println("小杯的${impl.addSomething()}咖啡")
    }
}