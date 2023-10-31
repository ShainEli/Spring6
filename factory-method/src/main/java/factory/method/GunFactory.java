package factory.method;

/**
 * 具体工厂角色
 * @ClassName: GunFactory
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 17:21
 * @Author:XSS
 **/
public class GunFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Gun();
    }
}
