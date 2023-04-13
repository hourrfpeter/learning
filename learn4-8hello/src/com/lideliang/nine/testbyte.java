package com.lideliang.nine;

public class testbyte {
    public static void main(String[] args) {
        //声明一个整型变量
        int a = 1;
        byte b = 5;
        //运算
        a = a + b;//byte类型会自动转换为int类型
        System.out.println(a);

        byte c = 5;
        c = (byte) (c + 5);//强制转换
        System.out.println(c);

        byte d = 3;
        d = 3 + 4;//联接声明和赋值选项
        System.out.println(d);
    }
}
