package com.how2java.BaseKnowledge.io.train1;

import java.io.File;

/**
 * Created by LuYaoSheng
 * Created time 2019/03/02 15:08
 * Description 练习一
 */
public class train1 {
    static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile = null;
    static File maxFile = null;

    //使用递归来遍历一个文件夹的子文件
    public static void listFiles(File file) {
        if (file.isFile()) {
            System.out.printf("正在判断文件："+file.getName());
            if (file.length() > maxSize) {
                maxSize = file.length();
                maxFile = file;
            }
            if (file.length() != 0 && file.length() < minSize) {
                minSize = file.length();
                minFile = file;
            }
            return;
        }

        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            if (null != fs)
                for (File f : fs) {
                    listFiles(f);
                }
        }
    }

    public static void main(String[] args) {
        File f = new File("c:\\windows");
        listFiles(f);
        System.out.printf("最大的文件是%s，其大小是%,d字节%n", maxFile.getAbsoluteFile(), maxFile.length());
        System.out.printf("最小的文件是%s，其大小是%,d字节%n", minFile.getAbsoluteFile(), minFile.length());

    }
}