package demo06_Method;

public class demo06_Heavyload {
    public static void main(String[] args) {

    }
    /*
1.概述:方法名相同,参数列表不同的方法
2.什么叫参数列表不同:
  a.参数个数不同
  b.参数类型不同
  c.参数类型顺序不同

3.判断两个方法是否为重载方法,和什么无关:

  a.和参数名无关
  b.和返回值无关

  只与
  a.方法名
  b.参数列表类型
  有关
  因为先传值 再返回
    */
    public static void open(){}
    public static void open(int a){}
    //static void open(int a,int b){}
    public static void open(double a,int b){}
    //public static void open(int a,double b){}
    public void open(int i,double d){}
    public static void OPEN(){}
    public static void open(int i,int j){}
}
