package com.bro.learning.basics.controlflow;

// switch选择结构

public class Switch_case {
    public static void main() {

        switch("a"/*表达式 可以是byte short int char String 或者枚举类型*/){
            case "a":
                System.out.println("a");
                break;//如果没有break将会穿透,继续向下寻找匹配的值并执行其中的语句
            case "b":
                System.out.println("b");
                break;
            default:
                System.out.println("c");
        }

        // Java 12开始出现了一种新的写法,不需要写break 执行完自动跳出
        int day = 1;
        switch(day){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("3");
        }

        // Java14还引入了yield关键字,用于从switch表达式中返回值
        int re = switch(day){
            case 1 -> 4;
            case 2 -> 5;
            default -> 6;
        };// 整体看还是一个赋值语句,需要加上分号
        System.out.println("re = " + re);
    }
}
