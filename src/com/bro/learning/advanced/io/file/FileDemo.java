package com.bro.learning.advanced.io.file;

// 文件操作

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FileDemo {
    static void main() {
        // 创建file对象
        File file = new File("src/com/bro/learning/advanced/io/file");
        // file的创建有三种构造方式,(字符串填写文件路径),(父路径,子路径),(父文件对象,子路径),file对象表示的对象可以是不存在的
        // file常用方法
        System.out.println(file.isDirectory());// 判断是不是文件夹
        System.out.println(file.exists());// 判断存在
        File file1 = new File(file, "testa.txt");
        System.out.println(file1.isFile());// 判断是不是文件
        System.out.println(file1.exists());// 判断存在

        System.out.println("------------------");

        // 大小
        long len = file.length();
        System.out.println(len);// 返回文件的大小,单位为字节,无法返回文件夹的大小,结果会因为操作系统的不同而不同
        System.out.println(file1.length());

        System.out.println("------------------");

        // 获取文件路径
        System.out.println(file.getAbsolutePath());// 获取绝对路径
        System.out.println(file.getParent());// 获取定义文件对象时使用的路径

        System.out.println("------------------");

        // 获取名字
        System.out.println(file.getName());
        System.out.println(file1.getName());// 包含后缀

        System.out.println("------------------");

        // 返回最新的修改时间,单位毫秒
        long time = file.lastModified();
        System.out.println(time);
        // 使用Date类转格式
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(time));

        System.out.println("------------------");

        // 创建文件
        boolean flag;
        File file2 = new File("src/com/bro/learning/advanced/io/file","ddd.txt");
        try {
            flag = file2.createNewFile();// 创建文件,如果已有同名(包括后缀)文件,则抛出异常
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(flag);

        System.out.println("------------------");

        // 创建文件夹 mkdir创建单级文件夹 mkdirs创建单级和多级文件夹(底层就是mkdir实现的)
        File file3 = new File(file,"ggg\\hhh");
        System.out.println(file3.mkdirs());

        // 删除,用法如下
        // file.delete(); // 永久删除文件(不会进入回收站)和空文件夹,对于有内容的文件夹需要先递归删除目录下的文件,否则删除失败并返回false
        // file.deleteOnExit(); // 它会在虚拟机终止时请求删除文件，通常用于清理临时文件，但不易控制且不推荐作为主要删除手段

        System.out.println("------------------");

        // 遍历 listFile() 获取文件夹下的所有内容,存储在数组中并返回
        File[] file4 = file.listFiles();
        assert file4 != null : "file不能为空" ;// 这里使用了断言,用法: assert 断言条件 : 断言失败带出的消息;
        for(File f : file4) System.out.println(f);
    }
}
