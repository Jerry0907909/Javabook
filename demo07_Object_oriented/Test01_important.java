package demo07_Object_oriented;

public class Test01_important {
    public static void main(String[] args) {
        Citizen person = new Citizen();
        person.name = "Xinjie Li";
        person.idCard = "511028200412138019";
        person.birthday = new MyDate();//必须要有这一步 不然如果直接写下一行的话 其实是null.year 反正就记住
        //自己创建的类 在引用使用的时候 需要new对象赋值
        person.birthday.year =2004;
        System.out.println(person.birthday.year);

    }
}
