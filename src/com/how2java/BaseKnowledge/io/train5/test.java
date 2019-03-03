package com.how2java.BaseKnowledge.io.train5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/3 11:11
 */
public class test {
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是AB
        File f = new File("d:/jj/kk/55/aaa.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.print(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
