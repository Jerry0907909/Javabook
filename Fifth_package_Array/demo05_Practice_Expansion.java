package Fifth_package_Array;

public class demo05_Practice_Expansion {
    public static void main(String[] args) {
        //数组扩容
        /*
        定义一个数组：int arr1[]={1,2,3,4,5}
        将数组由原来的长度扩容到10
         */
        int oldarr[] = {1, 2, 3, 4, 5};
        int newarr[] = new int[10];
        for (int i = 0; i < oldarr.length; i++) {
            newarr[i] = oldarr[i];
        }//将老数组里面的前五个值赋值给新数组
        oldarr = newarr;//将新数组的地址给老数组的地址(老数组把新数组吞并了的样子）
        System.out.println("老数组此时的长度" + oldarr.length);//10

    }
}
