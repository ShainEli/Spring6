package bean;

/**
 * @ClassName: Cat
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/26 14:13
 * @Author:XSS
 **/
public class Cat {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
