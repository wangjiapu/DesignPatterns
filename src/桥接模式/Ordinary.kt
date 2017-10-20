package 桥接模式

class Ordinary : CoffeeAdditives() {
    override fun addSomething(): String {
        return "原味"
    }
}