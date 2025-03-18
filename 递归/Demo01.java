package 递归;

public class Demo01 {
    public static void main(String[] args) {
        /*
        概述:方法内部自己调用自己
         */
        method();
        }
    //分类
    public static void method(){
        method();
    }//直接递归
    /*
    b.间接递归:
   A(){
       B()
   }
   B(){
       C()
   }
   C(){
       A()
   }
     */

    //.注意:
    //  a.递归必须要有出口,否则会出现"栈内存溢出"
    //  b.递归即使有出口,递归次数不不要太多
}
