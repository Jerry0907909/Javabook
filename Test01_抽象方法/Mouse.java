package Module11.Test01_抽象方法;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public String close() {
        return "鼠标关闭";
    }
    //在具体的实现方法中 需要重写
}
