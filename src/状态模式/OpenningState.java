package 状态模式;

public class OpenningState extends stata {
    @Override
    public void open() {
        System.out.println("打开了！");
    }

    @Override
    public void close() {
        super.context.setS(Context.closes);
        super.context.getS().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
