package com.fifteen.homework;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1){
            System.out.println("这个数不是素数");
            System.exit(0);
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0){
                System.out.println("这个数是素数");
                System.exit(0);
            }else {
                System.out.println("这个数不是素数");
                System.exit(0);
            }
        }
    }
}
