package factory.method;

/**
 * 具体工厂角色
 * @ClassName: DaggerFactory
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 17:19
 * @Author:XSS
 **/
public class DaggerFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Dagger();
    }
}
