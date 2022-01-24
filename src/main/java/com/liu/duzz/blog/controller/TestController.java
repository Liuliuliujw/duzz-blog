package com.liu.duzz.blog.controller;

import com.liu.duzz.blog.entity.UserEntity;
import com.liu.duzz.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * 测试用
 *
 * @author: llliujw
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/mapper")
    public UserEntity testMapper(){
        UserEntity user = new UserEntity();
        user.setName("zhangSan");
        user.setPassword("123");
        user.setRole(2);
//        user.setRegisterTime(LocalDateTime.of(2000,11,15,12,30));
        user.setLastLoginTime(LocalDateTime.now());
        userMapper.insert(user);
        return userMapper.selectById(user.getId());
    }


}
