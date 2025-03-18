package demo08_encapsulation;

import java.util.Scanner;

public class demo08_Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();//获取名字
        Scanner ac = new Scanner(System.in);
        int age = ac.nextInt();//获取年龄
        person.setName(name);//把自己设置好的姓名 用该接口传递到类里面去定义name
        person.setAge(age);//调用setAge方法将自己输入的age传入方法
        int Age = person.getAge();
        System.out.println(name);//输出 李欣杰
        System.out.println(Age);//输出 18

        //所以我们的Person类里面的name和age是私有的 其他类用不了
        //但是自己类里面可以定义方法进行调用 从而实现让方法成为类与外界的接口
    }
}
