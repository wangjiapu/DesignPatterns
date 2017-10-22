package 解释器模式

class AddExpression(exp1:ArithmeticExpression,exp2:ArithmeticExpression):OperatorExpression (exp1,exp2){
    override fun interpreter(): Int {
        println("${exp1.interpreter()+exp2.interpreter()}+")
        return exp1.interpreter()+exp2.interpreter()
    }
}