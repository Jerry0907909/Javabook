package Module10.Actual_combat_abstract.Developer;

public class Android extends Developer {
    public Android(int id, String name) {
        super(id, name);
    }

    public Android() {
    }

    @Override
    public void work() {
        System.out.println("员工号:"+getId()+"的"+getName()+"正在研发电商的手机客户端软件");
    }
}
