package bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateFactoryBean
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 15:51
 * @Author:XSS
 **/
public class DateFactoryBean implements FactoryBean<Date> {

    // DateFactoryBean这个工厂Bean协助Spring创建这个普通Bean:Date

    private final String strDate;

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(strDate);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
