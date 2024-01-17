package com.example.blog.controller;

import com.example.blog.service.UserService;
import com.example.blog.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtil jetUtil;
    /*
    @PostMapping("/login")
    public Result login(@RequestBody LoginDto lgd) {
        User user = userService.getOne(lgd);
        if (user == null) {
            return Result.error("用户不存在");
        }
        if (!user.getPassword().equals(lgd.getPassword())) {
            return Result.error("密码不正确");
        }

    }*/
}
