package dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 17:52
 * @Author:XSS
 **/
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void insert(){
        //System.out.println("数据库正在保存用户信息...");
        logger.info("数据库正在保存用户信息...");
    }
}
