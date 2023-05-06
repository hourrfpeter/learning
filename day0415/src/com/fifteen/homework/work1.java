package com.fifteen.homework;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        int x= 0;
        for (int i = 0; true; i++) {
            System.out.println("请输入账户：");
            Scanner sc = new Scanner(System.in);
            String account = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            String[] name = new String[]{"admin", "123456"};
            if (account.equals(name[0]) && password.equals(name[1])) {
                System.out.println("登录成功");
                System.exit(0);
            } else if (x<2){
                System.out.println("登录失败，请重新输入");
            }
            x = x + 1;
            if (x == 3) {
                System.out.println("您已经连续三次输入错误，程序锁定");
                System.exit(0);
            }
        }
    }
}
