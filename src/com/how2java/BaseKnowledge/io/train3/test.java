package com.how2java.BaseKnowledge.io.train3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by LuYaoSheng
 * Created time 2019/03/02 16:49
 * Description
 */
public class test {
    public static void main(String[] args) {
        try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f = new File("d:/jj/kk/55/aaa.txt");
            if (!f.exists()) {
                //如果只写f.mkdirs() 就会把aaa.txt当做文件夹创建
                f.getParentFile().mkdirs();
            }
            //创建基于文件的输入流
            FileOutputStream fis = new FileOutputStream(f);
            byte data[] = {88, 89, 85};
            fis.write(data);
            //每次使用完流，都应该进行关闭
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}