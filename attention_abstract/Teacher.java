package Module10.attention_abstract;

public class Teacher extends Employee {

    @Override//既然继承了抽象类 那么必须要和他有相同的方法
    // 只是要重写罢了 如果你不重写 那么你也必须是抽象类
    public void work() {
        System.out.println("涛哥在讲java");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}
