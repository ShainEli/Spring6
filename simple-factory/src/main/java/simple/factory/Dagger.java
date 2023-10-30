package simple.factory;

/**
 * 具体产品角色
 * @ClassName: Dagger
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 14:12
 * @Author:XSS
 **/
public class Dagger extends Weapon{
    @Override
    public void attack() {
        System.out.println("砍T丫的！");
    }
}
