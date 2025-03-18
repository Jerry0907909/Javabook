package Fifth_package_Array;

public class demo05_Array2_Getelment {
    public static void main(String[] args) {
        /*
        数组名[i][j]

        i:代表的是一维数组在二维数组中的索引位置
        j:代表的是元素在一维数组中的索引位置

        存储：
        数组名[i][j]=值

         */
        String arr3[][] = {{"孙悟空", "唐僧"}, {"七豆老师", "福尔摩斯"}, {"花生粒", "福尔摩斯", "福尔摩斯李"}, {"李欣杰", "张房杰", "LisMao", "Leon", "Liang"}};
        System.out.println(arr3[0][0]);//孙悟空
        System.out.println(arr3[2][0]);//花生粒
        System.out.println(arr3[3][1]);//张房杰
        arr3[0][1]="猪八戒";
        
        //遍历二维数组
        for (int i = 0; i < arr3.length; i++) {
            /*
            arr[i]代表的就是每一个一维数组
             */
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
                /*
                一层一层遍历 因为二维数组就是一层数组里面套一层数组
                */
                
            }
        }
    }
}
