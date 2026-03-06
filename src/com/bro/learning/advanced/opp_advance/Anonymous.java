package com.bro.learning.advanced.opp_advance;

// 匿名内部类

public class Anonymous {
    // 接口/父类/抽象类 匿名内部类名 = new 接口/父类/抽象类(){重写方法};

    // 创建一个接口匿名内部类
    Test a1 = new Test() {
        // 重写方法
        @Override
        public void test() {
            System.out.println("test");
        }
    };

    // 用 Lambda 表达式实现同样的功能
    Test r2 = () -> System.out.println("Lambda 表达式");
    /*
    使用 Lambda：当接口是函数式接口(只有一个抽象方法)，且只需要实现那一个方法时。代码极度简洁。

    必须使用匿名内部类：
    需要实现的接口有多个抽象方法（不是函数式接口）。
    需要继承一个类，而不仅仅是实现接口。
    需要重写父类的非抽象方法，或者在类体中定义新的字段或方法
    */
    void main() {
        a1.test();
        r2.test();
        // 还可以
        new Test() {
            @Override
            public void test() {
                System.out.println("test1");
            }
        }.test();
        // 但是这样写只能用一次,相当于创建了一个实现对象用完后就回收了
    }

}
