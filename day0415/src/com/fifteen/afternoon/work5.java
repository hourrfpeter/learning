package com.fifteen.afternoon;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int java = sc.nextInt();
        if(java==100){
            System.out.println("奖励一辆车");
        }
        else if(java>90 && java<=100){
            System.out.println("奖励一台iphone");
        }else if(java>80 && java<=90){
            System.out.println("奖励一台华为");
        }else System.out.println("没有奖励");
    }
}
