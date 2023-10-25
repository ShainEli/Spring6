package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @ClassName: SpringDITest
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 18:00
 * @Author:XSS
 **/
public class SpringDITest {
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }
}
