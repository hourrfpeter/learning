package com.fifteen.afternoon;

import org.junit.Test;

import java.util.Arrays;

public class work2 {
    @Test
    public void test(){
        int []arr=new int[]{5,2,6,7,3,1,4};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){//改此处的符号可以实现升序或者降序
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
