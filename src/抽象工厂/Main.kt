package 抽象工厂

fun main(args:Array<String>){
    println("-----------------------")
    val q3 = Q3Factory()
    q3.createEngine().engine()
    q3.createTire().tire()
    println("-----------------------")
    val q7 = Q7Factory()
    q7.createEngine().engine()
    q7.createTire().tire()
}