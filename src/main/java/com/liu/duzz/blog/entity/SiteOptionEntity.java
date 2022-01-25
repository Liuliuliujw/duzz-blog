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
@TableName("site_option")
public class SiteOptionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配置项ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 配置项名称
     */
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
