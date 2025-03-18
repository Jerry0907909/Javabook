package demo07_Object_oriented;

public class demo07_distinction {
    /*1.定义位置不同(重点)
    a.成员变量:类中方法外
    b.局部变量:定义在方法之中或者参数位置

2.初始化值不同(重点)
    a.成员变量:有默认值的,所以不用先手动赋值,就可以直接使用
    b.局部变量:是没有默认值的,所以需要先手动赋值,再使用

3.作用范围不同(重点)
    a.成员变量:作用于整个类
    b.局部变量:只作用于自己所在的方法,其他方法使用不了

4.内存位置不同(了解)
    a.成员变量:在堆中,跟着对象走
    b.局部变量:在栈中,跟着方法走

5.生命周期不同(了解)
    a.成员变量:随着对象的创建而产生,随着对象的消失而消失
    b.局部变量:随着方法的调用而产生,随着方法的调用完毕而消失

     */
    String name;//成员变量 定义在类中 全局均可使用 有默认值 也可以理解成全局变量

    public void eat() {//方法
        int i = 10;//局部变量 定义在方法中
        System.out.println(i);

        System.out.println(name);//成员变量不用手动赋值可以直接使用,因为有默认值
    }

    public void drink() {
        int j;
        //System.out.println(j);//局部变量没有默认值,所以需要手动赋值再使用 不然报错
        System.out.println(name);

        //System.out.println(i);//i是eat方法的局部变量,在drink中使用不了
    }
}