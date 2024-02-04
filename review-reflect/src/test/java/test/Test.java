package test;

import icu.shain.SomeService;
/**
 * @description: 测试
 * @param: null
 * @return:
 * @author: shain
 * @since: 2024/2/4 10:06
 */
public class Test {
    public static void main(String[] args) {
        // 不使用反射机制调用方法
        SomeService someService = new SomeService();
        someService.doSomething();
        /**
         * 分析：调用一个方法，当中含有几个要素？四要素：类、方法、参数、返回值
         * 第一个要素：调用哪个对象
         * 第二个要素：调用哪个方法
         * 第三个要素：调用方法时，传递什么参数
         * 第四个要素：调用方法后，返回什么值
         * 即使是使用反射机制，也需要知道这四要素
         */
        String s1 = someService.doSomething("小三");
        System.out.println(s1);
        String s2 = someService.doSomething("小三", 23);
        System.out.println(s2);
    }
}