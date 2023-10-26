package bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/26 13:52
 * @Author:XSS
 **/
public class Person {
    private List<String> names;
    private Set<String> address;
    private Map<Integer, String> phonesNumber;

    //注入属性类对象
    //Properties本质上是Map集合
    //Properties的父类Hashtable，Hashtable实现了Map接口
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public void setPhonesNumber(Map<Integer, String> phonesNumber) {
        this.phonesNumber = phonesNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", address=" + address +
                ", phonesNumber=" + phonesNumber +
                ", properties=" + properties +
                '}';
    }
}
