package com.fifteen.homework;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        System.out.println("请输入要打印的金字塔层数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("金字塔的层数："+n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
