package fun.dqgs.springboot.service;

import fun.dqgs.springboot.domain.AdminUser;

import java.util.List;

/**
* @Title IAdminUserService
* @Description 用户的业务层接口
* @Author Dream
* @CreateDate 2019/5/10 14:31
* @Version 1.0
*/

public interface IAdminUserService {
    /**
     * 查询所有用户
     * @return
     */
    List<AdminUser> findAllAdminUser();

    /**
     * 根据用户名查询
     */
    List<AdminUser> findAdminUserByName(String username);
}
