package com.bro.learning.basics.opp;

// 类与对象的创建

public/*访问修饰符,控制访问权限*/ class Person/*类名*/ {
    // 属性定义
    int age;
    String name;
    String gender;

    // 方法定义
    public void eat(){
        System.out.println("味太太太~太正!");
    }

    public String makeSound(){
        System.out.println("Hey?");
        return "咕咕嘎嘎!";
    }

    public void show(){
        System.out.println("年龄 : " + age);
        System.out.println("名字 : " + name);
        System.out.println("性别 : " + gender);
    }

    public static void main() {
        // 创建一个对象
        Person person = new Person();
        // 设置属性值
        person.age = 20;
        person.name = "凑企鹅";
        person.gender = "重型坦克";
        // 调用方法
        person.show();
        person.eat();
        System.out.println(person.makeSound());
    }
}
