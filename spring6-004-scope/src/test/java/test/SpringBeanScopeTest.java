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
    public void testThread(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);

        //启动一全新的线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean springBean2 = applicationContext.getBean("springBean", SpringBean.class);
                System.out.println(springBean2);
            }
        }).start();
    }
    @Test
    public void testBeanScope(){
        /**
         * 1.Spring默认情况下Bean是单例(singleton)的，在Spring上下文初始化的时候实例化，每一次调用getBean()方法的时候，都返回那个单例的对象
         * 2.当将Bean的scope属性设置为prototype(原型)时：bean是多例的，在Spring上下文初始化的时候,并不会实例化该bean对象
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);
        SpringBean springBean2 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean2);
        SpringBean springBean3 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean3);
    }
}
