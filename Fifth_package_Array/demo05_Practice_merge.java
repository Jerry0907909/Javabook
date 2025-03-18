package Fifth_package_Array;

public class demo05_Practice_merge {
    public static void main(String[] args) {
        //数组合并
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};
        int len = arr1.length + arr2.length;//计算两数组长度之和
        int arr3[] = new int[len];//定义合并数组以及长度
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }//将arr1并入arr3
        int len1 = arr1.length;//3
        for (int i = 0; i < arr2.length; i++) {
            arr3[len1 + i] = arr2[i];//len1+i表示从上一个的后面开始
        }//将arr2并入arr3 跟随在arr1后面
        for (int i = 0; i < len; i++) {
            System.out.println(arr3[i]);
        }//遍历查询结果是否正确

    }
}
