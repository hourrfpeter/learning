package com.learn.afternoon;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入HTML的成绩：");
        double html = sc.nextDouble();
        System.out.println("请输入Java的成绩：");
        double java = sc.nextDouble();
        System.out.println("请输入SQL的成绩：");
        double sql = sc.nextDouble();
        //输出三门课程的成绩
        System.out.println("HTML的成绩是：" + html);
        System.out.println("Java的成绩是：" + java);
        System.out.println("SQL的成绩是：" + sql);
        //计算Java和SQL的分数差
        double sub = java-sql;
        System.out.println("Java课程和SQL课程的分数差是：" + sub);
        //计算三门课程的平均分
        double avg = (html+java+sql)/3;
        System.out.println("三门课程的平均分是：" + avg);
    }
}
