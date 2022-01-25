package com.liu.duzz.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.duzz.blog.entity.LogEntity;
import com.liu.duzz.blog.entity.UserEntity;
import com.liu.duzz.blog.enums.UserRole;
import com.liu.duzz.blog.mapper.LogMapper;
import com.liu.duzz.blog.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 测试用
 *
 * @author llliujw
 */
@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final UserMapper userMapper;

    private final LogMapper logMapper;

    @GetMapping
    public String test(Model model){
        UserEntity user1 = new UserEntity();
        user1.setName("zhangSan");
        UserEntity user2 = new UserEntity();
        user2.setName("liSi");
        model.addAttribute("msg","helloWorld");
        model.addAttribute("users", Arrays.asList(user1,user2));
        return "test";
    }

    @GetMapping("/mapper")
    @ResponseBody
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
    @ResponseBody
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
