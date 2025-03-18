package Module11.Test04_成员变量;

public interface USB {
    public static final int NUM1 = 100;
    int NUM2 = 200;//不写public static final 默认也有
    //NUM是习惯性大写
    //必须要初始化变量的值
}
/*
1.格式:
  public static final 数据类型 变量名 = 值
2.相关知识点:final
  final代表最终的,被它修饰的变量,不能二次赋值,可以视为常量
3.特点:
  不写public static final 默认也有
4.使用:
  接口名直接调用
5.注意:
  a.被static final修饰的成员变量需要手动赋值
  b.习惯上我们会将static final修饰的成员变量名大写

 */
