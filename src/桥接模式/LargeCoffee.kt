package 桥接模式

public class LargeCoffee(impl:CoffeeAdditives):Coffee(impl){
    override fun makeCoffee() {
        println("大杯的${impl.addSomething()}咖啡")
    }
}