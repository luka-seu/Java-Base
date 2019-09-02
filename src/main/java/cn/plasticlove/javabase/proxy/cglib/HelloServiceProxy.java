package cn.plasticlove.javabase.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author luka-seu
 * @description cglib动态代理
 * @create 2019/9/2-14:35
 */
public class HelloServiceProxy implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("After");
        return invokeSuper;
    }
}
