package demo08_encapsulation;
/*
1.问题:
  定义成员变量,只要是new出来对象,就可以随便调用,随便赋值,哪怕是不合理的值我们也挡不住,怎么办?
  将属性封装起来(隐藏细节)

  a.关键字:private(私有化的) -> 被private修饰的成员只能在本类中使用,在别的类中使用不了

  b.注意:
    将代码放到一个方法中,也是封装的体现
    一个成员被private修饰也是封装的体现,只不过private最具代表性

    c.private的使用:
    修饰成员变量:private 数据类型 变量名
    修饰方法(函数):将public改成private,其他的都一样
 */

public class Person {
    private String name;
    private int age;

    //为name提供get/set方法
    public void setName(String name) {
        this.name = name;//this指向的肯定是成员变量
    }

    public String getName() {
        return name;
    }

    //为age提供get/set方法
    public void setAge(int age) {
        if (age< 0 || age > 150) {
            System.out.println("输入数据不符合合理范围");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }


}
