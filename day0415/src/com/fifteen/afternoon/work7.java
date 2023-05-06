package com.fifteen.afternoon;

import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入季节：");
        String season = sc.next();
        switch (season) {
            case "春":
                System.out.println("春暖花开");
                break;
            case "夏":
                System.out.println("夏日炎炎");
                break;
            case "秋":
                System.out.println("秋高气爽");
                break;
            case "冬":
                System.out.println("冬日暖阳");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
