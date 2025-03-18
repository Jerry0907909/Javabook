package demo09_Object_oriented;

public class test01 {
    public static void main(String[] args) {
        //先给静态成员赋值
        Student.classRoom = "333";//类成员 直接调用 值不变 成为共享数据
        Student s1 = new Student();
        s1.name = "Xinjie Li";
        s1.age = 21;


        System.out.println("+++++++++++++++++++++");

        Student s2 = new Student();
        s2.age = 19;
        s2.name = "Luo Qing";



    }
}
