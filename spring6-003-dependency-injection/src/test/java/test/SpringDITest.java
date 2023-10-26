package test;

import bean.*;
import jdbc.MyDataSource;
import jdbc.MyDataSource1;
import jdbc.MyDataSource2;
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
    public void testProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource dataSource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(dataSource);
    }
    @Test
    public void testAutowire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        //OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        //orderService.generate();
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        customerService.save();
    }
    @Test
    public void testUtil(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 myDataSource1 = applicationContext.getBean("myDataSource1", MyDataSource1.class);
        MyDataSource2 myDataSource2 = applicationContext.getBean("myDataSource2", MyDataSource2.class);
        System.out.println(myDataSource1);
        System.out.println(myDataSource2);
    }
    @Test
    public void testC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }
    @Test
    public void testP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dog = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dog);
    }
    @Test
    public void testSpecial(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MathBean mathBean = applicationContext.getBean("mathBean", MathBean.class);
        System.out.println(mathBean);
    }
    @Test
    public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat cat = applicationContext.getBean("catBean", Cat.class);
        System.out.println(cat);
    }
    @Test
    public void testCollection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
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
