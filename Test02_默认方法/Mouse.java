package Module11.Test02_默认方法;

public class Mouse implements USB {
    @Override
    public void methodDef(){
        System.out.println("我是重写接口中的默认方法");
    }
}
