package Fifth_package_Array;

import java.util.Random;
import java.util.Scanner;

public class demo05_index {
    public static void main(String[] args) {
         /*
        概述：元素在数组中存储的位置（编号，下标）

        特点：
        a.索引唯一
        b.索引都是从0开始的，最大索引是数组长度-1

        索引的作用：
        我们将来操作元素，必须通过索引来操作
        存取数据要指定索引
        查数据也要指定索引
         */

        //存储元素
        String arr5[] = new String[4];
        arr5[0] = "李欣杰";
        arr5[1] = "李永贤";
        arr5[2] = "李思懋";
        arr5[3] = "胡勇良";
        //arr5[4] = "张房杰🐖";//不能达到数组本身定义的长度的值

        int arr6[] = new int[10];
        int arr7[] = new int[10];

        Scanner ac = new Scanner(System.in);
        Random rc = new Random(10);
        for (int j = 0; j < arr6.length; j++) {//j<arr6.length这样就不会把代码写死
            arr6[j] = ac.nextInt();
        }//循环输入数据

        for (int j = 0; j < arr6.length; j++) {
            System.out.println("输出的依次是" + arr6[j]);
        }
        System.out.println("随机数依次输出的是");
        for (int j = 0; j < arr7.length; j++) {
            arr6[j] = rc.nextInt(10);
        }//随机数循环输入数据

        for (int j = 0; j < arr7.length; j++) {
            System.out.println("输出的依次是" + arr6[j]);
        }
    }
}
