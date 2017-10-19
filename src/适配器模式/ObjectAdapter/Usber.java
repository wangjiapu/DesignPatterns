package 适配器模式.ObjectAdapter;

import 适配器模式.ClassAdapter.Usb;

public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("我是usb");
    }
}
