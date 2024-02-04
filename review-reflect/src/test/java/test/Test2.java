package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception {
        // 使用反射机制调用方法
        // 1.获取Class对象
        Class<?> clazz = Class.forName("icu.shain.SomeService");
        // 2.获取方法
        Method doSomethingMethod = clazz.getDeclaredMethod("doSomething", String.class, int.class);
        // 3.调用方法
        // 反射机制调用方法，需要先获取到Method对象
        // Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        // Object newInstance = declaredConstructors[0].newInstance();
        Object retValue = doSomethingMethod.invoke(clazz.getDeclaredConstructors()[0].newInstance(), "Hello", 123);
        System.out.println(retValue);
    }
}