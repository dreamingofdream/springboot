package fun.dqgs.springboot.service.impl;

import fun.dqgs.springboot.dao.IAdminUserDao;
import fun.dqgs.springboot.dao.IAdminUserMapper;
import fun.dqgs.springboot.domain.AdminUser;
import fun.dqgs.springboot.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
/**
* @Title AdminUserServiceImpl
* @Description 用户业务层实现类
* @Author Dream
* @CreateDate 2019/5/10 14:34
* @Version 1.0
*/
@Service("adminUserService")
public class AdminUserServiceImpl implements IAdminUserService {
    @Autowired
    private IAdminUserDao adminUserDao;
   @Autowired
   private IAdminUserMapper adminUserMapper;

    @Override
   // @CacheEvict(value = "findAllAdminUser",key = "'adminUser.findAlAdminUserl'")
    //清除缓存
   @Cacheable(value = "findAllAdminUser",key = "'adminUser.findAlAdminUserl'")
    //表示当前方法使用缓存，并存入redis数据库中
    //value属性：表示存入redis数据库的key
    //key属性：用于指定方法执行返回值的key，该属性是spring用的，不写也有默认值
    public List<AdminUser> findAllAdminUser() {
        System.out.println("缓存测试");
        return adminUserMapper.findAllAdminUser();
    }

    @Override
    public List<AdminUser> findAdminUserByName(String username) {
        return adminUserMapper.findAdminUserByName(username);
    }
}
