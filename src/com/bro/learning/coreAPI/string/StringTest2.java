package com.bro.learning.coreAPI.string;

/*
问题描述：
实现简单的字符串压缩算法。如果压缩后的字符串比原字符串短，则返回压缩后的字符串，否则返回原字符串。

压缩规则：
将连续重复的字符替换为"字符+重复次数"
如果字符只出现一次，不添加数字
*/

import java.util.Scanner;

public class StringTest2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = compress(str);
        System.out.println(str);
    }

    public static String compress(String str) {
        // 检查字符串是否为空
        if(str.length() <= 1 || str == null) return str;
        // 创建一个stringbuilder对象,扫描到连续相同字符串就append
        StringBuilder sb = new StringBuilder();
        char ch =  str.charAt(0);
        int cnt = 1;
        for(int i = 1;i < str.length();i++){
            if(str.charAt(i) != ch || i ==  str.length()-1){
                // 检查最后一个字符是否连续
                // 连续则cnt++
                if(i == str.length()-1 && ch == str.charAt(i)) cnt++;

                // 遍历到不相同的字符就append
                sb.append(ch);
                // cnt > 1则不加
                if(cnt > 1) sb.append(cnt);
                ch = str.charAt(i);
                cnt = 1;

                // 不连续则直接append
                if(i == str.length()-1 && ch != str.charAt(i-1)) sb.append(ch);
            }else cnt++;
        }
        // 检查是是否有压缩并返回
        if(str.contentEquals(sb)) return str;
        else return sb.toString();
    }
}
