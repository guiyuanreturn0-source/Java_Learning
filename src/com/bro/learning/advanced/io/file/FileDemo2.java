package com.bro.learning.advanced.io.file;

// 递归实现多级文件查找 多级文件夹的删除

import java.io.File;

public class FileDemo2 {
    static int cnt = 0;

    static void main() {
        // 查找
        File f = new File("src/com");
        seek(f);
        System.out.println("在该目录一共找出了 " + cnt + " 个txt文件");
        // 修改方法就可以统计各类文件,计算文件夹大小...

        // 删除多级文件夹
        File testf = new File("src/com/bro/learning/advanced/io/file/test");
        System.out.println(delDirs(testf));

    }

    public static void seek(File seek){
        File[] files = seek.listFiles();
        for (File file : files) {
            // 如果是文件夹就继续往下找
            if (file.isDirectory()) {
                seek(file);
            }
            // 如果是文件就判断并输出
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file.getAbsolutePath());
                cnt++;
            }

        }
    }

    public static boolean delDirs(File dir){
        if(!dir.exists()) return false;

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            }else {
                delDirs(file);
            }
        }
        dir.delete();
        return true;
    }
}
