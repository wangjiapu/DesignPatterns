package 简单工厂;

/**
 * 反射实现
 */
public class SampleFactory1 {
    public static Person makePerson(Class c){
        Person person=null;
        try {
            person= (Person) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("不支持抽象类和接口");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("没有足够权限，即不能访问私有对象");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("类不存在");
            e.printStackTrace();
        }

        return person;
    }
}
