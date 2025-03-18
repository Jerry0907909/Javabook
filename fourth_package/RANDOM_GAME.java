package fourth_package;

import java.util.Random;
import java.util.Scanner;

public class RANDOM_GAME {
    public static void main(String[] args) {
        Random rd = new Random();
        int i = rd.nextInt(10) + 1;//把随机数拿出来 这样子的话 每一次程序启动 随机数就不变了 不至于一直变
        while (true) {//把循环写死 这样没猜中就可以一直猜
            System.out.println("请你猜一个数字");
            Scanner ac = new Scanner(System.in);
            int j = ac.nextInt();
            if (i > j) {
                System.out.println("对不起，你猜小了");
            } else if (i < j) {
                System.out.println("对不起，你猜小了");
            } else {
                System.out.println("恭喜你，终于对了");
                break;
            }

        }
    }
}