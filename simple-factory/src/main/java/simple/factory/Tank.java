package simple.factory;

/**
 * 具体产品角色
 * @ClassName: Tank
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 14:08
 * @Author:XSS
 **/
public class Tank extends Weapon{
    @Override
    public void attack(){
        System.out.println("坦克发起攻击！");
    }
}
