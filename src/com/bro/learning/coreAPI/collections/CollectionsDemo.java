package com.bro.learning.coreAPI.collections;

// Collections是集合框架下的一个工具类,提供了多种操作集合的方法

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // 批量添加
        Collections.addAll(list,11,5,21,4,21,645,4,216,54,12);
        System.out.println(list);
        // 打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
        // 排序
        Collections.sort(list);// 默认升序
        System.out.println(list);
        // 自定义排序
        Collections.sort(list,(o1, o2) -> o2 - o1);
        System.out.println(list);
    }
}
