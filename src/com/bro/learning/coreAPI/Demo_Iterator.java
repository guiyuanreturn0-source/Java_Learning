package com.bro.learning.coreAPI;

// Iteration(迭代器) 是集合框架下专门用于遍历集合(列表 集合 映射)的接口类

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Iterator {
    static void main() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 创建迭代器对象遍历
        Iterator<Integer> it_list = list.iterator();

        // 迭代器常用的三种操作
        System.out.println(it_list.next());// next()访问当前元素并移动到下一个位置

        while(it_list.hasNext()){// hasNext()判断下一个元素是否可以访问 能则返回true
            // 注意,由于第一步已经把迭代器移动到了第二个元素上,所以这个循环是从第二个元素开始的
            System.out.println(it_list.next());
        }
        // 循环结束后,迭代器指向为空,因为next()会把往后移动
        // 下列语句会报错
        // System.out.println(it_list.next());

        it_list = list.iterator(); // 重新构建让他从头开始

        while(it_list.hasNext()){
            if(it_list.next() % 2 == 0){
                it_list.remove(); // 删除其中的偶数
            }
        }
        System.out.println("------------------");
        it_list = list.iterator();
        while(it_list.hasNext()){
            System.out.println(it_list.next());
        }

    }
}
