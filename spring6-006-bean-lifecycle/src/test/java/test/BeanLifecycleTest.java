package test;

import bean.Student;
import bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: BeanLifecycleTest
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 17:32
 * @Author:XSS
 **/
public class BeanLifecycleTest {
    /**
     * Spring容器只对singleton的Bean进行完整的生命周期管理
     * 如果是prototype作用域的Bean，Spring容器只负责将该Bean初始化完毕。等客户端程序一旦获取到该Bean之后，Spring容器就不再管理该对象的生命周期了
     */
    @Test
    public void testBeanLifeCycleFive(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println("第四步：使用Bean:" + user);
        // 注意：必须手动关闭Spring容器，Spring容器才会销毁Bean
        applicationContext.close();
    }

    @Test
    public void testRegisterBean(){
        //自定义对象
        Student student = new Student();
        System.out.println(student);

        // 将自定义对象纳入Spring容器来管理
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerSingleton("studentBean", student);

        // 从Spring容器中获取
        Object studentBean = defaultListableBeanFactory.getBean("studentBean");
        System.out.println(studentBean);
    }
}
