package builder模式;

public class Main {
    public static void main(String[] args){
        Test test=new Test.Builder()
                .id(1)
                .name("test")
                .age(30)
                .build();
        System.out.println(test.toString());
    }
}
