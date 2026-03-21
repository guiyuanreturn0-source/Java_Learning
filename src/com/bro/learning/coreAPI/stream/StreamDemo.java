package com.bro.learning.coreAPI.stream;

// Stream流是JDK 8 引入的API,提供了对集合的处理方法

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    static void main() {
        // 通过集合创建stream流
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("bg");
        arr.add("cgdf");
        arr.add("gf");
        arr.add("f");
        Stream<String> stream = arr.stream();// 创建

        // 数组创建
        int[] arr2 = {1,5,2,6,6,5,7,2};
        IntStream arr3 = Arrays.stream(arr2);

        // 使用stream类中的静态方法创建
        Stream<Integer> stream1 = Stream.iterate(0, i -> i + 1);// 创建无限流
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);

        // stream流的中间和终结操作
        arr.stream().filter(a -> a.length() == 1).forEach(System.out::println);//filter为中间方法,用于筛选

        //forEach为终结方法
        System.out.println("---------------------");
        arr.stream().limit(3).forEach(System.out::println);// limit限制长度

        System.out.println("------------------------");
        arr3.map(i -> i * 2).forEach(System.out::println);// map映射

        // stream流只能使用或者链接一次
        // 中间操作会返回新的stream流,为了避免大量中间变量的使用,推荐使用链式编程
        System.out.println("-----------------");

        stream2.limit(4).map(i -> i * i).filter(j -> j>10).forEach(System.out::println);
        // skip跳过

        long cnt = stream1.limit(10).skip(2).count();
        System.out.println("计数为: " + cnt);

        // 终结方法除了以上的forEach 和 count,还有toArray 和 Collect,用于把数据收集起来存放在数组中或者集合中

        Object[] streamarr = stream.limit(10).toArray();
        System.out.println(Arrays.toString(streamarr));

        ArrayList<String> listname = new ArrayList<>();
        Collections.addAll(listname, "HPF-1-18", "HPPPPF-0-10", "HPFFFF-1-19", "HPPPPFFF-1-45", "HPFF-0-17","HPF-1-18");
        Set<String> retSet = listname.stream().filter(s -> s.split("-")[1].equals("1")).collect(Collectors.toSet());
        // 收集到Set中能自动去重
        System.out.println(retSet);
        // 收集到Map中,需要写键值的生成规则,注意,键不能重复
        ArrayList<String> listname1 = new ArrayList<>();
        Collections.addAll(listname1,"HPF,18","HPPF,19","HPFF,18","hpf,16");
        Map<String, Integer> name_age = listname1.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >=18 )
                .collect(Collectors.toMap(s->s.split(",")[0] , s -> Integer.parseInt(s.split(",")[1]) ));

        System.out.println(name_age);
    }
}
