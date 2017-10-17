package 原型模式;

public class PrototypeS implements Cloneable {
    private String name;
    private int age;
    private  work w=null;

    public PrototypeS(){
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
    protected PrototypeS clone() throws CloneNotSupportedException {
        String name=new String(this.name);
        int age=this.age;
        PrototypeS prototypeS=new PrototypeS();
        prototypeS.setName(name);
        prototypeS.setAge(age);
        prototypeS.setW(w.timeArea,w.company);
        return prototypeS;
    }
    public void show(){
        System.out.println(name+"---"+age+"---"+this.w.timeArea+"---"+this.w.company);
    }
}
