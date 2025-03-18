package demo07_Object_oriented;

public class demo07_practice {
    //需求:用代码去描述一个手机类,在测试类中为手机类中的属性赋值,并且调用手机类中的功能
    public static void main(String[] args) {
        Phone Xiaomi = new Phone();
        Xiaomi.brand = "xiaomi";
        Xiaomi.color = "White";
        Xiaomi.price = 4999;

        Xiaomi.call("Jinlian Pan");
        Xiaomi.message();
        String sc = Xiaomi.message();
        System.out.println(sc);

        System.out.println("======================");

        //匿名对象
        new Person().eat();//这样可以办到
        //BUT
        new Person().name = "Da Lang";
        System.out.println(new Person().name);//输出null 所以涉及到赋值 不要用匿名对象
    }
}
