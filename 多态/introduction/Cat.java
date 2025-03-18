package Module11.多态.introduction;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("🐱吃鱼");
    }
    //特有方法
    public void catchMouse(){
        System.out.println("猫会捉老鼠");
    }
}
