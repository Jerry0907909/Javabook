package demo06_Method;

public class demo06_parameter_novalue {
    public static void main(String[] args) {
        /*
        1.格式:
  public static void 方法名(数据类型 变量名){
      方法体
  }
        2.调用:
  直接调用:方法名(具体的值) -> 调用的时候要给参数赋值
         */
        //需求:定义一个方法,实现两个整数相加
        sum(10,20);

    }
    public static void sum(int a,int b) {
        int sum=a+b;
        System.out.println("sum ="+sum);
    }

}
