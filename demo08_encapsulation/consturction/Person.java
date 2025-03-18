package demo08_encapsulation.consturction;

public class Person {
    private String name;
    private  int age;

//    无参构造
    public Person(){
        System.out.println("我是无参构造");
    }

    //有参构造
//    public Person(String name){
//        this.name = name;
//    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
格式:
  public 类名(形参){
      为属性赋值
  }

作用:
  a.new对象
  b.为属性赋值

特点:
  jvm不会自动提供有参构造,但是将有参构造手写出来,jvm将不再提供无参构造,所以建议有参,无参的构造都手写上去 不然报错
     */

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
/*
1.概述:方法名和类名一致并且能初始化对象的方法
2.分类:
  a.无参构造:没有参数
  b.有参构造:有参数,参数是为指定的属性赋值
  c.满参构造:给所有属性赋值

  以上构造咱们不用记那么详细,我们就记有参和无参构造就可以了

3.特点:
  a.方法名和类名一致
  b.没有返回值,连void都没有
 */
}
