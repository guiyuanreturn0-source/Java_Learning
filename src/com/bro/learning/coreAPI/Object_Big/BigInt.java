package com.bro.learning.coreAPI.Object_Big;

// BigInteger
// 大!整数!

import java.math.BigInteger;

public class BigInt {
    static void main() {
        // 获取大数字
        BigInteger bigInt1 = new BigInteger("1448454174545456461624486159484951654654622"); // 字符串中只能包含整数
        BigInteger bigInt2 = new BigInteger("5554",6); // 进制,radix 参数表示字符串的进制
        System.out.println(bigInt1);
        System.out.println(bigInt2); // 十进制输出
        System.out.println(4 + 6*5 + 6*6*5 + 6*6*6*5);

        BigInteger bigInt3 = new BigInteger("2");
        System.out.println(bigInt1.add(bigInt3));// +
        System.out.println(bigInt1.subtract(bigInt3));// -
        System.out.println(bigInt1.multiply(bigInt3));// *
        System.out.println(bigInt1.divide(bigInt3));// /
        System.out.println(bigInt1.remainder(bigInt3));// %
        System.out.println(bigInt1.equals(bigInt3));// BigInteger重写了equals方法,这里比较的就是属性值
        System.out.println(bigInt3.min(bigInt2));// max,min
        System.out.println(bigInt3.pow(2));// 幂

        int a = bigInt1.intValue(); // 转成int 类型,超出范围会有误
        long b = bigInt2.longValue();
        double c = bigInt3.doubleValue();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }


}
