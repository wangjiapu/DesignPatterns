package 装饰者模式

fun main(args:Array<String>){
    val com:Component=Man()
    val goodcolth= Goodcloth(com)
    goodcolth.dressed()
    println("-------------------------------")
    val nomalcolth= NomalCloth(com)
    nomalcolth.dressed()
}