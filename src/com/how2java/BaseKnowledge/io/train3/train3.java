package com.how2java.BaseKnowledge.io.train3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Description: 合并文件
 * @Author: LYS
 * @Date: 2019/3/3 10:29
 */
public class train3 {
    public static void main(String[] args) {
        File f1 = new File("d:/jj/kk/55/aaa.txt-0");
        File f2 = new File("d:/jj/kk/55/aaa.txt-1");
        File fNew = new File("d:/jj/kk/55/aaaNew.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fNew);

            FileInputStream fileInputStream1 = new FileInputStream(f1);
            FileInputStream fileInputStream2 = new FileInputStream(f2);

            //读取第一个文件内容到数组
            byte data1[] = new byte[(int) f1.length()];
            fileInputStream1.read(data1);
            System.out.println(data1);

            System.out.println("----------------");

            //读取第2个文件内容到数组
            byte data2[] = new byte[(int) f2.length()];
            fileInputStream2.read(data2);
            System.out.println(data2);

            fileOutputStream.write(hebing(data1, data2));
            fileOutputStream.close();
            fileInputStream1.close();
            fileInputStream2.close();
        } catch (Exception r) {

        }
    }

    public static byte[] hebing(byte[] byte1, byte[] byte2) {
        byte data[] = new byte[byte1.length + byte2.length];
        for (int i = 0; i < byte1.length; i++) {
            data[i] = byte1[i];
        }
        for (int i = 0; i < byte2.length; i++) {
            data[byte1.length + i] = byte2[i];
        }
        return data;
    }
}
