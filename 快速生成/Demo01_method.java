package 快速生成;


public class Demo01_method {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        getMax(a);

    }

    private static void getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }//用ctrl+alt+m进行提取方法+

}
/*
debug调试
1.概述:调试代码的一种手段

2.作用:
  a.能清楚的看到每个变量在代码执行过程中的变化
  b.找错

3.使用:
  a.在想要开始debug的那一行左边点击一下,出现红色小圆点(断点)
  b.右键-> 点击debug
 */
