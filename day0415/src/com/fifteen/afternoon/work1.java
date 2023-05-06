package com.fifteen.afternoon;

import org.junit.Test;
import sun.java2d.pipe.AAShapePipe;

import java.util.Arrays;

public class work1 {
    @Test
    public void test1(){
        int []arr=new int[]{5,2,6,7,3,1,4};
        Arrays.sort(arr);//自动升序排序
        for (int i:arr){
            System.out.println(i);
        }
    }

    @Test
    public void test2(){
        int []arr=new int[]{5,2,6,7,3,1,4};
        String s = Arrays.toString(arr);//将数组转换为字符串
        System.out.println(s);
    }

    @Test
    public void test3(){
        int []arr=new int[]{10,20,30,40,50,60};
        int ss = Arrays.binarySearch(arr,30);//二分查找,返回的是位置
        System.out.println(ss);
    }

    @Test
    public void test4(){
        int []arr=new int[]{5,2,6,7,3,1,4};
        int []arr1=new int [7];
        System.arraycopy(arr,0,arr1,0,7);//数组复制
        System.out.println(Arrays.toString(arr1));
        for (int i:arr1){
            System.out.println(i);
        }
    }
}
