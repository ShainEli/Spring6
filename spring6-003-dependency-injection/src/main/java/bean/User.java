package bean;

/**
 * @projectName: Spring6
 * @package: bean
 * @className: User
 * @author: Shain
 * @description: TODO
 * @date: 2023/10/25 23:27
 * @version: 1.0
 **/
public class User {
    private String username;
    private String password;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString(){
        return "User{" + "username='" + username + '\'' + ", password='" + password + '\''+ ", age="+ age + '}';
    }
}
