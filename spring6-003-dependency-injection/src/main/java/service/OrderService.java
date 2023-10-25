package service;

import dao.OrderDao;

/**
 * @projectName: Spring6
 * @package: service
 * @className: OrderService
 * @author: Shain
 * @description: TODO
 * @date: 2023/10/25 23:11
 * @version: 1.0
 **/
public class OrderService {
    private OrderDao orderDao;

    //
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public  void generate(){
        orderDao.generate();
    }
}
