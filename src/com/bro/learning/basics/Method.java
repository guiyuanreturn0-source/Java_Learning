package com.bro.learning.basics;

// 方法(函数)

public class Method {
    public static void main(String[] args) {// 入口函数(方法)
        hibro(3,'k',"Hey?");
        hirbo(5,"咕咕嘎嘎!");
    }

    public/*访问修饰符*/ static void/*返回值*/ hibro/*方法名*/(int n,char y,String str/*参数,用逗号隔开*/){
        if( y == 'k'){
            for(int i=0;i<n;i++){
                System.out.println(str);
            }
        }
    }
    // 方法的重载
    // Java中允许定义方法名相同但是参数不同的方法,Java认为他们是不同的方法,会根据参数的不同去调用不同的函数
    public static void hirbo(int n,String str){
        for(int i=0;i<n;i++){
            System.out.println(str);
        }
    }
    // 方法的重写,在opp(面向对象)中介绍
}
