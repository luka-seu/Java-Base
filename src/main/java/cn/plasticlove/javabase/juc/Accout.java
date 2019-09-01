package cn.plasticlove.javabase.juc;

/**
 * @author luka-seu
 * @description 死锁账户类
 * @create 2019-09 01-21:29
 **/

public class Accout {
    private int money;

    public Accout(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
