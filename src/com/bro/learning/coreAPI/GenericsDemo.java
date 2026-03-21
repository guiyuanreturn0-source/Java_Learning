package com.bro.learning.coreAPI;

// 泛型,是JDK5引入的新特性,在编译时对数据类型进行检查
// 其核心思想是把数据类型也当作参数传递

import java.util.ArrayList;

public class GenericsDemo {
    static void main() {
        // 初见泛型类
        ArrayList<Integer> list = new ArrayList<>();// 这里使用泛型限定了arraylist中只能存放integer类型数据
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        Teseeet<String> tesee = new Teseeet<>();
        tesee.value = "HI BRO";
        System.out.println(tesee.value);
        String te = "HI BROOOOOO";
        tesee.Tesssss(te);

        // 通配符
        // <?> 任意类型,直接读取为Object
        // <? extends T> 允许T及其子类
        // <? super T> 允许T及其父类
    }
}

// 泛型类
class Teseeet<T>{
    T value;
    // 泛型方法
    public<E> void Tesssss(E tess){
        System.out.println("泛型方法传入: " + tess);
        System.out.println("泛型类Test: " + value);
    }
}
// 泛型接口与泛型类类似,此处不多介绍