package com.liu.duzz.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 实体类
 *
 * @author llliujw
 */
@Data
@TableName("options")
public class OptionsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配置项名称
     */
    @TableId(value = "name", type = IdType.AUTO)
    private String name;

    /**
     * 配置值
     */
    private String value;

    /**
     * 描述
     */
    private String description;

}
