package demo09_static;

public class Test01 {
    public static void main(String[] args) {
        //method03(); 不能直接访问非静态成员 因为静态方法先出生 他不知道后面会不会有非静态成员
        //静态成员中访问非静态成员
        new Test01().method03();//采用new对象
    }

    public static void method01() {
        //在静态方法中访问静态成员
        method02();//直接调用
        Test01.method02();//类名调用

        //不同类
        Person.drink();//类名调用
    }

    public static void method02() {

    }

    public void method03() {
        //同类中非静态成员访问静态成员
        method01();//直接调用
        Test01.method01();//类名调用

        //不同类非静态成员访问静态成员
        Person.drink();

    }
    public void method04(){
        //同类中在非静态方法中能直接访问非静态成员
        method03();//直接调用
        new Test01().method03();//new对象调用

        //不同类中在非静态方法中能直接访问非静态成员
        new Person().eat();//new对象带哦用
        /*
        1.不管在不在同一个类中,非静态成员都可以new对象调用
        2.不管在不在同一个类中,静态成员都可以类名调用
         */

    }
}
