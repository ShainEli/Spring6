package bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: PersonFactoryBean
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 15:24
 * @Author:XSS
 **/
public class PersonFactoryBean implements FactoryBean<Person> {
    // 通过工厂bean这个特殊的Bean可以获取一个普通的Bean

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
    // 这个方法在接口中有默认实现
    // 默认返回true,表示单例的；多例为false
    @Override
    public boolean isSingleton() {
        return true;
    }
}
