package service;

import dao.UserDao;
import dao.VipDao;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 17:56
 * @Author:XSS
 **/
public class UserService {
    private UserDao userDao;
    private VipDao vipDao;
    public void setVipDao(VipDao vipDao){
        this.vipDao = vipDao;
    }

    // set注入必须提供一个set方法
    // Spring容器会调用set方法来进行赋值

    // IDEA自动生成，符合javabean规范
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
        userDao.insert();
        vipDao.insert();
    }
}
