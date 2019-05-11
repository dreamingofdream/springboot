package fun.dqgs.springboot.dao;

import fun.dqgs.springboot.domain.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @Title IAdminUserDao
* @Description 用户持久层接口
* @Author Dream
* @CreateDate 2019/5/10 14:36
* @Version 1.0
*/
@Repository("adminUserDao")
public interface IAdminUserDao extends JpaRepository<AdminUser,Integer> {
}
