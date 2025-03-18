package fourth_package;
import java.util.Random;
public class demo01_random {
    public static void main(String[] args) {
       Random ac = new Random();//先定义一个随机数变量
       int data = ac.nextInt();//接着定义一个整形变量 以表示我生成的数字是一个整形
        System.out.println("data="+data);
        int data1 = ac.nextInt(20)+1;//再定义一个整形变量 并在nextInt（）里面输入相关数据
        // 表示该随机数生成是有范围的 0-19；再+1；为1-20
        System.out.println("data1="+data1);//值得一提的是 一个定义好的随机数变量ac可以多次使用



    }
}
