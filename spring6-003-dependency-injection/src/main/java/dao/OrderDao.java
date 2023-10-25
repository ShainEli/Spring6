package dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: Spring6
 * @package: dao
 * @className: OrderDao
 * @author: Shain
 * @description: TODO
 * @date: 2023/10/25 23:09
 * @version: 1.0
 **/
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);
    public void generate(){
        logger.info("订单正在生成...");
    }
}
