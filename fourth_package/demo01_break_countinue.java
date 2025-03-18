package fourth_package;

public class demo01_break_countinue {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                //结束整个循环
                break;
                //结束本次循环，进入下一次循环
                //countinue;
            }
            System.out.println("张房杰是🐖");
        }
    }
}
