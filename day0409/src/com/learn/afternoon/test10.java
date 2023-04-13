package com.learn.afternoon;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数：");
        int c = scanner.nextInt();
        int x = a > b ? a : b;
        int max = x > c ? x : c;
        System.out.println("最大值为：" + max);
    }
}
