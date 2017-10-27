package 装饰者模式

class NomalCloth(val p:Component):PersonCloth(p) {
    override fun dressed() {
        super.dressed()
        dressJean()
        dressShirt()
    }
    fun dressShirt(){
        println("穿了一件短袖")

    }

    fun dressJean(){
        println("穿了一个牛仔库")
    }
}