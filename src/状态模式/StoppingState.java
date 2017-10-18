package 状态模式;

public class StoppingState extends stata{
    @Override
    public void open() {
        super.context.setS(Context.opens);
        super.context.getS().open();
    }

    @Override
    public void close() {
    }

    @Override
    public void run() {
        super.context.setS(Context.runs);
        super.context.getS().run();
    }

    @Override
    public void stop() {
        System.out.println("停止了！");
    }
}
