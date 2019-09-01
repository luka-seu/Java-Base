package cn.plasticlove.javabase.string;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 字符串new
 * @create 2019-09 01-22:08
 **/

public class NewString {
    @Test
    public void test(){
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);
    }
}
