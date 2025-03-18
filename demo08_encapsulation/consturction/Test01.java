package demo08_encapsulation.consturction;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();//这个是无参的

        Person person1 = new Person("李欣杰", 20);
        System.out.println(person1.getAge()+"+++++++"+person1.getName());

    }

}
