package com.taurus.security.demo.controller;

import com.taurus.security.demo.entity.model.User;
import com.taurus.security.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 充分了解一下，@PathVariable @RequestParam这两个注解的含义，以及使用场景和方式
     */
    /**
     * @param id
     * @return
     * @PathVariable 的时候，更符合Restful的设计风格，此时我们的url为：http://localhost:8080/user/get/1
     */
    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") long id) {
        User user = userService.getUser(id);
        return user;
    }

    /**
     * @param id
     * @return
     * @RequestParam 此时我们的访问url为：http://localhost:8080/user/get?id=1
     */
    @GetMapping("/get")
    public User getUser2(@RequestParam("id") long id) {
        User user = userService.getUser(id);
        return user;
    }

}
