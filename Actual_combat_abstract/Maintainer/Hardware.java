package Module10.Actual_combat_abstract.Maintainer;

public class Hardware extends Maintainer {
    public Hardware() {
    }

    public Hardware(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为:"+getId()+"的"+getName()+"正在修复电脑主板");
    }
}
