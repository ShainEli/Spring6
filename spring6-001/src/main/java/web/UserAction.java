package web;

import service.UserService;
import service.impl.UserServiceImpl;

/**
 * @ClassName: UserAction
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/25 10:38
 * @Author:XSS
 **/
public class UserAction {
    private final UserService userService = new UserServiceImpl();
    public void deleteRequest(){
        userService.deletedUser();
    }
}
