import bean.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @ClassName: FirstSpringTest
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 17:27
 * @Author:XSS
 **/
public class FirstSpringTest {
    @Test
    public void testBeginInitBean(){
        //注意：不是在调用getBean()方法的时候创建对象，面是执行以下代码时就会实例化对象
        new ClassPathXmlApplicationContext("Application.xml");

        //使用log4j2记录日志信息
        //1.创建日志记录对象
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        //2.记录日志，根据不同的级别来输出日志
        logger.info("我是一条消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");
    }
    @Test
    public void testBeanFactory(){
        //ApplicationContext接口的超级父接口是：BeanFactory
        //BeanFactory是IoC容器的顶级接口
        //Spring的IoC容器底层使用了：工厂模式
        //Spring的IoC容器底层实现 = xml解析 + 工厂模式 + 反射机制
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }
    @Test
    public void testFirstSpringCOde(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        Object userDaoBean = applicationContext.getBean("userDaoBean");
        System.out.println(userDaoBean);
    }
    @Test
    public void testXmlPath() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/Application2.xml");
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);
    }
    @Test
    public void testDataFormatCode(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        Date nowTime = applicationContext.getBean("nowTime", Date.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatted = sdf.format(nowTime);
        System.out.println(formatted);
    }
}
