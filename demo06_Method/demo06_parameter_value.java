package demo06_Method;

import java.util.Scanner;

public class demo06_parameter_value {
    public static void main(String[] args) {
//需求:定义一个方法,实现两个整数相加,将结果返回
        int sum = sum(10, 20);
        System.out.println("sum = " + sum);
    }

    public static int sum(int a,int b) {
        int sum=a+b;
        return sum;

    }
}
/*
6.有参数有返回值定义以及执行流程
1.格式:
  public static 返回值类型 方法名(参数){
      方法体
      return 结果
  }

2.调用:
  a.打印调用:
    sout(方法名(具体的值))

  b.赋值调用(极力推荐)
    数据类型 变量名 = 方法名(具体的值)
 */ //说明
