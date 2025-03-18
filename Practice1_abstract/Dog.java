package Module10.Practice1_abstract;

public class Dog extends Animal{//既然继承了Animal这个抽象类 那么就必须要有他的功能

    @Override
    public void eat() {
        System.out.println("🐕啃骨头");
    }

    @Override
    public void drink() {
        System.out.println("🐕喝水");
    }
    //重写他的方法
}
