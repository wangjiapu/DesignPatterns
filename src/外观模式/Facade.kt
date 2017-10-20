package 外观模式

open class Facade {
    private val f1: Fun1 = Fun1()
    private val f2: Fun2 = Fun2()
    private val f3: Fun3 = Fun3()
    public fun of1(){
        f1.f1()
    }

    public fun of2(){
        f2.f2()
    }
    public fun of3(){
        f3.f3()
    }

    public fun funMethod(){
        f1.f1()
        f2.f2()
        f3.f3()
    }
}