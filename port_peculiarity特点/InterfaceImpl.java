package Module11.port_peculiarity特点;

public class InterfaceImpl implements InterfaceA,InterfaceB{
    @Override
    public void method() {
        System.out.println("重写的method方法");//无所谓这个method是哪个接口的 只用重写一次
    }
}//当一个类实现多个接口时,如果多个接口中默认方法有重名的
//且参数一样的,必须重写一次默认方法 不然区分不了
