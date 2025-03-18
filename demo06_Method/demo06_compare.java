package demo06_Method;

public class demo06_compare {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        //传递的是i和j,但是我们真正传递的是i和j代表的数据,不是变量本身
        boolean result = compare(i, j);
        System.out.println("result = " + result);
    }
    public static boolean compare(int a,int b){//传值调用 实际上传输的是i和j的值
        if (a>b){
            return true;
        }else{
            return false;
        }
    }
}