package 代理模式.静态代理;

/**
 * 真正需要干事情的实现类
 */
public class AgentStatic implements ISubject{
    @Override
    public void doingSomting() {
        System.out.println("真正的主题类，");
    }
}
