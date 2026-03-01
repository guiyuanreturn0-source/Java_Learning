package com.bro.learning.basics.array_string;

// 字符串基础

public class String_Simple {
    public static void main(String[] args) {
        // 创建
        String str1 = "abc";// 字面量创建,存储在字符串常量池
        // 字符串是常量,创建以后不能改变
        // str1[0] = 'a'; 该语句会报
        str1 = "asdfghjkl";// 这里并没有改变str1的值,而是改变了 str1 的指向,使他指向字符串常量池中的新对象

        String str2 = "asdfghjkl";// 字面量创建一个一样的字符串会直接复用字符串常量池的对象
        // 比较一下他们的地址
        System.out.println("str1 和 str2 的地址相同: " + (str1 == str2));

        String str3 = new String("asdfghjkl");// new创建,在堆内存里创建一个新的对象
        String str4 = new String("asdfghjkl");
        //比较一下他们的地址
        System.out.println("str3 和 str2 地址相同: " + (str3 == str2));// str2 和 str3 内容相同,却是不同的对象
        System.out.println("str3 和 str4 地址相同: " + (str3 == str4));// 同理

        // == 比较的是地址,若要比较字符串内容,须使用 equals
        System.out.println("str3 和 str4 内容相同: " + str3.equals(str4));
        System.out.println("str1 和 str3 内容相同: " + str1.equals(str3));

        // 连字符 '+'
        // 字符串参与运算时 '+' 为连接符,把其他类型的数据转换成String
        String str5 = "abc";
        System.out.println( 5 + 3 + " " + str5 );
        String str6 = "abc" + 5 + 3;
        System.out.println(str6);
        // 先计算5 + 3 为 8 8和 " "运算转变为字符串, '+' 变成了连接符
        // 每一步连接符形成新的字符串,实际上是创建了一个新的字符串对象
        // 字符串和字符数组是不同的,更多的String内容将在api的学习中介绍

    }
}
