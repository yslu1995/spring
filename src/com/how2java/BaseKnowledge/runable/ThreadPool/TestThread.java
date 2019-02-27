package com.how2java.BaseKnowledge.runable.ThreadPool;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/2/25 17:20
 */
public class TestThread {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");// 和上面相同 ， 会自己筛选

        System.out.println("第一种：通过Map.keySet遍历key和value：");
        for (Integer in : map.keySet()) {
            //map.keySet()返回的是所有key的值
            String str = map.get(in);//得到每个key多对用value的值
            System.out.println(in + "     " + str);
        }

        System.out.println("第三种：通过Map.entrySet遍历key和value");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            //Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
            //entry.getKey() ;entry.getValue(); entry.setValue();
            //map.entrySet()  返回此映射中包含的映射关系的 Set视图。
            System.out.println("key= " + entry.getKey() + " and value= "
                    + entry.getValue());
        }


//        ThreadPool pool = new ThreadPool();
//
//        for (int i = 0; i < 5; i++) {
//            Runnable task = new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("执行任务");
//                    //任务可能是打印一句话
//                    //可能是访问文件
//                    //可能是做排序
//                }
//            };
//
//            pool.add(task);
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//         byte[] tokenHash = "tokenInfo".getBytes();
//        System.out.println(tokenHash);
////        byte[] keyToken = serializer.serialize(user.getId() + ":" + partnerType);

    }
}
