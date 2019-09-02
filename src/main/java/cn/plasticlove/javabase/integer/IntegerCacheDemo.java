package cn.plasticlove.javabase.integer;

import java.sql.SQLOutput;

/**
 * @author luka-seu
 * @description Integer的相等比较，缓存
 * @create 2019/9/2-16:29
 */
public class IntegerCacheDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1==i2);
        Integer i3 = 100;
        int i4 = 200;
        System.out.println(i4==i2);
        Integer i5 = 200;
        Integer i6 = 200;
        System.out.println(i3==i5);
        System.out.println(i3==i2);
    }


}
