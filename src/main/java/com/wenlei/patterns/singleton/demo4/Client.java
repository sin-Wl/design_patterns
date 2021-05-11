package com.wenlei.patterns.singleton.demo4;

/**
 * @author wxl
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2021年05月05日 13:57:00
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }
}
