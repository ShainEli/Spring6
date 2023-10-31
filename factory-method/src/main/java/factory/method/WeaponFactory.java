package factory.method;

/**
 * 抽象工厂角色
 * @ClassName: WeaponFactory
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 17:18
 * @Author:XSS
 **/
abstract public class WeaponFactory {
    /**
     * 这个方法不是静态的，是实例方法
     * @return
     */
    public abstract Weapon get();
}
