package bean;

/**
 * 班级
 * @ClassName: Clazz
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/26 11:31
 * @Author:XSS
 **/
public class Clazz {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
