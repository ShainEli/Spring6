package test;

import bean.User;
import org.junit.Test;
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
    @Test
    public void testBeanLifeCycleFive(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println("第四步：使用Bean:" + user);
        // 注意：必须手动关闭Spring容器，Spring容器才会销毁Bean
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
