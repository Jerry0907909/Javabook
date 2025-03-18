package Module10.Practice4_extends_important;

public class Fu {
    public void methodFu(){
        System.out.println("我是父类中的methodFu方法");
    }
    public void method(){
        System.out.println("我是父类中的method方法");
    }
    public void method01(){
        System.out.println("我是用来测试的");
    }
    public Fu method03(){
        return null;
    }//这里这个方法的返回值是一个Fu类 而这个Fu类的子类就是Zi类
}
