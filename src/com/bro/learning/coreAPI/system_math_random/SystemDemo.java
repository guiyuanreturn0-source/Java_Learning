package com.bro.learning.coreAPI.system_math_random;

// // AI生成的一个 System 常用方法的演示

public class SystemDemo {
    public static void main(String[] args) {
        // 1. 获取系统属性
        System.out.println("=== 系统属性 ===");
        System.out.println("操作系统: " + System.getProperty("os.name"));
        System.out.println("系统版本: " + System.getProperty("os.version"));
        System.out.println("Java版本: " + System.getProperty("java.version"));
        System.out.println("用户目录: " + System.getProperty("user.home"));
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
        System.out.println("文件分隔符: " + System.getProperty("file.separator"));
        System.out.println("行分隔符: " + System.getProperty("line.separator").replace("\n", "\\n").replace("\r", "\\r"));

        // 2. 获取环境变量
        System.out.println("\n=== 环境变量 ===");
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
        System.out.println("USERNAME: " + System.getenv("USERNAME"));

        // 3. 内存使用情况
        System.out.println("\n=== 内存使用情况 ===");
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        long maxMemory = runtime.maxMemory();

        System.out.printf("总内存: %,.2f MB\n", totalMemory / 1024.0 / 1024.0);
        System.out.printf("已用内存: %,.2f MB\n", usedMemory / 1024.0 / 1024.0);
        System.out.printf("空闲内存: %,.2f MB\n", freeMemory / 1024.0 / 1024.0);
        System.out.printf("最大内存: %,.2f MB\n", maxMemory / 1024.0 / 1024.0);

        // 4. 程序执行时间测量
        System.out.println("\n=== 程序性能测试 ===");

        // 测试数组排序时间
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();

        // 执行一些操作
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000);
        }

        // 冒泡排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long endNanoTime = System.nanoTime();

        System.out.printf("排序执行时间: %d 毫秒\n", endTime - startTime);
        System.out.printf("排序执行时间: %d 纳秒\n", endNanoTime - startNanoTime);

        // 5. 数组复制演示
        System.out.println("\n=== 数组复制演示 ===");
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] dest = new int[10];

        System.out.print("源数组: ");
        for (int num : source) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 使用System.arraycopy
        System.arraycopy(source, 2, dest, 0, 5);

        System.out.print("目标数组(复制后): ");
        for (int num : dest) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. 垃圾回收演示
        System.out.println("\n=== 垃圾回收 ===");
        System.gc();  // 建议JVM进行垃圾回收
        System.out.println("垃圾回收已请求");

        // 7. 程序退出
        System.out.println("\n程序即将退出...");
        // System.exit(0);  // 正常退出
    }
}
