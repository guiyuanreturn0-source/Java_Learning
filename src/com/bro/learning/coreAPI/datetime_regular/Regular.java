package com.bro.learning.coreAPI.datetime_regular;

// 正则表达式

public class Regular {
    static void main() {
        String reg = "...";
        String a = "212";
        System.out.println(a.matches(reg));
        // qq邮箱验证
        String qq_email = "[1-9][0-9a-zA-Z]{4,10}@qq.com$";
        String a1 = "1W0454@qq.com" ;
        System.out.println(a1.matches(qq_email));
    }
}
