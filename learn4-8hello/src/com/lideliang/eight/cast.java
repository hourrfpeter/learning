package com.lideliang.eight;

public class cast {
    public static void main(String[] args) {
        //小转大，隐式转换
        byte a = 1;
        int b = a;
        System.out.println(b);
        //大转小，强制转换
        a = (byte) b;
        System.out.println(a);
    }
}
