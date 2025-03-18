package demo07_Object_oriented;

public class demo07_test {
    public static void main(String[] args) {
    Person person = new Person();
    person.name = "花生粒";
    person.age = 19;
    person.eat();
    person.drink();
//这就是同一个包下面的不同类在使用的时候 不需要导包
//但如果是同一个包下面 使用一个类里面的其他类 就需要导包

    }
}
