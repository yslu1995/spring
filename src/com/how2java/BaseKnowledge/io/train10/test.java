package com.how2java.BaseKnowledge.io.train10;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/3 13:50
 */
public class test {
    public static void main(String[] args) {
        // 控制台输入
        try (InputStream is = System.in;) {
            while (true) {
                // 敲入a,然后敲回车可以看到
                // 97 13 10
                // 97是a的ASCII码
                // 13 10分别对应回车换行
                int i = is.read();
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
