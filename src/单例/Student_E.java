package 单例;

/**
 * 饿汉
 */
public class Student_E {
    //一开始就加载这个对象，以后都使用这个对象
    private static Student_E student_e=new Student_E();

    private Student_E(){//私有，不让外部调用创造对象
    }

  public static Student_E newInstance(){
        return student_e;
  }
}
