package Fifth_package_Array;

public class demo05_Array {
    public static void main(String[] args) {
        /*数组概述：是一个容器，数组本身属于引用数据类型
        作用：一次存储多个数据
        特点：既可以存储基本类型的数据，还能存储引用类型的数据
        定长（定义数组时，长度为多长，最多能存多少个数据）
        定义：
        a.动态初始化：
        在定义数组的时候，我们没有给具体的数据，只指定了长度
        数据类型[] 数组名 = new 数据类型[长度]
        数据类型 数组名[] = new 数据类型[长度]
        new:代表创建数组
        等号右边的数据类型，要和左边的一致
        b.静态初始化：
        在定义数组的时候 直接给数据
        数据类型[] 数组名 = new 数据类型[长度]{元素1，元素2，元素3...}
        数据类型 数组名[] = new 数据类型[长度]{元素1，元素2，元素3...}
        推荐使用：
        数据类型[] 数组名 = {元素1，元素2，元素3...};
         */
        //动态初始化
        int[] arr1 = new int[6];//基本数据类型
        String[] arr2 = new String[5];//引用数据类型
        //静态初始化
        int arr3[] = {1, 3, 5, 6, 7, 5};


        /*
        获取数组长度：
        格式：数组名.length
        注意：
        length后面不要带小括号，因为length不是数组中的方法，
        而是数组中的一个属性
         */
        String arr4[] = {"张房杰是🐖", "巴啦啦小魔仙", "爱能克服远距离，多远都要在一起"};
        int len = arr4.length;
        System.out.println("Arry4的长度是" + len);//长度为3


    }
}




