package com.fifteen.forenoon;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[]arr= new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        boolean find=false;
        for(int i:arr){
            if(i==num){
                find=true;
                break;
            }
        }
        if(find){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }
    }
}
