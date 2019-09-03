package cn.plasticlove.javabase.jvm;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description JVM的内存分配
 * @create 2019/9/3-19:14
 */
public class MemoryAllcation {
    public static void main(String[] args) throws InterruptedException {
        //大对象直接进入老年代
        byte[] bytes = new byte[80*1024*1024];
        Thread.sleep(Integer.MAX_VALUE);
    }
}
