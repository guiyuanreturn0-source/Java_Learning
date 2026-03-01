package com.bro.learning.coreAPI.string;

/*
 编写一个程序，实现以下功能：

 接收用户输入的字符串
 将字符串反转
 判断原字符串是否是回文（正读反读都一样）
 统计字符串中字母、数字和其他字符的数量

*/

import java.util.Scanner;// 导入Scanner包

public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("初始字符串: " + str);

        StringBuilder sb = new StringBuilder(str);
        System.out.println("反转字符串: " + sb.reverse());
        System.out.println("是否回文(忽略大小写): " + str.contentEquals(sb)); // 也可以equals,但是要用toString()

        char[] str3 = str.toCharArray();
        int cnt_num = 0;
        int cnt_cha = 0;
        int cnt_oth = 0;
        for (char c : str3) {
            if(c >= '0' && c <= '9') {
                cnt_num++;
            }else if(c >= 'A' && c <= 'Z') {
                cnt_cha++;
            }else if(c >= 'a' && c <= 'z') {
                cnt_cha++;
            }else cnt_oth++;
        }
        System.out.println("统计结果如下: ");
        System.out.println("数字个数: " + cnt_num);
        System.out.println("字母个数: " + cnt_cha);
        System.out.println("其他字符个数: " + cnt_oth);
    }
}

