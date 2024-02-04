package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Test4 test = new Test4();
        Object obj = test.test("icu.shain.User", "age", "set");
        System.out.println(obj);
    }

    /**
     * @description: 使用反射调用方法
     * @param: className,propertyName,methodName
     * @return: java.lang.Object
     * @author: shain
     * @since: 2024/2/4 11:15
     */
    public Object test(String className, String propertyName, String methodName) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
         * 需求：
         * 1.类名：icu.shain.User;类符合javabean规范，且包含有get、set方法
         * 2.属性：age(int), name(String)
         * 使用反射机制，创建对象，并设置属性值
         */
        // 1.获取类
        Class<?> clazz = Class.forName(className);
        // 2.获取方法名
        String MethodName = methodName + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
        // 3.根据属性名获取属性类型
        Field field = clazz.getDeclaredField(propertyName);
        // 4.获取方法
        Method method = clazz.getDeclaredMethod(MethodName, field.getType());
        // 5.创建对象
            //Object obj = clazz.newInstance();
        Object obj = clazz.getDeclaredConstructors()[0].newInstance();
        // 6.调用方法
        method.invoke(obj, 10);
        return obj;
    }
}