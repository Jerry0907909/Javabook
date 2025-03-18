package Module11.Test01_抽象方法;

public interface USB {
    public abstract void open();//明牌告诉你他是抽象方法
    String close();//即使不写出来 它也默认是抽象方法
    //那么此时USB就是一个抽象类
}
