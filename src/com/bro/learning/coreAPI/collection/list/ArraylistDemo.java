package com.bro.learning.coreAPI.collection.list;

// list是一种有序的,允许重复,有索引的数据结构
// ArrayList是Colletion接口的实现类,你可以把它看作可变长数组
// 很常用

import java.util.ArrayList;

public class ArraylistDemo {
    static void main() {
        ArrayList<String> arl = new ArrayList<>();
        // 增加元素
        arl.add("Hello");
        arl.add("World");
        // 也可以在指定索引添加
        // 访问元素
        System.out.println(arl.get(1));// 按索引访问
        System.out.println(arl.getFirst());
        System.out.println(arl.getLast());
        // 删除
        arl.add("Hey?");
        arl.add("World");
        System.out.println(arl.remove("Hey?"));// 按内容删除
        System.out.println(arl.remove("World"));// 对于重复元素,删除索引靠前的
        System.out.println(arl);
        // 修改指定索引的元素
        arl.set(1,"Bro");
        System.out.println(arl);
        // 查看大小
        System.out.println(arl.size());
        // 查找指定内容元素
        System.out.println(arl.contains("Hello"));// 有无这个元素
        System.out.println(arl.indexOf("Hello"));// 返回索引
        arl.add("1");
        arl.add("4");
        arl.add("3");
        arl.add("6");
        // 快速排序
        arl.sort(String::compareTo);// 字符串默认按照长度和字典序排序,当然也可以自己写一个 compare 函数自定义排序根据
        System.out.println(arl);
        arl.clear();
        System.out.println(arl.isEmpty());
    }
}
