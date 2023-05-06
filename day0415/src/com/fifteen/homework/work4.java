package com.fifteen.homework;

import java.util.Random;
import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(50);
        while (true) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if (num > i) {
                System.out.println("猜大了！");
            } else if (num < i) {
                System.out.println("猜小了！");
            } else {
                System.out.println("猜对了！");
                System.exit(0);
            }
        }
    }
}
