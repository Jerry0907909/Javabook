package 数组常见算法;


import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {//前提:数组中的数据必须是有序的
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();//这样就可以办到手动输入想查找的数据的位置
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int a = binary(arr,num1);
        System.out.println(a);
    }
    //优点;二分查找:每次找中间索引对应的元素进行比较查询(每一次查询少一半数据)

    public static int binary(int a[],int data){
        //定义三个变量,分别代表最大索引,最小索引,中间索引
        int min =0;
        int max = a.length-1;
        int mid = 0;

        while(min<=max){//当min和max都重叠了 或者min都大于max了 那肯定没了
            //查找
            mid = (min+max)/2;
            if(data>a[mid]){
                min = mid+1;
            }else if (data<a[mid]){
                max = mid-1;
            }else
                return mid;
            }
        return -1;
        }
}
