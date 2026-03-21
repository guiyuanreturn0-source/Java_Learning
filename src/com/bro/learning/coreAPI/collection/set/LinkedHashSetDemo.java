package com.bro.learning.coreAPI.collection.set;

// JDK8以后由链表 哈希表 和红黑树实现的set
// 不重复 无索引 有序(按照插入顺序)

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    static void main() {
        LinkedHashSet<String> lhs =  new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");
        lhs.add("e");
        lhs.add("f");
        System.out.println(lhs);
        // 和HashSet的无序不同,迭代器按照插入顺序迭代
    }
}
