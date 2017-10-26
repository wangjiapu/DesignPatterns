package 适配器模式.ClassAdapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        adapter.isUsb();
        adapter.isPs2();
    }
}
