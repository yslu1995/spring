package com.how2java.merge;

/**
 * @Description: 字符串
 * @Author: LYS
 * @Date: 2019/2/25 11:30
 */
public class train5 {
    public static void main(String[] args) {
//        穷举法破解密码
//        要求： 分别使用多层for循环 和 递归解决上述问题
//        1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            int a = (int) (33 + Math.random() * (126 - 33 + 1));
            char asd = (char) a;
            stringBuffer = stringBuffer.append(asd);
            System.out.println("此次a的值为" + a + " " + asd);
            stringBuffer = stringBuffer.append(",");
        }
        String d = new String(stringBuffer);
        System.out.println("本次的密码为：" + stringBuffer);
        String[] list = d.split(",");
//        2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
        for (int i = 33; i < 126; i++) {
            if (list[0].equals(String.valueOf((char) i))) {
                System.out.println("找到第一个密码：" + String.valueOf((char) i));
                for (int b = 33; b < 126; b++) {
                    if (list[1].equals(String.valueOf((char) b))) {
                        for (int c = 33; c < 126; c++) {
                            if (list[2].equals(String.valueOf((char) c))) {
                                System.out.println("密码已找到！ 密码为：" + String.valueOf((char) i) + String.valueOf((char) b) + String.valueOf((char) c));
                                c=126;
                            }
                        }
                        b=126;
                    }

                }
                i=126;
            }
        }
    }
}
