package demo06_Method;

public class demo06_practice2 {
    public static void main(String[] args) {
        //需求 :  求出1-100的和,并将结果返回
       int a=sum();
        System.out.println(a);
    }

    public static int sum() {
        int sum=0;
        for (int i = 0; i < 101; i++) {
           sum=sum+i;
        }
        return sum;
    }
}
