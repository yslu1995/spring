package com.how2java.merge;

import java.util.Arrays;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/2/20 10:00
 */
public class train3 {
    public static void main(String[] args) {
//        统计找出一千万以内，一共有多少质数  质数只有被1和自己能够整除
        //采用取余来判断
        System.out.println("请输入统计的范围");


        int count = 0;
        int[] iArr = new int[257];
        Arrays.fill(iArr, 1);
        for (int i = 2; i < iArr.length; i++) {
            if (iArr[i] == 1) {
                for (int j = 2; j * i < iArr.length; j++) {
                    iArr[i * j] = 0;
                }
                count++;
            }
        }
        System.out.println("质数数量：" + count);

    }
}
