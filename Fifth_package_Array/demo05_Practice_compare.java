package Fifth_package_Array;

import java.util.Scanner;

public class demo05_Practice_compare {
    public static void main(String[] args) {
        /*1.定义一个max，接收两个元素比较之后的较大值
        2.遍历数组，将每一个元素获取出来进行比较
        3.判断，如果max小于遍历出来的元素，证明遍历出来的元素的啊，那就将大的重新赋值给max
        4.直接输出max
         */
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int arr1[]=new int[i];
        Scanner ac= new Scanner(System.in);
        System.out.println("请输入想要比较的数");

        for(int j=0;j< arr1.length;j++){
            arr1[j]=ac.nextInt();
        }//自行输入想要比较的数

        int max=arr1[0];//确定第一个数

        for(int k=1;k<arr1.length;k++){
            if(max<arr1[k]){
                max=arr1[k];
            }
        }//开始遍历比较
        System.out.println("这三个数当中的最大值是"+max);

    }
}
