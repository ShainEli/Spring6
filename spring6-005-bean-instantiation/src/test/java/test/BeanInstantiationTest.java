package test;

import bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: BeanInstantiation
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 14:37
 * @Author:XSS
 **/
public class BeanInstantiationTest {
    // 通过构造方法实例化
    @Test
    public void testInstantiation1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);
    }
    // 通过简单工厂模式实例化
    @Test
    public void testInstantiation2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Star star = applicationContext.getBean("starBean", Star.class);
        System.out.println(star);
    }
    // 通过factory-bean实例化
    @Test
    public void testInstantiation3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gunBean", Gun.class);
        System.out.println(gun);
    }
    // 通过FactoryBean实例化
    @Test
    public void testInstantiation4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
    }

    //
    @Test
    public void testDate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("studentBean", Student.class);
        System.out.println(student);
    }
}
