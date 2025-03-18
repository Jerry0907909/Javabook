package Module11.多态.综合练习;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");

    }
    //特有方法
    public void click(){
        System.out.println("来呀,快点我");
    }
}
