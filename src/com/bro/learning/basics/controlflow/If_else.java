package com.bro.learning.basics.controlflow;

// if-else选择结构

public class If_else {
    public static void main() {
        int a=10;
        int b=20;
        if(a>b)/* 条件 */{
            // 执行内容
            System.out.println("a>b");
        }else if(a<b){
            System.out.println("a<b");
        }else{
            System.out.println("a == b");
        }


        // 如果执行语句只有一句,也可以省略大括号
        if(a>b) System.out.println("a>b");
        else if(a<b) System.out.println("a<b");
        else System.out.println("a == b");
    }
}
