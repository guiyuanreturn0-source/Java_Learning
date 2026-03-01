package com.bro.learning.basics.opp.interface_abstract;

// 接口继承
// 接口可以继承多个父接口,实现子接口需重写所有父接口的方法

public interface Move extends Walk,Flyable {
    int MAX_SIZE =1000;

    public void move();
}
