package com.how2java.BaseKnowledge.io.train1;

import java.util.Comparator;

/**
 * Created by LuYaoSheng
 * Created time 2019/03/02 15:46
 * Description
 */
class MapKeyComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        Long a = Long.valueOf(str1);
        Long b = Long.valueOf(str2);
        int i;
        if (a > b) {
            i = 1;
        } else {
            i = 0;
        }

        return i;
    }
}