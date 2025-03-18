package fourth_package;
import java.util.Scanner;
public class demo01_Scanner {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);//定义一个Scanner的类对象 表示我要在里面输入
        int data = ac.nextInt();//输入的是整形
        String data1 = ac.nextLine();//遇到回车才结束
        System.out.println("data="+ data);
        System.out.println("我的名字是"+ data1);
        String data2 = ac.next();//遇到回车或者空格就结束
        System.out.println("data2="+data2);
    }
}
