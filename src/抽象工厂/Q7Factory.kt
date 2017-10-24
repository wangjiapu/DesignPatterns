package 抽象工厂

class Q7Factory:CarFactroy() {
    override fun createTire(): ITire {
        return SUVTire()
    }

    override fun createEngine(): IEngine {
        return ImportEngine()
    }


}