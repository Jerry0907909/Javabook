package Module11.多态.好处实验_多态的扩展性;

public class Test02 {
    public static void main(String[] args) {
        /*
           double b = 10;
           b = 100L;
         */
        Animal animal = new Dog();//父类new子类对象
        animal.eat();//那么这里调用的其实就是Dog.eat();

        animal = new Cat();
        animal.eat();//那么这里调用的其实就是Cat.eat();
        System.out.println("=================");

        Dog dog = new Dog();
        method(dog);

        Cat cat = new Cat();
        method(cat);

    }

    /*
       形参传递父类类型,调用此方法父类类型可以接收任意它的子类对象
       传递哪个子类对象,就指向哪个子类对象,就调用哪个子类对象重写的方法
     */
    public static void method(Animal animal){//Animal animal = dog   Animal animal = cat
        animal.eat();
    }
}
