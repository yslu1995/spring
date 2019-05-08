package com.how2java.HighKnowledge.classTest;

import java.io.File;
import java.io.FileReader;

/**
 * @Description:读取文件内容
 * @Author: LYS
 * @Date: 2019/3/24 10:17
 */
public class readText {

    public static void main(String[] args) throws InterruptedException {
        File f = new File("D:\\360MoveData\\Users\\Administrator\\Desktop\\做代码任务流程.txt");

        try (FileReader fr = new FileReader(f)) {
            String className = null;
            char[] all = new char[(int) f.length()];
            fr.read(all);
            className = new String(all);
            System.out.println(className);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
