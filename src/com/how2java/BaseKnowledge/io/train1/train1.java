package com.how2java.BaseKnowledge.io.train1;

import com.alibaba.fastjson.JSON;

import java.io.File;

/**
 * @Description: 练习一
 * @Author: LYS
 * @Date: 2019/2/27 21:48
 */
public class train1 {
    public static void main(String[] args) {
//        // 绝对路径
//        File f1 = new File("d:/LOLFolder");
//        System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
//        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
//        File f2 = new File("LOL.exe");
//        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());
//
//        // 把f1作为父目录创建文件对象
//        File f3 = new File(f1, "LOL.exe");

//        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
//        System.out.println("------------------");
//        File f = new File("d:/JavaLearn/lys.exe");
//        System.out.println("当前文件是：" + f);
//        //文件是否存在
//        System.out.println("判断是否存在：" + f.exists());
//
//        //是否是文件夹
//        System.out.println("判断是否是文件夹：" + f.isDirectory());
//
//        //是否是文件（非文件夹）
//        System.out.println("判断是否是文件：" + f.isFile());
//
//        //文件长度
//        System.out.println("获取文件的长度：" + f.length());
//
//        //文件最后修改时间
//        long time = f.lastModified();
//        Date d = new Date(time);
//        System.out.println("获取文件的最后修改时间：" + d);
//        //设置文件修改时间为1970.1.1 08:00:00
//        f.setLastModified(0);
//
//        //文件重命名
//        File f22 = new File("d:/JavaLearn/newLys.exe");
//        f.renameTo(f22);
//        System.out.println("把LOL.exe改名成了DOTA.exe");
//
//        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
        File f = new File("d:/迅雷电影");
        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        f.list();
        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[] fs = f.listFiles();
        // 以字符串形式返回获取所在文件夹
        f.getParent();
        // 以文件形式返回获取所在文件夹
        f.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        f.mkdir();
        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        f.mkdirs();
        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        try {
            f.createNewFile();
        } catch (Exception r) {
            r.printStackTrace();
        }
        // 所以创建一个空文件之前，通常都会创建父目录
        f.getParentFile().mkdirs();
        // 列出所有的盘符c: d: e: 等等
        f.listRoots();
        // 刪除文件
        f.delete();
        // JVM结束的时候，刪除文件，常用于临时文件的删除
        f.deleteOnExit();
        System.out.println(JSON.toJSONString(f));
    }
}
