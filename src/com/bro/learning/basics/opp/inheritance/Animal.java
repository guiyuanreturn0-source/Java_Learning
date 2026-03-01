package com.bro.learning.basics.opp.inheritance;

// 继承 这里创建了一个父类

public class Animal {
    String name;
    int age;
    String color;

    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }

    // 构造方法
    public Animal(){
        // 空参构造
    }
    public Animal(String name,int age, String color){
        // 全参构造
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
