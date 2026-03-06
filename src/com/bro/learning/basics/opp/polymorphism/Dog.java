package com.bro.learning.basics.opp.polymorphism;

import com.bro.learning.basics.opp.inheritance.Animal;
import com.bro.learning.basics.opp.inheritance.Penguin;

// 多态
// 多态就是 继承 + 方法重写 + 父类引用指向子类对象 这样的效果是通过父类引用管理不同子类的对象
// 弊端是多态无法调用子类特有的方法

public class Dog extends Animal {//继承
    String tail;

    public void eat(){
        System.out.println("Dog eat");
    }// 方法重写

    public static void main(String[] args) {
        Animal dog = new Dog();// 父类引用指向子类对象
        Animal pen = new Penguin();
        dog.eat();
        pen.eat();
    }
}
