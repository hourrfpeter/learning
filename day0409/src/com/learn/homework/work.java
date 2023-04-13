package com.learn.homework;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (sc.hasNextInt()) {
            System.out.println("输入的整数是：" + sc.nextInt());
        } else {
            System.out.println("输入错误！");
        }
    }
}
