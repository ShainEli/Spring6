package bean;

/**
 * 简单工厂模式中的工厂类角色
 * @ClassName: StarFactory
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 14:42
 * @Author:XSS
 **/
public class StarFactory {
    // 工厂类中有一个静态方法
    public static Star get(){
        // 这个Star对象最终创建时，还是我们负责new的对象
        return new Star();
    }
}
