package Fifth_package_Array;

import java.util.Scanner;

public class demo05_Practice_Search {
    public static void main(String[] args) {
        //键盘录入一个整数，找出整数在数组中存储的索引信息
        /*
        1.创建Scanner对象
        2.定义数组，随便存几个数据
        3.遍历数组，在遍历的过程中判断是否和录入的数相等，如果相等，直接输出索引
        如果都没有 则输出-1
         */
        int flag = 0;//定义一个flag 记录查找次数 如果查完了 都没有 就输出-1
        Scanner sc = new Scanner(System.in);
        int arr1[] = {12, 56, 34, 78, 99};
        int data = sc.nextInt();//自行输入一个数
        for (int i = 0; i < arr1.length; i++) {
            if (data == arr1[i]) {
                System.out.println(i);
            } else {
                flag++;
            }
        }
        if (flag == arr1.length) {
            System.out.println("-1");//如果都没有找到就输出-1
        }
    }
}

