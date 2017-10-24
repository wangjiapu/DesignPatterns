package 抽象工厂

class Q3Factory : CarFactroy() {
    override fun createTire(): ITire {
        return NormalTire()
    }

    override fun createEngine(): IEngine {
        return DomesticEngine()
    }
}