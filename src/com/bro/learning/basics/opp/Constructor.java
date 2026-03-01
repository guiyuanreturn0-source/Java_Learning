package com.bro.learning.basics.opp;

// 构造方法

public class Constructor {

    int a ;
    char b;
    String c;

    // 每一个类都有构造方法,即给属性初始化的方法
    // 默认使用隐性的空参构造(即无参数),如下
    public Constructor(){
        // 初始化为默认值
        a = 0;
        b = '\u0000';
        c = null;
    }

    // 当然,我们也可以手写含参数的构造方法来初始化
    public Constructor(int a,char b,String c){
        this.a = a;
        this.b = b;
        this.c = c;//这里的 this.属性值 是对象自己的属性值,后面的是传进来的参数
    }
    // 当我们手写含参构造,默认的空参构造就会消失,不过,构造方法也是方法,支持重载
    // 因此,我们可以手写一个空参构造使他支持默认初始化,
    // 推而广之,我们可以使用重载只初始化一部分属性值,其他未初始化的属性值Java会使用默认初始值
    public Constructor(int a,char b){
        this.a = a;
        this.b = b;
    }

    public void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main() {
        Constructor con = new Constructor();
        con.show();
        Constructor con2 = new Constructor(2, 'a', "Hey Hey Hey~");
        con2.show();
        Constructor con3 = new Constructor(3, 'b');
        con3.show();
    }
}
