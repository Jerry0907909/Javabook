package Fifth_package_Array;

public class demo05_Get_element {
    public static void main(String[] args) {
        int arr1[] = new int [3];
        System.out.println("该元素的地址是"+arr1);//[I@682a0b20
        /*
        所以获取一个元素的值 不是这么干的 这样会输出指针的地址（第0个元素的地址）
         */
        /*
        细节说明：
        a.直接输出数组名，会输出数组在内存中的地址值
        b.地址值：数组在内存中的一个身份证号，唯一的标识，我们可以通过这个唯一
        标识到内存中能找到这个数组，从而操作这个数组中的数据
        c.如果数组中没有存数据，那么获取也能获取出来一些数据（元素的默认值）
        整数：0
        小数：0.0
        字符：‘\u0000’->对应的int值是0

         */
    }
}
