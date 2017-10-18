package 状态模式;

public class Main {
    public static void main(String[] args) {
       Context context=new Context();
       context.setS(new ClosingState());
        context.open();
        context.run();
        context.stop();
    }
}
