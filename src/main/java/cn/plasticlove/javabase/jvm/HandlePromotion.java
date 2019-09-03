package cn.plasticlove.javabase.jvm;

/**
 * @author luka-seu
 * @description 内存分配担保机制
 * @create 2019/9/3-19:55
 */
public class HandlePromotion {
    public static void main(String[] args) {
        //堆得大小固定在20M
        //新生代和老年代对半都是10M
        //EDEN:FROM:TO = 8:1:1


        byte[] b1 = new byte[2*1024*1024];//2MB
        byte[] b2 = new byte[2*1024*1024];//2MB
        byte[] b3 = new byte[2*1024*1024];//2MB

        //往eden放b4的时候，会产生一次YGC，但是b1,b2,b3都还存活，这时会将存活的对象从EDEN移到老年区。
        //但不是都移过去，只要腾出可以存放b4的空间即可（待商榷）
        byte[] b4 = new byte[5*1024*1024];//2MB
    }
}
