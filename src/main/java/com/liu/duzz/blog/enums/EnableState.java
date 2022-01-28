package com.liu.duzz.blog.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 启用禁用状态枚举
 *
 * @author llliujw
 */
public enum EnableState {
    ENABLE(1,"启用"), DISABLE(0, "禁用");

    EnableState(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @EnumValue
    private final Integer code;

    @JsonValue
    private final String name;
}
