package 桥接模式

fun main(args:Array<String>){
  val implOd=Ordinary()//原味
    val implSg=Sugar()//加糖
    val l=LargeCoffee(implOd)
    l.makeCoffee()

    val l2=LargeCoffee(implSg)
    l2.makeCoffee()

}