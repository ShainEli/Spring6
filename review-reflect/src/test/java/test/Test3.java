package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取类
        Class<?> clazz = Class.forName("icu.shain.SomeService");
        // 获取方法
        Method doSomethingMethod = clazz.getDeclaredMethod("doSomething");
        // 实例化对象
        Object obj = clazz.getDeclaredConstructors()[0].newInstance();
        // 调用方法
        Object invoke = doSomethingMethod.invoke(obj);
        System.out.println(invoke);
    }
}