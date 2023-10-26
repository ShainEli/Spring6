package bean;

/**
 * @ClassName: People
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/26 14:58
 * @Author:XSS
 **/
public class People {
    private String name;

    // c命名空间是简化构造注入的
    // c命名空间注入方法是基于构造方法的
    public People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
