package com.bro.learning.basics.opp.interface_abstract;

// 接口 + 继承 + 多态

public class Duck implements Move{
    // 子类接口的实现类,必须重写父子接口方法,否则 abstract
    public void move(){
        System.out.println("Duck is moving");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }
    public void walk(){
        System.out.println("Duck is walking");
    }

    public static void main() {
        // + 多态
        Flyable bird1 = new Bird();
        Flyable duck = new Duck();
        bird1.fly();
        duck.fly();
        Move duck1 = new Duck();
        duck1.move();
    }
}
