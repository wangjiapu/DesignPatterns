package 装饰者模式

abstract class PersonCloth(val man:Component):Component {
    override fun dressed() {
        man.dressed()
    }
}