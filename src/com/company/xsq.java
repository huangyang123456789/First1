package com.company;


import java.util.Arrays;


public class xsq {
    public static void main(String[] args) {
        int[] a = { 4, 3, 1, 2, };

        // 冒泡排序升序
        for (int x = 0; x < a.length - 1; x++) {
            for (int y = 0; y < a.length - 1 - x; y++) {
                if (a[y] > a[y + 1]) {
                    int temp = a[y];
                    a[y] = a[y + 1];
                    a[y + 1] = temp;
                }
            }
            System.out.print(Arrays.toString(a));
            System.out.println();
        }
        System.out.println("数组升序排列为：");
//        for (int n = 0; n < a.length; n++) {
//            System.out.print(a[n]+" ");
//        }
//        System.out.println();

        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}



