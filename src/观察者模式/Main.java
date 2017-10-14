package 观察者模式;

public class Main {
    public static void main(String[] args){
        Subjecter subjecter =new Subjecter();
        IObserver ob1=new Observer("o1");
        IObserver ob2=new Observer("o2");
        IObserver ob3=new Observer("o3");
        subjecter.register(ob1);
        subjecter.register(ob2);
        subjecter.register(ob3);
        ob1.setSubject(subjecter);
        ob2.setSubject(subjecter);
        ob3.setSubject(subjecter);

        ob2.updata();
        subjecter.postMessage("11111111");
    }
}
