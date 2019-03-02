package com.how2java.BaseKnowledge.io.train1;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by LuYaoSheng
 * Created time 2019/03/02 15:34
 * Description 调试
 */
public class test2 {
    public static void main(String[] d) {
        Map<String, String> map = new TreeMap<String, String>();

        map.put("1", "kfc");
        map.put("1615156", "wnba");
        map.put("66666", "nba");
        map.put("25229", "cba");

        Map<String, String> resultMap = sortMapByKey(map);    //按Key进行排序

        for (Map.Entry<String, String> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, String> sortMap = new TreeMap<>(
                new MapKeyComparator());

        sortMap.putAll(map);

        return sortMap;
    }
}
