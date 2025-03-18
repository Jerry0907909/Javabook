package 数组常见算法;

public class Bubble {//冒泡排序
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};//数组长度为5
        for(int j = 0; j<arr.length-1;j++) {
            for (int i = 0; i < arr.length - 1-j; i++) {//arr.length-1-j其实代表的是一种比较次数
                if (arr[i] > arr[i + 1]) {              //五个数 最多比较四次
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
