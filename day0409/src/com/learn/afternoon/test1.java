package com.learn.afternoon;

public class test1 {
    public static void main(String[] args) {
        int a= 2;
        int b=a++;//先赋值再计算
        System.out.println(b);
        System.out.println(a);
    }

    public static void main1(String[] args) {
        int a= 2;
        int b=++a;//先计算再赋值
        System.out.println(b);
        System.out.println(a);
    }
}
