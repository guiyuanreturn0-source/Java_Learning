package com.bro.learning.coreAPI.Object_Big;

// BigDecimal
// 大!浮点!

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDec {
    static void main() {
        // 和BigInteger 类似
        BigDecimal bigdec = new BigDecimal("123.45");
        System.out.println("bigdec = " + bigdec);
        System.out.println("bigdec = " + bigdec.add(bigdec));

        // 加减乘除也类似,特别的,BigDecimal除法可以设置精度与舍入
        BigDecimal bigdec1 = new BigDecimal("1.422341");
        System.out.println("bigdec1 = " + bigdec1);
        System.out.println(bigdec.divide(bigdec1, RoundingMode.HALF_DOWN));// 五舍
        System.out.println(bigdec.divide(bigdec1, RoundingMode.HALF_UP));// 四舍五入
    }
}
