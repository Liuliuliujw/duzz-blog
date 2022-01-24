package com.liu.duzz.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.duzz.blog.entity.LogEntity;
import com.liu.duzz.blog.entity.UserEntity;
import com.liu.duzz.blog.enums.UserRole;
import com.liu.duzz.blog.mapper.LogMapper;
import com.liu.duzz.blog.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * 测试用
 *
 * @author llliujw
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final UserMapper userMapper;

    private final LogMapper logMapper;

    @GetMapping("/mapper")
    public UserEntity testMapper(){
        UserEntity user = new UserEntity();
        user.setName("zhangSan");
        user.setPassword("123");
        user.setRole(UserRole.USER);
//        user.setRegisterTime(LocalDateTime.of(2000,11,15,12,30));
        user.setLastLoginTime(LocalDateTime.now());
        userMapper.insert(user);
        return userMapper.selectById(user.getId());
    }

    @GetMapping("/log")
    public Page<LogEntity> testLogMapper(){
        LogEntity log = new LogEntity();
        log.setUserId(7);
        log.setAction("测试日志");
        log.setDescription("测试LogMapper功能");
        log.setCreateTime(LocalDateTime.now());
        logMapper.insert(log);
        Page<LogEntity> page = new Page<>(1,3);
        return logMapper.selectPage(page);
    }


}
