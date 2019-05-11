package fun.dqgs.springboot.dao;

import fun.dqgs.springboot.domain.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @Title IAdminUserMapper
* @Description mybatis操作数据库
* @Author Dream
* @CreateDate 2019/5/10 18:31
* @Version 1.0
*/
@Mapper
public interface IAdminUserMapper {
    @Select("SELECT admin_user.id,admin_user.username,admin_user.`password`,admin_user.time,admin_user.sex,admin_user.address,admin_user.type,admin_user.face,admin_user.email FROM admin_user where username like '%${value}%'")
    public List<AdminUser> findAdminUserByName(String username);

    @Select("SELECT admin_user.id,admin_user.username,admin_user.`password`,admin_user.time,admin_user.sex,admin_user.address,admin_user.type,admin_user.face,admin_user.email FROM admin_user")
    public List<AdminUser> findAllAdminUser();
}
