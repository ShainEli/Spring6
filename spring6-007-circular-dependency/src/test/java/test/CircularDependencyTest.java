package test;

import icu.shain.bean.Husband;
import icu.shain.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {
    @Test
    public void testCD() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }
    @Test
    public void testCD2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Husband husbandBean = applicationContext.getBean("husbandman", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wife", Wife.class);
        System.out.println(wifeBean);
    }
}