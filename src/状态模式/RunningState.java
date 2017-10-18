package 状态模式;

public class RunningState extends stata {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("正在运行！");
    }

    @Override
    public void stop() {
        super.context.setS(Context.stops);
        super.context.getS().stop();
    }
}
