package 适配器模式.ObjectAdapter;



public class Adapter implements Ps2 {
    private Usber usber;
    public Adapter(Usber u){
        this.usber=u;
    }
    @Override
    public void isPs2() {
        usber.isUsb();
    }

}
