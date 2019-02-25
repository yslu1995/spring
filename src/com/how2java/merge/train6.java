package com.how2java.merge;

/**
 * @Description: 比较字符串
 * @Author: LYS
 * @Date: 2019/2/25 14:11
 */
public class train6 {
    public static void main(String[] args) {
        //定义字符串长度
        int STR_LENGTH = 100;
//        创建一个长度是100的字符串数组
//        使用长度是2的随机字符填充该字符串数组
//        统计这个字符串数组里重复的字符串有多少种
        String[] strList = new String[STR_LENGTH];
        String[] strTest = new String[STR_LENGTH];
        for (int i = 0; i < STR_LENGTH; i++) {
            strList[i] = getStr(2);
            System.out.print(strList[i] + "  ");
            strTest[i] = "1";
            if ((i + 1) % 25 == 0) {
                System.out.println();
            }
        }
        for (int i = 0; i < STR_LENGTH; i++) {
            if (strTest[i].equals("1")) {
                for (int j = i + 1; j < STR_LENGTH; j++) {
                    if (strList[j].equals(strList[i])) {
                        strTest[j] = "0";
                        strTest[i] = "2";//表示是重复的字段鼻祖！
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < STR_LENGTH; i++) {
            if (strTest[i].equals("2")) {
                System.out.print(strList[i]+"   ");
                count++;
            }
        }
        System.out.println("共有" + count + "种重复的字段");
    }

    //获取随机字符串 字符串的长度为number
    private static String getStr(int number) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < number; i++) {
            int a = (int) (33 + Math.random() * (126 - 33 + 1));
            char asd = (char) a;
            //只有字母或数字
            if (Character.isLetterOrDigit(asd)) {
                stringBuffer = stringBuffer.append(asd);
            } else {
                i--;
            }
        }
        return stringBuffer.toString();
    }
}
