package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Subjecter implements ISubject {
    public List<IObserver> IObservers;
    private boolean changed;
    private String message;
    private final Object MUTEX=new Object();

    public Subjecter(){
        IObservers =new ArrayList<>();
    }
    @Override
    public void register(IObserver IObserver) {
        if (IObserver ==null)
            throw new NullPointerException("NULL IObserver");
        IObservers.add(IObserver);
    }

    @Override
    public void unregister(IObserver IObserver) {
        IObservers.remove(IObserver);
    }

    @Override
    public void notifyObserver() {
        List<IObserver> observersl=null;
        synchronized (MUTEX){
            if (!changed)
                return;
            observersl=new ArrayList<>(this.IObservers);
            this.changed=false;
        }
        for (IObserver IObserver :observersl){
            IObserver.updata();
        }
    }

    @Override
    public Object getUpdata(IObserver IObserver) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message Posted to subject:"+msg);
        this.changed=true;
        this.message=msg;
        notifyObserver();
    }
}
