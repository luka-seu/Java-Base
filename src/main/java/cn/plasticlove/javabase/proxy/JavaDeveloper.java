package cn.plasticlove.javabase.proxy;

/**
 * @author luka-seu
 * @description 代理的实例对象
 * @create 2019-08 27-22:02
 **/

public class JavaDeveloper implements Developer {
    public void code() {
        System.out.println("I am Coding!");
    }

    public void debug() {
        System.out.println("I am Debugging");
    }
}
