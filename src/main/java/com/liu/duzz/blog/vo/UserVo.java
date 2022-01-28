package com.liu.duzz.blog.vo;

import com.liu.duzz.blog.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

/**
 * VO
 *
 * @author llliujw
 */
@Getter
@Setter
public class UserVo {

    /**
     * 用户名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 角色
     */
    private UserRole role;
}
