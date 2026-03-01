package com.bro.learning.basics.opp.interface_abstract;

// 接口的实现类

public class Bird implements Walk,Flyable {// 一个类可以实现多个接口,此时这个类叫做各个接口的实现类
    // 实现类必须重写接口的所有抽象方法,否则就必须声明为抽象类(在 class 前面加 abstract)

    @Override
    public void walk() {
        System.out.println("Bird walk");
    }
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    public static void main() {
        Bird bird = new Bird();
        bird.fly();
        bird.walk();
    }
}
