package com.liu.duzz.blog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 实体类
 *
 * @author llliujw
 */
@Data
@TableName("article_info")
public class ArticleInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 作者ID
     */
    private Integer userId;

    /**
     * 分类ID
     */
    private Integer categoryId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章简述
     */
    private String summary;

    /**
     * 文章缩略图
     */
    private String thumbnail;

    /**
     * 浏览数
     */
    private Integer viewCount;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 点赞数
     */
    private Integer likeCount;

    /**
     * 文章状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}
