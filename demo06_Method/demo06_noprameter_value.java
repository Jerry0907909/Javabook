package demo06_Method;

public class demo06_noprameter_value {
    public static void main(String[] args) {
        //打印调用 -> 涛哥不推荐
        System.out.println(sum());

        //赋值调用-> 极力推荐
        int result = sum();
        System.out.println("result = " + result);
    }
    //需求:定义一个方法,实现两个整数相加,将结果返回
    public static int sum() {
        int a=10;
        int b=20;
        int sum= a+b;
        return sum;
    }
}

/*
1.格式:
  public static 返回值类型 方法名(){
      方法体
      return 结果
  }
2.调用: 返回值返回给了谁? 哪里调用返回给哪里
  a.打印调用:sout(方法名()) -> 不推荐使用
  b.赋值调用:调用完之后用一个变量接收返回值结果 -> 极力推荐
    数据类型 变量名 = 方法名()
 */ //说明
