package com.bro.learning.coreAPI.system_math_random;

// AI生成了一个 Random 基础方法演示

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Random类基础方法演示 ===");

        // 1. 生成不同类型的随机数
        System.out.println("\n1. 生成各种类型的随机数:");
        System.out.println("随机整数: " + random.nextInt());
        System.out.println("随机0-99的整数: " + random.nextInt(100));
        System.out.println("随机长整数: " + random.nextLong());
        System.out.println("随机浮点数(0.0-1.0): " + random.nextFloat());
        System.out.println("随机双精度浮点数(0.0-1.0): " + random.nextDouble());
        System.out.println("随机布尔值: " + random.nextBoolean());

        // 2. 使用特定种子（可重复的随机序列）
        System.out.println("\n2. 使用种子的随机数生成:");
        System.out.print("请输入一个种子值: ");
        long seed = scanner.nextLong();
        Random seededRandom = new Random(seed);

        System.out.println("使用种子 " + seed + " 生成的随机数:");
        for (int i = 0; i < 5; i++) {
            System.out.print(seededRandom.nextInt(100) + " ");
        }
        System.out.println();

        // 相同种子产生相同序列
        Random seededRandom2 = new Random(seed);
        System.out.println("相同种子再次生成的随机数:");
        for (int i = 0; i < 5; i++) {
            System.out.print(seededRandom2.nextInt(100) + " ");
        }
        System.out.println();

        // 3. 生成指定范围的随机数
        System.out.println("\n3. 指定范围的随机数生成:");
        System.out.print("请输入最小值: ");
        int min = scanner.nextInt();
        System.out.print("请输入最大值: ");
        int max = scanner.nextInt();

        System.out.println("生成10个" + min + "到" + max + "的随机整数:");
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(max - min + 1) + min;
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. 高斯分布（正态分布）随机数
        System.out.println("\n4. 高斯分布（正态分布）随机数:");
        System.out.println("生成10个高斯分布随机数（均值0，标准差1）:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.4f ", random.nextGaussian());
        }
        System.out.println();

        // 自定义均值和标准差
        double mean = 50.0;  // 均值
        double stdDev = 10.0; // 标准差
        System.out.println("\n生成10个均值为" + mean + "，标准差为" + stdDev + "的高斯分布随机数:");
        for (int i = 0; i < 10; i++) {
            double gaussian = random.nextGaussian() * stdDev + mean;
            System.out.printf("%.2f ", gaussian);
        }
        System.out.println();

        // 5. 字节数组填充
        System.out.println("\n5. 随机字节数组生成:");
        byte[] byteArray = new byte[10];
        random.nextBytes(byteArray);

        System.out.print("随机字节数组: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.print("十六进制表示: ");
        for (byte b : byteArray) {
            System.out.printf("%02X ", b);
        }
        System.out.println();

        scanner.close();
    }
}
