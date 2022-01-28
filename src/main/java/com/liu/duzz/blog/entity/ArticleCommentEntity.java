package com.liu.duzz.blog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * 实体类
 *
 * @author llliujw
 */
@Getter
@Setter
@TableName("article_comment")
public class ArticleCommentEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 上级评论ID
     */
    private Integer parentId;

    /**
     * 文章ID
     */
    private Integer articleId;

    /**
     * 评论人ID
     */
    private Integer userId;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

}
