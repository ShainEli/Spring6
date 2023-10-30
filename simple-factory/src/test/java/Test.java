import simple.factory.Weapon;
import simple.factory.WeaponFactory;

/**
 * 这是客户端程序
 * @ClassName: Test
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 14:22
 * @Author:XSS
 **/
public class Test {
    public static void main(String[] args){
        // 对于客户端来说，不需要关心产品的生产过程，只需向工厂索要即可
        // 简单工厂模式达到了职责分离。
        // 工厂类负责生产

        // 需要坦克
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        // 需要匕首
        Weapon dagger = WeaponFactory.get("DAGGER");
        dagger.attack();
        // 需要战斗机
        Weapon fighter = WeaponFactory.get("FIGHTER");
        fighter.attack();
    }
}
