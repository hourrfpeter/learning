package com.fifteen.forenoon;

import org.junit.Test;

public class work2 {
    @Test
    public void ts() {
        //int[][] arr = new int[2][3];
        int[][]arr=new int[][]{{1,2,3},{4,5,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
