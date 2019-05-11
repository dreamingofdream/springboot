package fun.dqgs.springboot;

import fun.dqgs.springboot.domain.AdminUser;
import fun.dqgs.springboot.service.IAdminUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    private IAdminUserService adminUserService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void findAllAdminUser()
    {
        List<AdminUser> list = adminUserService.findAllAdminUser();
        System.out.println(list);
    }

    @Resource
    private Environment env;

    @Test
    public void testReadSpringBootConfig()
    {
        System.out.println(env.getProperty("spring.jpa.database"));
    }

}
