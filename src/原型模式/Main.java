package 原型模式;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype=new Prototype();
        prototype.setName("pjw");
        prototype.setAge(12);
        prototype.setW("2015/7/1 - 2016/6/30", "Baidu");


        Prototype prototype1=(Prototype) prototype.clone();
        prototype1.setAge(25);
        prototype1.setName("xx");
        prototype1.setW("2013/8/1 - 2015/6/30", "Huawei");


        prototype.show();
        prototype1.show();
        System.out.println("-----------------------------------");
        PrototypeS pS=new PrototypeS();
        pS.setName("pjw");
        pS.setAge(12);
        pS.setW("2015/7/1 - 2016/6/30", "Baidu");


        PrototypeS ps1=(PrototypeS) pS.clone();
        ps1.setAge(25);
        ps1.setName("xx");
        ps1.setW("2013/8/1 - 2015/6/30", "Huawei");


        pS.show();
        ps1.show();

    }
}
