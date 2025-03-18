package Fifth_package_Array;

public class demo05_Array2 {
    /*
    1.概述:数组中套了多个数组
    2.定义格式:
    a.动态初始化
    数据类型[][] 数组名 = new 数据类型[m][n]
    数据类型 数组名[][] = new 数据类型[m][n]
    数据类型[] 数组名[] = new 数据类型[m][n]
    m:代表的是二维数组的长度
    n:代表的是二维数组中每一个一维数组的长度

    数据类型[][] 数组名 = new 数据类型[m]->二维数组中的一维数组没有被创建

    b.静态初始化
     */
    public static void main(String[] args) {
        int arr1[][] = new int [2][2];//数组大小就定死了
        int arr2[][] = new int [2][];

        String arr3[][] = {{"孙悟空","唐僧"},{"七豆老师","福尔摩斯"},{"花生粒","福尔摩斯","福尔摩斯李"},{"李欣杰","张房杰","LisMao","Leon","Liang"}};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i].length);//输出的是一维数组的长度 //2 2 3 5
        }
    }
}
