package com.bro.learning.advanced.opp_advance;

// 内部类
// 顾名思义,内部类就是在类的里面定义类
// 内部类属于外部类的一部分,但是又相对独立

public class Outer {
    String OuterName = "Outer";
    private int OuterData = 555;
    // 重名变量
    int a = 10;

    public void OuterMethod() {
        System.out.println("OuterMethod");
    }
    public void OuterMethod2() {
        // 创建一个局部内部类
        class InnerLocal {
            // 访问局部内部类需要先在方法创建对象
            int a = 90;
            InnerLocal innerLocal = new InnerLocal();
        }
    }
    // 外部类想要访问内部类成员必须创建对象

    public void main() {
        System.out.println(OuterName);
        Inner inner = new Inner();
        System.out.println(inner.InnerData);
        inner.InnerMethod();

        // 静态内部类
        InnerStatic.InnerStaticMethod();
        InnerStatic innerStatic = new InnerStatic();
        innerStatic.InnerStaticMethod2();
    }

    // 创建一个成员内部类品鉴一下
    public class Inner {
        int a = 20;
        // 内部类可以访问外部类的所有成员,包括私有属性
        String InnerName = "Inner";
        int InnerData = 777;
        public void InnerMethod() {
            int a = 30;
            System.out.println("InnerMethod");
            System.out.println(OuterData);
            System.out.println("局部a: " + a);// 30
            System.out.println("内部类a: " + this.a);// 20
            System.out.println("外部类a: " + Outer.this.a);// 10
            System.out.println(" this 真的太好用了你知道吗");
        }
    }

    // 创建一个静态内部类品鉴
    public static class InnerStatic{
        // 调用静态内部类的方法
        public static void InnerStaticMethod() {
            System.out.println("静态直接用类名调用");
        }
        public void InnerStaticMethod2() {
            System.out.println("非静态创建对象再调用");
        }
    }
}
