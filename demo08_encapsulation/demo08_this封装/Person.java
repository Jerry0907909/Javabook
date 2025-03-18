package demo08_encapsulation.demo08_this封装;

public class Person {
    String name;//成员变量

    public void speak(String name){//局部变量
        System.out.println(this+"............");
        System.out.println(this.name+"您好,我是"+name);
    }
}
