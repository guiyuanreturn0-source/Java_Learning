package com.bro.learning.basics.controlflow;

// while循环结构

public class While {
    public static void main(String[] args) {
        while(true)/* 循环条件 */{
            System.out.println("a => b");
            break;
        }
        // Java中条件可以为 true 或者 false ,但是不能为数字,否则会报错

        do{
            System.out.println("a => b");
        }while(false);

    }
}
