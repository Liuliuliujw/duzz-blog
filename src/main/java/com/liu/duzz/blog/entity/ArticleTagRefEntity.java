package com.liu.duzz.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 *
 * @author llliujw
 */
@Data
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
