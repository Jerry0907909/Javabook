package demo06_Method;

public class demo06_noparameter_novalue {
    public static void main(String[] args) {
        /*
        main方法是所有程序的入口 即使写了其他方法 程序也要从main方法里面开始执行
        将来干开发 就应该针对不同的功能 写不同的代码
        方便维护 好管理 看着舒服

        1.无参无返回值方法定义:
  public static void 方法名(){
      方法体 -> 实现此方法的具体代码

        注意事项:
  a.void关键字代表无返回值,写了void,就不要在方法中写return 结果
  b.方法不调用不执行, main方法是jvm调用的
  c.方法之间不能互相嵌套,方法之间是平级关系
  d.方法的执行顺序只和调用顺序有关
  }
         */
        Hua_Sheng();
        Hormos();
    }

    public static void Hua_Sheng() {
        System.out.println("花生粒和福尔摩斯李是好朋友");
    }//这种是无参无返回值值方法 也就是说 他是单纯的调用 不用给参数 不用给返回值（void) 也就没有return

    public static void Hormos() {
        System.out.println("福尔摩斯李和花生粒是好朋友");
    }//这种是无参无返回值值方法 也就是说 他是单纯的调用 不用给参数 不用给返回值（void) 也就没有return
}

