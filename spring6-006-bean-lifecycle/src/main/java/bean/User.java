package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Bean的生命周期按照粗略的五步：
 * 第一步：实例化Bean(无参数构造方法)
 * 第二步：给Bean属性赋值(调用set方法)
 * 第三步：初始化Bean(调用Bean的init方法。注意：init方法需要自己处理)
 * 第四步：使用Bean
 * 第五步：销毁Bean(调用Bean的destroy方法。注意：destroy方法需要自己处理)
 *
 * @ClassName: User
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 17:18
 * @Author:XSS
 **/
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private  String name;

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值...");
        this.name = name;
    }


    public User() {
        System.out.println("第一步：无参数构造方法执行...");
    }

    public void initBean(){
        System.out.println("第三步：初始化Bean...");
    }

    public void destroyBean(){
        System.out.println("第五步：销毁Bean...");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("此Bean类的加载器：" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产此Bean的工厂对象：" + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("此Bean的名字：" + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean's afterProperTiesSet执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean's destroy执行");
    }
}
