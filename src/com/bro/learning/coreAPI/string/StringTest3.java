package com.bro.learning.coreAPI.string;
/*
* 问题描述：

编写一个工具类，包含以下验证方法：
验证邮箱格式
验证手机号格式（中国大陆11位）

*/

import java.util.Scanner;

public class StringTest3 {
    static void main() {
        // 邮箱验证
        System.out.println("请输入邮箱: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.endsWith("@qq.com")){
            System.out.println("登录qq邮箱");
        }else if(str.endsWith("@gmail.com")){
            System.out.println("登录Google邮箱");
        }else if(str.endsWith("@163.com")){
            System.out.println("登录网易邮箱");
        }else {
            System.out.println("不支持该邮箱或邮箱格式不正确!");
        }

        // 手机号验证 第一位必须为1 的 11位数字
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入电话号码: ");
        String str2 = sc2.nextLine();

        // 长度检查
        if(str2.length() != 11){
            System.out.println("请输入正确的手机号!");
        }else{
            // 检查首位
            if(str2.charAt(0) != '1'){
                System.out.println("请输入正确的手机号!");
            }else{
                // 检查是否含有非数字字符
                boolean flag = true;
                for(int i = 1; i < str2.length(); i++){
                    if(str2.charAt(i) < '0' ||  str2.charAt(i) > '9'){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("输入正确");
                }else{
                    System.out.println("手机号只能含有数字!");
                }
            }
        }

    }
}
