package demo06_Method;

import java.util.Scanner;

public class demo06_practice1 {
    public static void main(String[] args) {
        //需求:
        //   键盘录入一个整数,将整数传递到另外一个方法中,在此方法中判断这个整数的奇偶性
        //   如果是偶数,方法返回"偶数"  否则返回"奇数"
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String st=judge(a);
        System.out.println(st);
    }

    public static String judge(int a) {
        if(a%2==0){
            return "偶数";
        }else return "奇数";

    }
}
