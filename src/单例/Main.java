package 单例;

public class Main {
    public static void main(String[] args){
       /* Student_E s=Student_E.newInstance();
        Student_E s2=Student_E.newInstance();
        System.out.println(s==s2);//true
        System.out.println(s.equals(s2));//true*/
      A a=new A();
      a.go();
    }
}

class A extends Thread{
    //Student_H sh2;
    public void go(){
        System.out.println(System.currentTimeMillis());
        for (int i=0;i<1000;i++){
           run();
        }
        System.out.println(System.currentTimeMillis());
       for(int j=0;j<1000;j++){
         //  System.out.println("Student_H:"+Student_H.newInstance());
          // Student_H.newInstance();
           Student_H.getInatance();
       }
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void run() {
       // System.out.println("Student_H-thread:"+Student_H.newInstance());
        Student_H.newInstance();
    }
}
