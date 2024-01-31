package icu.shain.bean2;

/**
 * @description: 丈夫类
 * @param: null
 * @return:
 * @author: shain
 * @since: 2024/1/29 18:02
 */
public class Husband {
    private String name;
    private Wife wife;

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}