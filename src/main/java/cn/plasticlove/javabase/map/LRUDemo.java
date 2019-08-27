package cn.plasticlove.javabase.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author luka-seu
 * @description 基于LinkedHashMap的LRU算法
 * @create 2019-08 27-21:37
 **/

public class LRUDemo<K,V> extends LinkedHashMap<K,V> {
   private static int maxElements = 3;

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>maxElements;
    }
    //accessOrder
    LRUDemo(){
        super(maxElements,0.75f,true);
    }

    public static void main(String[] args) {
        LRUDemo<String,Integer> cache = new LRUDemo<String, Integer>();
        cache.put("1",1);
        cache.put("2",2);
        cache.put("3",3);
        cache.put("4",4);
        cache.put("5",5);
        System.out.println(cache.keySet());
    }
}
