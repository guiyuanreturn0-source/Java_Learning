package com.bro.learning.coreAPI.collection.list;

// 链表
// 依然可以使用collection 接口中的增删改查方法,如add,remove,clear等等
// 对于插入数据和删除数据,链表的效率优于arraylist

import java.util.LinkedList;

public class LinklistDemo {
    static void main() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.addFirst(10000);// 头部添加元素
        list.addLast(20000);// 尾部添加元素
        System.out.println(list);
        list.removeFirst();// 删除头部元素
        System.out.println(list);
        list.removeLast();// 删除尾部元素
        System.out.println(list);
        list.remove(3);// 索引删除
        System.out.println(list);
        LinkedList<Integer> reversedlist = list.reversed();// 返回反转链表
        System.out.println(reversedlist);
    }
}
