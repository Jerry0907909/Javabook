package Module10.Super_This01;

public class Person {
    int num = 10;//成员变量
    public Person(){
        //this(10);
        System.out.println("我是Person中的无参构造");
    }
    public Person(int data){
        this();
//        super();this和super都必须在构造函数的第一行; 所以不能同时出现
        System.out.println("我是Person当中的有参构造");

    }
    public void method(){
        int num = 20;//局部变量
        System.out.println(this.num);//this指向的是成员变量
        System.out.println("我是Person类中的method方法");
    }
    public void method01(){
        System.out.println("我是Person类中的method01方法");
    }
}
