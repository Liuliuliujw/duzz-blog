package com.liu.duzz.blog.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * 用户角色
 *
 * @author llliujw
 */
@Getter
public enum UserRole {

    SYS_ADMIN(1, "系统管理员"), ADMIN(2, "管理员"), USER(5, "用户");

    UserRole(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @EnumValue
    private final Integer code;

    @JsonValue
    private final String name;

}
