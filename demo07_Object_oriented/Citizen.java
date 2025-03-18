package demo07_Object_oriented;

public class Citizen {
    //姓名
    String name;  //默认值 null
    /*
      生日  MyDate类型

      MyDate属于自定义类型(引用数据类型)
      这种类型要操作之前必须要赋值
      怎么赋值?  需要new对象赋值
     */
    MyDate birthday = new MyDate(); // 默认值 null MyDate是我们自己创建的类 如果这么写 就已经new对象了
    //或者 MyDate birthday; 如果这么写 没有new对象 那么在其他类里面使用的时候 需要new对象赋值
    //身份证
    String idCard;  //默认值null
}

