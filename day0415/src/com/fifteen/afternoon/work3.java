package com.fifteen.afternoon;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入java成绩：");
        int java = sc.nextInt();
        System.out.println("请输入音乐的成绩：");
        int music = sc.nextInt();
        if ((java>98&&music>80)||(java==100&&music>70)){
            System.out.println("奖励一台iphone");
        }
    }
}
