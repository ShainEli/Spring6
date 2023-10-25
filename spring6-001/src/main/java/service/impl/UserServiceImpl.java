package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImplForMySQL;
import service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 10:41
 * @Author:XSS
 **/
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImplForMySQL();
    @Override
    public void deletedUser() {

        userDao.deletedById();

    }
}
