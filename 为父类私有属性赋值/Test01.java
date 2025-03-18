package Module10.为父类私有属性赋值;

public class Test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("涛哥");
        teacher.setAge(18);
        System.out.println(teacher.getName()+"..."+teacher.getAge());
        System.out.println("==================================");
        Manager manager = new Manager("赵海龙",38);
        System.out.println(manager.getName()+"++++"+manager.getAge());
    }
}
