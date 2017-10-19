package 适配器模式.ObjectAdapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter=new Adapter(new Usber());
        adapter.isPs2();
    }
}
