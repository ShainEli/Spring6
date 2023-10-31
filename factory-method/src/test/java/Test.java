import factory.method.DaggerFactory;
import factory.method.GunFactory;
import factory.method.Weapon;
import factory.method.WeaponFactory;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/30 17:25
 * @Author:XSS
 **/
public class Test {
    public static void main(String[] args){
        WeaponFactory weaponFactory = new DaggerFactory();
        Weapon dagger = weaponFactory.get();
        dagger.attack();

        WeaponFactory weaponFactory1 = new GunFactory();
        Weapon gun = weaponFactory1.get();
        gun.attack();
    }
}
