package com.liu.duzz.blog.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * 文章状态
 *
 * @author llliujw
 */
@Getter
public enum ArticleState {
    PUBLIC(1, "公开"), PRIVATE(2, "私有"),
    EDITING(4, "编辑中"), BANNED(-1, "封禁");

    ArticleState(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @EnumValue
    private final Integer code;

    @JsonValue
    private final String name;

}
