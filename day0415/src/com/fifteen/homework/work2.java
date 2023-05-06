package com.fifteen.homework;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        System.out.println("***欢迎进入注册系统***\n");
        Scanner sc = new Scanner(System.in);
        work2 w = new work2();
        w.register();
    }
    public static void register() {
        System.out.println("请输入用户名：");
        String username = new Scanner(System.in).nextLine();
        System.out.println("请输入密码：");
        String password = new Scanner(System.in).nextLine();
        System.out.println("请再次输入密码：");
        String password2 = new Scanner(System.in).nextLine();
        if (password.equals(password2) && password.length() >= 6
                && username.length() >= 3) {
            System.out.println("注册成功！");
        } else if (!password.equals(password2)){
            System.out.println("两次密码不一致，请重新输入！");
            register();
        } else if (password.length() < 6) {
            System.out.println("密码长度不能小于6，请重新输入！");
            register();
        } else if (username.length() < 3) {
            System.out.println("用户名长度不能小于3，请重新输入！");
            register();
        }
    }
}
