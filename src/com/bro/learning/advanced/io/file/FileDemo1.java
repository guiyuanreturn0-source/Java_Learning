package com.bro.learning.advanced.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo1 {
    static void main() {
        // 获取电脑盘符
        File[] arr = File.listRoots(); // 静态方法
        System.out.println(Arrays.toString(arr));

        // list
        File file1 = new File("src/com/bro/learning/advanced/io/file");
        String[] arr1 = file1.list();
        System.out.println(Arrays.toString(arr1));

        // list(filter)
        File file2 = new File("src/com/bro/learning/advanced/io/file");
        String[] arr2 = file2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {// 参数一:父级路径 参数二:子级路径
                // 返回true即保留
                return name.endsWith(".txt");
            }
        });// 匿名内部类,也可以写成lambda表达式或者方法引用
        System.out.println(Arrays.toString(arr2));
    }
}
