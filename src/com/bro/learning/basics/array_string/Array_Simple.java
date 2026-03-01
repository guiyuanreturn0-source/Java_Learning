package com.bro.learning.basics.array_string;

// 数组

public class Array_Simple {
    public static void main(String[] args) {

        // 数组的静态初始化
        int[] num = {0,1,2,3,4,5};

        for(int i : num){
            System.out.print(i + " ");
        }
        System.out.println();

        // 动态初始化
        int[] num1 = new int[4];
        int len = 10;
        int[] num2 = new int[len];

        // 二维数组

        // 静态初始化
        int[][] nums = {{1,2},{3,4,5}};

        // 遍历
        for(int[] j :nums){
            for(int k : j){
                System.out.print(k + " ");
            }
        }
        System.out.println();

        // 动态初始化 可以只定义行数,不定义列数
        int[][] nums1 = new int[3][];
        nums1[0] = new int[]{1,2,3,4,5};// 直接给一行代码赋值
        nums1[1] = new int[2];// 第二行单独赋值列数为2
        nums1[1] = new int[]{1,2,3,4}; // 又用直接赋值给第二行赋值,长度为4,原来长度为二的数组会被回收
        nums1[2] = new int[1];
        nums1[2][0] = 1;
        for(int[] i : nums1){
            for(int j : i){
                System.out.print(j + " ");
            }
        }
    }
}
