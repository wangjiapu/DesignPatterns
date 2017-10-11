package 代理模式.静态代理;

public class Main {
    public static void main(String[] args){
        ISubject subject=new AgentStatic();
        Proxy proxy=new Proxy(subject);
        proxy.doingSomting();
    }
}
