package 适配器模式.ClassAdapter;

public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        System.out.println("我是ps2");
    }
}
