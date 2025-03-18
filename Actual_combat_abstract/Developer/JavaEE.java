package Module10.Actual_combat_abstract.Developer;

public class JavaEE extends Developer {
    public JavaEE() {
    }

    public JavaEE(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号:"+getId()+"的"+getName()+"正在研发电商网站");
    }
}
