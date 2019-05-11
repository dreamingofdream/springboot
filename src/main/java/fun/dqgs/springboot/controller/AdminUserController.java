package fun.dqgs.springboot.controller;

import fun.dqgs.springboot.domain.AdminUser;
import fun.dqgs.springboot.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {

    @Autowired
    private IAdminUserService adminUserService;

    @RequestMapping("/findAll")
    public List<AdminUser> findAllAdminUser()
    {
        List<AdminUser> adminUsers = adminUserService.findAllAdminUser();
        return adminUsers;
    }
    @RequestMapping("/findAll/{name}")
    public List<AdminUser> findAdminUserByName(@PathVariable("name") String username)
    {
        List<AdminUser> adminUsers = adminUserService.findAdminUserByName(username);
        return adminUsers;
    }
}
