package demo09_objectArrray;

import demo09_objectArrray.Person;

public class Test01 {
    public static void main(String[] args) {
        //需求:定义一个长度为3的数组,存储3个Person对象,遍历数组,将三个Person对象中的属性值获取出来
        //定义数组
        Person a[] = new Person[3];

        //创建三个对象
        Person p1 = new Person("Leon",20);
        Person p2 = new Person("Leon1",21);
        Person p3 = new Person("Leon2",22);

        //将三个对象保存到数组中
        a[0] = p1;
        a[1] = p2;
        a[2] = p3;

        //遍历
        for (int i = 0; i < a.length; i++) {
            //Person p = arr[i];
            System.out.println(a[i].getName()+"..."+a[i].getAge());
        }


    }
}
