package com.how2java.HighKnowledge.classTest;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/30 17:24
 */
public class hugtest {
    private Logger logger = LoggerFactory.getLogger(hugtest.class);


    public static void main(String[] args) {
        Map<String, List<Hero>> urlMap = new HashMap<>();
        Hero entity = new Hero();

        List<Hero> heroList = new ArrayList<>();
        entity.setName("aa");
        entity.setDamage(11);
        heroList.add(entity);
        urlMap.put("asdad", heroList);

        List<Hero> heroList2 = new ArrayList<>();
        Hero entity2 = new Hero();
        entity2.setName("www");
        entity2.setDamage(22);
        heroList2.add(entity2);
        urlMap.put("new", heroList2);
        System.out.println(JSON.toJSONString(urlMap));

        List<Hero> heroLisat = urlMap.get("new");
        Hero entity3 = new Hero();
        entity3.setName("www");
        entity3.setDamage(22);
        heroLisat.add(entity3);
        urlMap.put("new", heroLisat);
        System.out.println(JSON.toJSONString(urlMap));

//
//
//        List<Hero> list= new ArrayList<>();
//
//        list.add(entity);
//        entity.setName("bb");
//        entity.setDamage(22);
//        list.add(entity);
//        System.out.println(JSON.toJSONString(list));
//        System.out.println(JSON.toJSONString(list, SerializerFeature.DisableCircularReferenceDetect));
//        logger.info("-======》"+ JSON.toJSONString());("list="+ JSONObject.toJSONString()list);

    }


    public static String dealElementText(String str) {
        return str == null ? "" : str.trim();
    }
}
