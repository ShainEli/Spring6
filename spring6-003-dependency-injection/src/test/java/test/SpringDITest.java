package test;

import bean.Clazz;
import bean.SimpleValueType;
import bean.Student;
import bean.User;
import jdbc.MyDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;
import service.OrderService;
import service.UserService;

import java.util.Date;

/**
 * @ClassName: SpringDITest
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 18:00
 * @Author:XSS
 **/
public class SpringDITest {

    @Test
    public void newDate(){
        System.out.println(new Date());
    }

    @Test
    public void testCascade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student student = applicationContext.getBean("studentBean", Student.class);
        Clazz clazz = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(student);
        System.out.println(clazz);
    }
    @Test
    public void testMyDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }
    @Test
    public void testSimpleTypeSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        //User user = applicationContext.getBean("userBean", User.class);
        SimpleValueType simpleValueType = applicationContext.getBean("simpleValueTypeBean", SimpleValueType.class);
        System.out.println(simpleValueType);

    }
    @Test
    public void testSetDIExt(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderService.generate();
    }
    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("customerServiceBean", CustomerService.class);
        customerService.save();
    }
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }
}
