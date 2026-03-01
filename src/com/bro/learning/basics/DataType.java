package com.bro.learning.basics;

// Java的数据类型

public class DataType {
    public static void main() {
        // 基础数据类型
        // 此处在main函数中定义,为局部变量,必须初始化
        byte b = 1;
        short s = 25;
        int i = 1024;
        long l = 94654L;// 要在后面加L或l 否则会被当成int处理导致编译错误
        float f = 1.2F;// 同理,不加会编译报错
        double d = 12.54D;// 通常可以省略后缀
        char c = 'a';
        boolean bool = true;
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("bool = " + bool);
        /*如果是静态变量或者成员变量,则会有默认值
        * int byte short -> 0
        * long -> 0L
        * float -> 0.0F
        * double -> 0.0D
        * char -> '\u0000'
        * boolean -> false
        * 引用数据类型 -> null
        */

        // 引用数据类型
        // 引用数据类型包括类(比如String) 接口 数组 枚举 数组等
        String str = "asdfghjkl";
        // 基本数据类型变量存储在栈中 引用数据变量名存储在栈中,存储地址,指向堆内存中对象
        // 静态的引用变量名存储在方法区的静态区
        int[] num = {1,2,3,4,5};

    }
}
