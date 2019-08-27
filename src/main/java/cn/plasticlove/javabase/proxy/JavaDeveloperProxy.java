package cn.plasticlove.javabase.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author luka-seu
 * @description 代理对象的代理类
 * @create 2019-08 27-22:03
 **/

public class JavaDeveloperProxy {

    public static void main(String[] args) {
        final JavaDeveloper java = new JavaDeveloper();
        //代理返回的是接口
        Developer developer = (Developer) Proxy.newProxyInstance(java.getClass().getClassLoader(), java.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //在需要的方法前进行增强
                if (method.getName().equals("debug")){
                    System.out.println("debug is enhance!");
                    return method.invoke(java,args);
                }
                if (method.getName().equals("code")){
                    System.out.println("code cannot enhance!");
                    return null;
                }
                return null;
            }
        });
        developer.code();
        developer.debug();
    }
}
