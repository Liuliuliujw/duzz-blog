package com.liu.duzz.blog.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.liu.duzz.blog.enums.EnableState;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 实体类
 *
 * @author llliujw
 */
@Getter
@Setter
@TableName("link")
public class LinkEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 链接ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * URL
     */
    private String url;

    /**
     * 姓名
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 所属人名称
     */
    private String ownerNickname;

    /**
     * 联系方式
     */
    private String ownerContact;

    /**
     * 状态
     */
    private EnableState status;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


}
