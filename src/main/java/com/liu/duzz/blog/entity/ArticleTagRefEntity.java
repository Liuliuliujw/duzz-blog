package com.liu.duzz.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * 实体类
 *
 * @author llliujw
 */
@Getter
@Setter
@TableName("article_tag_ref")
public class ArticleTagRefEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    private Integer articleId;

    /**
     * 标签ID
     */
    private Integer tagId;

}
