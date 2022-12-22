package com.burakkutbay.springbootwithjpa.controller;

import com.burakkutbay.springbootwithjpa.entity.User;
import com.burakkutbay.springbootwithjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void kaydet(@RequestBody User user) {
        userService.saveUser(user);
    }
}
