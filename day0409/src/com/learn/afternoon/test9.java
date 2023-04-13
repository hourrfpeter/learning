package com.learn.afternoon;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        System.out.println(score>=60?"及格":"不及格");
    }
}
