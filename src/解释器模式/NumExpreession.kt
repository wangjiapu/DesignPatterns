package 解释器模式

public class NumExpreession(val n:Int): ArithmeticExpression() {
    override fun interpreter(): Int {
        return n
    }
}