package Module11.多态.好处实验_多态的扩展性;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();//重写的
        dog.lookDoor();//特有的

        //dog = new Cat();
        System.out.println("=============");
        method(dog);

        Cat cat = new Cat();
        method(cat);

       /* houzi houzi = new houzi();
        method(houzi);

        bird bird = new bird();
        method(bird);*/
    }//这里体现了原始方法的扩展性差

    public static void method(Dog dog){
        dog.eat();
        dog.lookDoor();
    }

    public static void method(Cat cat){
        cat.eat();
        cat.catchMouse();
    }

   /* public static void method(houzi houzi){
        cat.eat();
        cat.catchMouse();
    }*/
}

