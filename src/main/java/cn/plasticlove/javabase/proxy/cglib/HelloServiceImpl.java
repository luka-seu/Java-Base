package cn.plasticlove.javabase.proxy.cglib;

/**
 * @author luka-seu
 * @description Cglib实现动态代理
 * @create 2019/9/2-14:33
 */
public class HelloServiceImpl {
    public void sayHello(int i){
        System.out.println("cglib"+i);
    }
}
