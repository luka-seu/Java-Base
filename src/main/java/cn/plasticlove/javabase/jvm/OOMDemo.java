package cn.plasticlove.javabase.jvm;

/**
 * @author luka-seu
 * @description JVMOOM演示
 * @create 2019/9/2-15:23
 */
public class OOMDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        // heapOOM();
        // Thread.sleep(Integer.MAX_VALUE);
    }
    /**
     * StackOverFlowError
     * 栈溢出：方法递归
     */
    public static void demo(){
        demo();
    }
    /**
     * 堆溢出:java.lang.OutOfMemoryError: Java heap space
     */
    public static void heapOOM(){
        byte[] bytes = new byte[80*1024*1024];
    }
    /**
     * GC overhead limit exceeded
     * 大量时间用于GC,但是回收效果不明显
     */


    /**
     * direct buffer memory
     * NIO时分配内存时不够
     */

    /**
     * unable to create native thread
     * 创建的线程太多
     */

}
