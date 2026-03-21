package com.bro.learning.coreAPI.map;

// map 双列集合,相对于单列集合来说,存储一对数据,称为键值对(entry)
// 相当于可以自定义房间的钥匙
// HashMap是哈希表 链表和红黑树实现的,不重复的原理是键值有独特的哈希值,如果添加的键值为自定义对象,需要重写hashCode和equals方法
// 如果添加的值为自定义对象,则不需要

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    static void main() {
        Map<String,String> map = new HashMap<>();
        // <key,value>
        map.put("key","value");
        map.put("key2","value2");
        map.put("key3","value3");
        System.out.println(map.get("key"));// 根据键值访问
        System.out.println(map);
        map.put(null,"value");
        map.put(null,"value2");
        System.out.println(map);// put方法中,相同键值,后put的值会覆盖

        System.out.println("------------------------");
        // 把键值放入单列集合进行遍历
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }
        System.out.println("--------------------------");
        // 把键值对 对象放入单列集合进行遍历
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }
        System.out.println("----------------------------");
        // 迭代器遍历
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        // 迭代器指向的是存储map键值对对象的单列集合
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        // 不过它的作用和增强for一致,增强for更加简洁
    }
}
