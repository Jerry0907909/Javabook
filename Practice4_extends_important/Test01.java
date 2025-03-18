package Module10.Practice4_extends_important;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();

        fu.method();//调用的是自己的method方法 因为new的是Fu类

        fu.methodFu();//自己的methodFu方法

        System.out.println("================");

        Zi zi = new Zi();

        zi.methodZi();

        zi.methodFu();

        zi.method();//子类中的method方法
    }
}
