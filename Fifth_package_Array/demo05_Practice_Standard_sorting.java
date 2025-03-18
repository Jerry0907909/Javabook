package Fifth_package_Array;

public class demo05_Practice_Standard_sorting {
    public static void main(String[] args) {
        //数组规范性输出
        /*
        定义一个数组 int arr[]={1,2,3,4}
        遍历数组，输出元素按照[1,2,3,4]
         */
        int arr[] = {1, 2, 3, 4};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){//如果是达到了最后一个 就输出这个值 顺便带一个]
                System.out.print(arr[arr.length-1]+"]");
            }else System.out.print(arr[i]+",");
        }
    }
}
