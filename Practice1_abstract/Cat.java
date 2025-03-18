package Module10.Practice1_abstract;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("🐱吃🐟");
    }

    @Override
    public void drink() {
        System.out.println("🐱喝水");
    }
}
