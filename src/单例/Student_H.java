package 单例;

public class Student_H {


    private static  Student_H student_h;
    private Student_H(){
    }

    /**
     * 性能不是特别好
     *
     * 枷锁等待 性能消耗坑定不好
     * @return
     */
    public static synchronized Student_H newInstance(){
        //t1  t2  t3
        if (student_h==null){
            //t1判断为空进去new一个对象，然后轮到t2进去，
            // 又new一个对象出来。。。。所以线程不安全，
            // 在面试的时候就要加上synchronized同步操作
            student_h=new Student_H();
        }
        return student_h;
    }

    /**
     * 性能贼好：双重锁定
     *
     * 直接锁对象
     * 只有没有初始化的时候才会走到第三行，如果一旦初始化成功，就永远走不到那了
     * @return
     */

    public static Student_H getInatance(){
        if (student_h==null){
            synchronized (Student_H.class){
                if (student_h==null){
                    student_h=new Student_H();
                }
            }
        }
        return student_h;
    }

}
