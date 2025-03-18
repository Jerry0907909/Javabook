package fourth_package;

import java.util.Scanner;
//润平年计算小程序
public class demo02_if_else {
    public static void main(String[] args) {
        Scanner ac= new Scanner(System.in);
        int year = ac.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("闰年2月份29天");
        }else{
            System.out.println("平年28天");
        }
    }
}
