package com.how2java.merge;

import java.util.Calendar;

/**
 * @Description: string与stringbuffer性能比较
 * @Author: LYS
 * @Date: 2019/2/25 15:01
 */
public class train7 {
    public static void main(String[] args) {
//        练习：
//        String与StringBuffer的性能区别?
//        生成10位长度的随机字符串
//          然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
//          然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
        String[] strList = new String[1000];
        for (String string : strList) {
            string = getStr(1000);
        }

        //方案一使用String
        long startTime1 = Calendar.getInstance().getTimeInMillis();
        String strTest = new String();
        for (String string : strList) {
            strTest += string;
        }
        long endTime1 = Calendar.getInstance().getTimeInMillis();
        System.out.println("使用String共耗时:"+(endTime1-startTime1));

        //方案二
        long startTime2 = Calendar.getInstance().getTimeInMillis();
        StringBuffer strTest2 = new StringBuffer();
        for (String string : strList) {
            strTest2.append(string);
        }
        long endTime2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("使用StringBuffer共耗时:"+(endTime2-startTime2));
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
