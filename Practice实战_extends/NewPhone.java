package Module10.Practice实战_extends;

/*
方法重写的意义何在?
比如英雄联盟里面有一个英雄叫做艾希
她的R技能需要更新调整 那么就在定义她的技能的方法里面
进行重写并整体继承
就不用大动干戈 所有都重来一遍
 */
public class NewPhone extends OldPhone{
    public void show(){
        System.out.println("显示手机号");
        System.out.println("显示归属地");
    }
}
