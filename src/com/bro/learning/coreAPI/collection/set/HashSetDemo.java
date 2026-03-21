package com.bro.learning.coreAPI.collection.set;

// Set是一种无序的,不重复的,无索引的数据结构
// 作为Collection 的实现类,他依然可以使用clear remove add(不允许添加重复元素) 等操作

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {
    static void main() {
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("a");
        hs1.add("b");
        hs1.add("c");
        hs1.add("d");
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("1");
        hs2.add("2");
        hs2.add("c");
        hs2.add("5");
        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println(hs1.contains("a"));
        System.out.println(hs1.size());
        // 交集
        hs1.addAll(hs2);
        hs1.addAll(Arrays.asList("q", "w", "r", "c"));// 也可以使用Arrays添加
        System.out.println(hs1);
        // 并集
        hs1.retainAll(hs2);
        System.out.println(hs1);
        // 差集
        hs2.remove("c");
        hs1.removeAll(hs2);
        System.out.println(hs1);
    }
}
