package Fifth_package_Array;

import java.util.Random;

public class demo05_Practice_Output {
    public static void main(String[] args) {
        //随机产生10个[0,100]之间的整数，统计既是3又是5，但又不是7的倍数的个数
        /*
        1.创建Random对象，用于生成随机数
        2.定义一个数组，长度为10
        3.定义一个变量count，用于统计符合条件的数据个数
        4.遍历数组，判断元素是否符合指定的条件，如果符合，count++
        5.输出count
         */
        Random rd = new Random();
        int arr1[] = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr1[i] = rd.nextInt(100);
            System.out.println(arr1[i]);
        }//将生成的随机数存到数组里面 输出生成的随机数的值 方便检查是否正确
        for (int j = 0; j < 10; j++) {
            if (arr1[j] % 3 == 0 && arr1[j] % 5 == 0 && arr1[j] % 7 != 0) {
                count++;
            }//根据上述条件遍历数组 检查符合条件的值 有的话就count+1 没有的话 就保持原样

        }
        System.out.println("个数为" + count);//输出个数
    }
}
