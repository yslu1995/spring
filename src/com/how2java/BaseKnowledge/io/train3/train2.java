package com.how2java.BaseKnowledge.io.train3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Description: 拆分文件
 * @Author: LYS
 * @Date: 2019/3/3 9:38
 */
public class train2 {
    public static void main(String[] args) {
        try {
            File f = new File("d:/jj/kk/55/aaa.txt");
            System.out.println("获取文件的长度：" + f.length());
            //获取文件的信息
            //创建基于文件的输入流
            FileInputStream fileIn = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fileIn.read(all);

            System.out.println(all.length);
            //获取父路径
            String road = f.getAbsolutePath();
            for (int i = 0; i < (f.length() / 1024 + 1); i++) {
                File fson = new File(road + "-" + i);
                FileOutputStream fileOut = new FileOutputStream(fson);
                byte data[] = new byte[1025];
                if (1024 * (i + 1) < all.length) {
                    System.arraycopy(all, 1024 * i, data, 0, 1024);
                } else {
                    System.arraycopy(all, 1024 * i, data, 0, all.length - 1024 * i);
                }
                fileOut.write(data);
                fileOut.close();
            }
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
