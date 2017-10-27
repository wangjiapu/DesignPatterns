package 装饰者模式

class Goodcloth(val c:Component):PersonCloth(c) {

    override fun dressed() {
        super.dressed()
        dressShirt()
        dressJean()
    }

    fun dressShirt(){
        println("穿了一件短袖")

    }

    fun dressJean(){
        println("穿了一个牛仔库")
    }
}