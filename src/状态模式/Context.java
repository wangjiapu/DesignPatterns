package 状态模式;


public class Context {
    public final static OpenningState opens=new OpenningState();
    public static final ClosingState closes=new ClosingState();
    public static final RunningState runs=new RunningState();
    public static final StoppingState stops=new StoppingState();
    private stata s ;
    public void setS(stata s) {
        this.s=s;
        this.s.setContext(this);
    }

    public stata getS() {
        return s;
    }
    public void open(){
        this.s.open();
    }
    public void close(){
        this.s.close();
    }

    public void run(){
        this.s.run();
    }
    public void stop(){
        this.s.stop();
    }
}
