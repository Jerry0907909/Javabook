package Module10.Actual_combat_abstract;
import Module10.Actual_combat_abstract.Developer.Android;
import Module10.Actual_combat_abstract.Developer.JavaEE;
import Module10.Actual_combat_abstract.Maintainer.Hardware;
import Module10.Actual_combat_abstract.Maintainer.Network;

import java.net.InetSocketAddress;

public class Test01 {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE();
        javaEE.setId(1);
        javaEE.setName("赵军");
        javaEE.work();

        Android android = new Android();
        android.setId(2);
        android.setName("李维");
        android.work();

        Hardware hardware = new Hardware();
        hardware.setId(3);
        hardware.setName("陈子昂");
        hardware.work();

        Network network = new Network();
        network.setId(4);
        network.setName("韩锋");
        network.work();

        Network network1 = new Network(5,"陈伟");
        network1.work();
    }


}
