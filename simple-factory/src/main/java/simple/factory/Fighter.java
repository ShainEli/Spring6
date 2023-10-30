package simple.factory;

/**
 * 具体产品角色
 * @ClassName: Fighter
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 14:09
 * @Author:XSS
 **/
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机抛下little boy!");
    }
}
