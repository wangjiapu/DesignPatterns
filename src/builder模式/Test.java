package builder模式;

public class Test {
    private int id;
    private String name;
    private  int age;
    private Test(Builder builer){
        this.id=builer.id;
        this.name=builer.name;
        this.age=builer.age;
    }
    public static class Builder{
        private int id;
        private String name;
        private int age;
        public Builder(){

        }
        public Builder id(int id){
            this.id=id;
            return this;
        }
        public Builder age(int s){
            this.id=s;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Test build(){
            return new Test(this);
        }
    }

    @Override
    public String toString() {
        return "Test:"+id+age+name;
    }
}
