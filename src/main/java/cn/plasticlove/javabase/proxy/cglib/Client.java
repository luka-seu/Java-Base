package cn.plasticlove.javabase.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author luka-seu
 * @description 测试类
 * @create 2019/9/2-14:40
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImpl.class);
        enhancer.setCallback(new HelloServiceProxy());
        HelloServiceImpl service = (HelloServiceImpl) enhancer.create();
        service.sayHello(5555);
    }
}
