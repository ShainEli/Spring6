package factory.method;

/**
 * 具体产品角色
 * @ClassName: Gun
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 17:16
 * @Author:XSS
 **/
public class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("开枪射击！");
    }
}
