package com.liu.duzz.blog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 *
 * @author llliujw
 */
@Data
@TableName("log")
public class LogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 操作
     */
    private String action;

    /**
     * 描述
     */
    private String description;

    /**
     * 日志写入时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

}
