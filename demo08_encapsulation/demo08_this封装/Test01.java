package demo08_encapsulation.demo08_this封装;


public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "沉香";
        person.speak("刘彦昌");//刘彦昌您好,我是刘彦昌
     /* 1.如果成员变量和局部变量重名时,我们遵循"就近原则",先访问局部变量
        2.this概述:代表的是当前对象
        3.作用:this可以区分重名的成员变量和局部变量
          this点出来的一定是成员的变量
*/
        Person person1 = new Person();
        person1.name = "花生粒";
        person1.speak("福尔摩斯李");
        //this代表当前对象,那么具体代表哪个对象呢?
        //哪个对象调用的this所在的方法,this就代表哪个对象
        //在person和person1里面 this的先后指向不同

    }
}
