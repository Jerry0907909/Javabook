package Module11.多态.introduction;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("🐕啃骨头");
    }
    //特有方法
    public void lookDoor(){
        System.out.println("狗会看门");
    }
}
