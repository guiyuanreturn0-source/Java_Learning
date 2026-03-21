package com.bro.learning.coreAPI.collection.set;

// 由红黑树实现的集合
// 不重复 无索引 可排序

import java.util.TreeSet;

public class TreeSetDemo {
    static void main() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(6);
        treeSet.add(616);
        // 默认自动按照升序排列
        System.out.println(treeSet);
        // 创建时传入比较器自定义排序
        TreeSet<Integer> treeSet2 = new TreeSet<>((o1, o2) -> {//lambda表达式
            return o2 - o1;// 降序排列
        });
        treeSet2.addAll(treeSet);
        System.out.println(treeSet2);
    }
}
