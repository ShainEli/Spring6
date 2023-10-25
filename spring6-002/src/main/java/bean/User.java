package bean;

/**
 * @ClassName: User
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 17:26
 * @Author:XSS
 **/
public class User {
    // 默认情况下Spring会通过反射机制，调用类的无参数构造方法来实例化对象
    /* 实现原理如下：
    Class clazz = Class.forName("bean.User");
    Object obj = clazz.newInstance();
     */
    public User(){
        System.out.println("User的无参数构造方法执行。");
    };
}
