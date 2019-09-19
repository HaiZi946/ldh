package edu.haizi.springboot_mybatis;

import edu.haizi.springboot_mybatis.domain.User;
import edu.haizi.springboot_mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {

        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }

}
