package 解释器模式

import java.util.*

public class Calcilator(val context:String) {
    private val mExpStack=Stack<ArithmeticExpression>()
    init {
        var exp1:ArithmeticExpression
        var exp2:ArithmeticExpression
        val elements=context.split(" ")

        for (i in 0..elements.size-1){
            var j=i
            when(elements[j].get(0)){
                '+' -> {
                    exp1 = mExpStack.pop()
                    exp2 = NumExpreession((elements[++j]).toInt())
                    mExpStack.push(AddExpression(exp1,exp2))
                }
                else -> {
                    mExpStack.push(NumExpreession(elements[j].toInt()))
                }
            }
        }
    }

    fun calculate():Int{
        return mExpStack.pop().interpreter()
    }
}