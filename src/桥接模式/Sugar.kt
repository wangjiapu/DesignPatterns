package 桥接模式

class Sugar: CoffeeAdditives() {
    override fun addSomething(): String {
        return "加糖"
    }
}