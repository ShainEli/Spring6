package bean;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/26 11:32
 * @Author:XSS
 **/
public class Student {
    private String name;
    private Clazz clazz;

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 使用级联属性赋值，需要使用get方法
    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
