package com.wenlei.patterns.singleton.demo3;

/**
 * @author wxl
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2021年05月05日 13:58:00
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        //判断两次获取到的Singleton对象是否是同一个对象
        System.out.println(instance == instance1);
    }
}
