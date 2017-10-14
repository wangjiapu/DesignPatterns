package 观察者模式;

/**
 * 被观察者
 */
public interface ISubject {

    public void register(IObserver IObserver);//注册观察者
    public void unregister(IObserver IObserver);//取消注册

    public void notifyObserver();//通知观察者

    public Object  getUpdata(IObserver IObserver);//更新数据
}
