package icu.shain.bean2;

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
    public Wife(Husband husband, String name) {
        this.husband = husband;
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