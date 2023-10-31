package bean;

/**
 * 工厂方法模式中的 具体工厂角色
 * @ClassName: GunFactory
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 14:54
 * @Author:XSS
 **/
public class GunFactory {
    // 工厂方法模式中的具体工厂角色中的方法是：实例方法
    public Gun get(){
        return new Gun();
    }
}
