package com.lideliang.nine;

public class testshort {
    public static void main(String[] args) {
        short s1 = 1;
        // s1 = s1 + 1; // 错误，因为1默认为int类型
        s1 += 1; // 正确，因为1默认为int类型，但是s1为short类型，所以会自动转换
        System.out.println(s1);
        short s2 = 2;
        long l2 = 20;
        long s3 = s1 + s2 + l2;
        System.out.println(s3);
        float f = 3.14F;
        double d = 3.14;
    }
}
