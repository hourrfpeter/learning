package com.learn.afternoon;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        System.out.println("你的用户名是：" + username + "，你的密码是：" + password);
    }
}
