package 简单工厂;

/**
 * 逻辑判断来实现工厂类
 */
public class SampleFactory {
    public static Person makePerson(String type){
        if (type.equals("man")){
            Person person=new Man();
            return person;
        }else if (type.equals("woman")){
            Person person=new Woman();
            return person;
        }else {
            System.out.println("生产出错!");
            return null;
        }
    }
}
