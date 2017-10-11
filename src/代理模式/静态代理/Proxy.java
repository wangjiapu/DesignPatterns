package 代理模式.静态代理;

/**
 * 以聚合方式实现代理主题
 */
public class Proxy  implements ISubject{
    private ISubject subject;
    public Proxy(ISubject s){
        this.subject=s;
    }
    @Override
    public void doingSomting() {
        System.out.println("操作开始");
        subject.doingSomting();
        System.out.println("操作结束");
    }
}
