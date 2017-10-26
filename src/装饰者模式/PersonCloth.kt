package 装饰者模式

abstract class PersonCloth(val man:Man):Component {
    override fun dressed() {
        man.dressed()
    }
}