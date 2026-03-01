package com.bro.learning.basics.opp.interface_abstract;

// 抽象类
// 只定义不实现,和接口很像,但是实现类能实现接口,却只能继承一个抽象类

public abstract class Abstract {
    // 属性 和普通类一样
    String name;
    static int count = 0;

    // 方法,这是抽象类和普通类的区别所在,即允许在其中定义抽象方法
    public abstract void breathe();
    // 正常方法也是可以的
    public void hey(){
        System.out.println("Hey?");
    }

    public static void main() {
        Abstract a = new Abstract() {
            // 创建抽象类对象必须实现其中的抽象方法
            @Override
            public void breathe() {
                System.out.println("呼~ 吸~ 呼~ 吸~");
            }
        };
        //  子类继承抽象类,必须重写所有抽象方法
        a.name = "GG bond";
        System.out.println(a.name);
        a.breathe();
    }


}
