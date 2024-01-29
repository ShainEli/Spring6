package icu.shain.bean;

/**
 * @description: 妻子类
 * @param: null
 * @return:
 * @author: shain
 * @since: 2024/1/29 18:03
 */
public class Wife {
    private Husband husband;
    private String name;

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "husband=" + husband.getName() +
                ", name='" + name + '\'' +
                '}';
    }
}