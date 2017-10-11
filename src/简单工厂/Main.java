package 简单工厂;

public class Main {
    public static void main(String[] args){
        Person person=SampleFactory.makePerson("man");
        person.say();
        Person person1=SampleFactory.makePerson("woman");
        person1.say();

        Person person2=SampleFactory1.makePerson(Woman.class);
        person2.say();
        Person person3=SampleFactory1.makePerson(Man.class);
        person3.say();
    }
}
