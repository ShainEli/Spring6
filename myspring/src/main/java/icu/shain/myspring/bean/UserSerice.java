package icu.shain.myspring.bean;

public class UserSerice {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        userDao.insert();
    }
}