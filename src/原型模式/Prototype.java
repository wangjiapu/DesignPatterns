package 原型模式;

/**
 * 浅克隆
 */
public class Prototype implements Cloneable {
    private String name;
    private int age;
    private  work w=null;

    public Prototype(){
        w=new work();
    }
    public void setW(String s,String c) {
       this.w.timeArea=s;
       this.w.company=c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
    public void show(){
        System.out.println(name+"---"+age+"---"+this.w.timeArea+"---"+this.w.company);
    }
}
