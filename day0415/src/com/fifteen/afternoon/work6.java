package com.fifteen.afternoon;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        while (true){
        System.out.println("图书管理系统");
        System.out.println("1.图书列表");
        System.out.println("2.添加图书");
        System.out.println("3.修改图书");
        System.out.println("4.删除图书");
        System.out.println("5.退出系统");
        System.out.println("请输入你的选择：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("图书列表");
                break;
            case 2:
                System.out.println("添加图书");
                break;
            case 3:
                System.out.println("修改图书");
                break;
            case 4:
                System.out.println("删除图书");
                break;
            case 5:
                System.out.println("退出系统");
                System.exit(0);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        }
    }
}
