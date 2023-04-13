package com.learn.homework;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((b%a==0) | (a+b>1000) ? a : b);
    }
}
