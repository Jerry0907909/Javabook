package Module11.多态.成员方法;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.num);//父类中的num
        fu.method();//子类中重写的method方法
    }
}