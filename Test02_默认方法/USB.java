package Module11.Test02_默认方法;

public interface USB {
    //默认方法
    public default void methodDef() {
        System.out.println("我是默认方法");
    }
}
/*
1.格式:
  public default 返回值类型 方法名(形参){
      方法体
      return 结果
  }
2.使用:
  a.定义实现类,实现接口
  b.默认方法可重写,可不重写
  c.创建实现类对象,调用默认方法
 */
