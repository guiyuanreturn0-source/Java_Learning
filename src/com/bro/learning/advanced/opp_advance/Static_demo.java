package com.bro.learning.advanced.opp_advance;

// static 关键字
// 可以修饰成员变量 成员方法

public class Static_demo {
    // 普通成员变量
    String name;
    // 静态成员变量
    // 静态变量随着类的加载而加载,先于对象,此类的所有对象共享一个静态变量
    // 静态变量还可以直接用类名直接访问
    static String species;

    // 构造方法
    public Static_demo() {}

    // 静态方法
    // 静态方法中没有 this 关键字
    // 因此
    // 静态方法中只能访问静态方法与静态变量,非静态可以访问所有

    public static void Hey(){
        System.out.println("Hey?");
    }
}
