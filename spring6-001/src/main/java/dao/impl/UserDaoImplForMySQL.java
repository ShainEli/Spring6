package dao.impl;
import dao.UserDao;
/**
 * @ClassName: UserDaoImplForMySQL
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 17:29
 * @Author:XSS
 **/
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deletedById() {
        System.out.println("Mysql数据库正在删除用户信息...");
    }
}