package com.bro.learning.coreAPI.system_math_random;

// AI生成的一个 Math 常用方法的演示

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 计算圆的面积
        System.out.print("请输入圆的半径: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("圆的面积: %.2f\n", area);

        // 2. 计算一个数的各种运算
        System.out.print("\n请输入一个数字: ");
        double num = scanner.nextDouble();
        System.out.printf("平方: %.2f\n", Math.pow(num, 2));
        System.out.printf("立方: %.2f\n", Math.pow(num, 3));
        System.out.printf("平方根: %.2f\n", Math.sqrt(num));
        System.out.printf("立方根: %.2f\n", Math.cbrt(num));

        // 3. 生成随机整数
        System.out.print("\n请输入随机数范围(最小值 最大值): ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        System.out.println("生成5个随机整数:");
        for (int i = 0; i < 5; i++) {
            int randomNum = (int)(Math.random() * (max - min + 1)) + min;
            System.out.print(randomNum + " ");
        }
        System.out.println();

        // 4. 比较两个数
        System.out.print("\n请输入两个数字进行比较: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.printf("较大的数是: %.2f\n", Math.max(a, b));
        System.out.printf("较小的数是: %.2f\n", Math.min(a, b));
        System.out.printf("绝对值差: %.2f\n", Math.abs(a - b));

        // 5. 角度转换
        System.out.print("\n请输入角度(度): ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.printf("弧度: %.4f\n", radians);
        System.out.printf("sin(%.1f°) = %.4f\n", degrees, Math.sin(radians));
        System.out.printf("cos(%.1f°) = %.4f\n", degrees, Math.cos(radians));
        System.out.printf("tan(%.1f°) = %.4f\n", degrees, Math.tan(radians));

        scanner.close();
    }
}
