package Module11.多态.转型可能出现的问题_类型转换异常;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //特有方法
    public void catchMouse(){
        System.out.println("猫会捉老鼠");
    }
}
