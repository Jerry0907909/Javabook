package demo07_Object_oriented;

public class 回顾 {
    /*模块七回顾:
    1.面向对象:是java的核心编程思想,自己的事情找对象帮我们去做
    有很多功能,别人帮我们实现好了,我们只需要找来这个对象,就可以调用这个对象中实现好的功能
    a.啥时候使用面向对象思想编程:在一个类中想访问另外一个类的成员(成员变量,成员方法)
    b.怎么使用:
    new对象,点成员
    特殊 :类名直接调用 -> 调用的成员中必须带static关键字
  2.类和对象:
    a.类:实体类
    属性(成员变量)  行为(成员方法,不带static的方法)
    b.对象:
    导包:两个类在同一个包下,使用对方的成员不需要导包,相反需要导包
            lang包下的类使用时不需要导包
    创建对象:想要使用哪个类中的成员,就new哪个类的对象
    类名 对象名 = new 类名()
    调用:想要使用哪个类的成员,就用哪个类的对象调用哪个成员
    对象名.成员

  3.匿名对象:没有等号左边的代码只有new
    a.注意:涉及到赋值,不要使用

  4.成员变量和局部变量的区别
    a.定义位置不同:
    成员:类中方法外
    局部:方法中或者参数位置
    b.初始化值不同
    成员:有默认值
    局部:没有默认值
    c.作用范围不同
    成员:作用于整个类
    局部:只作用于方法内部
    d.内存位置不同
    成员:在堆中,跟着对象走
    局部:在栈中,跟着方法走
    e.生命周期不同
    成员:随着对象的创建而创建,随着对象的消失而消失
    局部:随着方法的调用而产生,随着方法的调用完毕而消失

    模块八重点:
  1.要会使用private关键字修饰成员,并知道被private修饰之后作用(访问特点)是什么
  2.会使用set方法为属性赋值,使用get方法获取属性值
  3.会利用this关键字区分重名的成员变量和局部变量
  4.会利用空参构造创建对象,并知道空参构造作用
  5.会使用有参构造创建对象,并为属性赋值
  6.会快速生成一个标准的javabean类
  */

}
