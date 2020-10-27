package com.taurus.security.demo;

import com.taurus.security.demo.entity.model.User;
import com.taurus.security.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = userService.getUser(1L);
        System.out.println(user);
    }

}
