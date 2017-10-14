package 观察者模式;

/**
 * 观察者的实现
 */
public class Observer implements IObserver {
    private ISubject sub;
    private String name;
    public Observer(String n){
        this.name=n;
    }
    @Override
    public void updata() {
        String msg = (String) sub.getUpdata(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
            System.out.println(name+":: Consuming message::"+msg);

    }

    @Override
    public void setSubject(ISubject subject) {
        this.sub=subject;
    }
}
