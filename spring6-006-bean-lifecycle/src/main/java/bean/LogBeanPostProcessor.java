package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 日志Bean后处理器
 * @ClassName: BeanPostProcessor
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 17:44
 * @Author:XSS
 **/
public class LogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行Bean后处理器的before方法...");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /**
     * 方法有两个参数
     * 第一个参数：刚创建的bean对象
     * 第二个参数：bean的名字
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行Bean后处理器的after方法...");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
