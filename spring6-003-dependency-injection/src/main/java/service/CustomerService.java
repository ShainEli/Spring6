package service;

import dao.UserDao;
import dao.VipDao;

/**
 * @projectName: Spring6
 * @package: service
 * @className: CustomerService
 * @author: Shain
 * @description: TODO
 * @date: 2023/10/25 22:44
 * @version: 1.0
 **/
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService(UserDao userDao, VipDao vipDao){
        this.userDao = userDao;
        this.vipDao = vipDao;
    }
    public void save(){
        userDao.insert();
        vipDao.insert();
    }
}
