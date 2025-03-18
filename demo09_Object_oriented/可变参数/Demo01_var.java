package demo09_Object_oriented.可变参数;

public class Demo01_var {
    /*
    1.需求:
  定义一个方法,实现n个整数相加

    2.分析:
  方法参数位置,只明确了参数的类型,但是不明确参数个数,此时就可以定义成可变参数

    1.定义格式:
  数据类型...变量名

    2.注意:
  a.可变参数的本质是一个数组
  b.参数位置不能连续写多个可变参数,而且当可变参数和其他普通参数一起使用时,可变参数需要放到参数列表最后
     */
    public static void main(String[] args) {
        sum(1,2,3,4,5);

    }
    public static  void sum(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void sum1(int i,int...arr){

    }
}
