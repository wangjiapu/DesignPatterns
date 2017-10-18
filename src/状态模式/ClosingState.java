package 状态模式;

public class ClosingState extends stata {
    @Override
    public void open() {
        super.context.setS(Context.opens);
        super.context.getS().open();
    }
    @Override
    public void close() {
        System.out.println("门关了！");
    }

    @Override
    public void run() {
        super.context.setS(Context.runs);
        super.context.getS().run();
    }

    @Override
    public void stop() {
        super.context.setS(Context.stops);
        super.context.getS().stop();
    }
}
