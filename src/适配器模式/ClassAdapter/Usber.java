package 适配器模式.ClassAdapter;

public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("我是usb");
    }
}
