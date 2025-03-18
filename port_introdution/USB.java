package Module11.port_introdution;

public interface USB {//USB就是接口名
    public abstract void open();
    public abstract void close();
    //接口中所定义的方法是抽象方法 在实现类当中需要重写 那么也就是说 接口类其实是一个抽象类
    //即便不写public abstract 默认也有
    /*
    3.使用:
  a.定义实现类,实现接口
  b.重写抽象方法
  c.创建实现类对象,调用重写的方法
     */
}
