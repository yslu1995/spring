package com.how2java.BaseKnowledge.io.train2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by LuYaoSheng
 * Created time 2019/03/02 16:44
 * Description
 */
public class test {
    public static void main(String[] a){
        try {
            File f = new File("d:/aasd.txt");
            // 创建基于文件的输入流
            FileOutputStream fis = new FileOutputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}