package Module11.port_introdution;

public class Mouse implements USB{//定义一个实现类 用Mouse去实现USB
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");

    }
}
