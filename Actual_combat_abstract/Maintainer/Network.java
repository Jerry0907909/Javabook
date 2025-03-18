package Module10.Actual_combat_abstract.Maintainer;

public class Network extends Maintainer {
    public Network() {
    }

    public Network(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为:"+getId()+"的"+getName()+"正在检查网络是否畅通");
    }
}
