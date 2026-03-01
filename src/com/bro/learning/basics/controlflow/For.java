package com.bro.learning.basics.controlflow;

// for循环结构

public class For {
    public static void main() {
        for(int i = 0/*初始化*/; i < 10/*条件*/; i++/*更新*/) {
            if(i % 2 == 0) continue;
            System.out.print(i + "  ");
        }

        System.out.println("");
        //Java中还有for的另一种强化用法 for-each循环 主要用于遍历数组与字符串
        int[] num = {1,2,3,4,5};
        for(int x : num){
            System.out.println("x => " + x);
        }

        // 对于字符串 我们需要先把它转变成字符串数组
        String str = "asdfghjkl";
        for(char a : str.toCharArray()){
            System.out.print( a + "--");
        }
    }
}
