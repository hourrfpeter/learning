package com.learn.homework;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        System.out.println("请输入4位会员卡号：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("输入错误！");
            return;
        }
        int a = num / 1000;
        int b = num % 1000 / 100;
        int c = num % 100 / 10;
        int d = num % 10;
        int sum = a + b + c + d;
        System.out.println("会员卡号"+num+"各位之和：" + sum);
    }
}
