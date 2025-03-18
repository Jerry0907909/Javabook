package 递归;

public class Practice {
    public static void main(String[] args) {
        method(3);
        System.out.println(method1(3));
        System.out.println(method2(12));
    }
    public static void method(int n){//利用递归输出3到1
        if(n==1){
            System.out.println(n);
            //结束方法
            return;
        }
        System.out.println(n);
        n--;
        method(n);
    }

    public static int method1(int n){//阶乘
        if(n==1){
            return 1;
        }
        return n*method1(n-1);//相当于一直溯源到1 然后分别乘上来
    }

    public static  int method2(int n){
        if(n==1||n==2){//如果传进来的数据是1或者2 那么结果就是1 直接返回
            return 1;
        }
        return method2(n-2)+method2(n-1);
    }


}
