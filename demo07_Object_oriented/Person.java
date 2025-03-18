package demo07_Object_oriented;

public class Person {
    String name;
    int age;

    //行为 -> 成员方法 去掉了static
    public void eat(){
        System.out.println("人要干饭");
    }

    public void drink(){
        System.out.println("人要喝水");
    }
}
