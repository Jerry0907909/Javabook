package Module11.多态.多态中的转型;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    //特有方法
    public void lookDoor(){
        System.out.println("狗会看门");
    }
}
