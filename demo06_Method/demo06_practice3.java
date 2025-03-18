package demo06_Method;

public class demo06_practice3 {
    //需求:
    //   定义一个方法,给这个方法传几,就让这个方法循环打印几次"我是一个有经验的JAVA开发工程师"
    public static void main(String[] args) {
        method(3);
    }

    public static void method(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("我是一个有经验的java开发工程师");
        }
    }
}

