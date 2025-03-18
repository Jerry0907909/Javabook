package Module10.Practice4_extends_important;

public class Zi extends Fu {

    public void methodZi() {
        System.out.println("我是子类中的methodZi方法");
    }

    @Override//检测是否重写成功
    public void method() {
        System.out.println("我是子类中的method方法");
    }
    @Override
    public void method01(){//public -> protected -> 默认 -> private 权限优先级 子类重写父类方法 必须保证权限>=父类
        System.out.println("我是用来测试的");
    }
    /*
    2.子类方法重写父类方法,方法名和参数列表要一样
    3.私有方法不能被重写,构造方法不能被重写,静态方法不能被重写
    4.子类重写父类方法之后,返回值类型应该是父类方法返回值类型的子类类型-important
     */
    @Override//重写成功!
    public Zi method03(){
        return null;
    }//子类重写完Fu类的方法后,返回值可以定义为Fu类的子类类型 也就是Zi类
}
