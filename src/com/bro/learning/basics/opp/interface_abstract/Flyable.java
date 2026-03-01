package com.bro.learning.basics.opp.interface_abstract;

// 接口创建

public interface Flyable {
    // 接口属性默认为 public static final 必须初始化且不能被修改
    int MAX_HEIGHT = 1000;

    // 接口方法默认 public abstract 可以省略
    public abstract void fly();

}
