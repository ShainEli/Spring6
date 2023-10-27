package test;

import bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName: SpringBeanScopeTest
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/27 15:56
 * @Author:XSS
 **/
public class SpringBeanScopeTest {
    @Test
    public void testBeanScope(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);
    }
}
