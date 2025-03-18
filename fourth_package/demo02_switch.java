package fourth_package;

import java.util.Scanner;

public class demo02_switch {
    public static void main(String[] args) {
        System.out.println("请输入你想要的数字");
        Scanner ac= new Scanner(System.in);
        int data = ac.nextInt();
        switch (data) {
            case 1:
                System.out.println("我听见你的声音逐渐靠近");
                break;
            case 2:
                System.out.println("那是你穿越时间来我梦里");
                break;
            case 3:
                System.out.println("我看见你的身影逐渐透明");
                break;
            case 4:
                System.out.println("变成光重新照进我生命里");
                break;

            default://如果上述常量值都不匹配 则执行default语句
                System.out.println("没了");
                break;//用于结束switch语句

        }
    }
}

