package 观察者模式;

/**
 * 观察者
 */
public interface IObserver {
    public void updata();
    public void setSubject(ISubject subject);
}
