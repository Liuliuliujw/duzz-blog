package com.liu.duzz.blog.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liu.duzz.blog.entity.LogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Mapper
 *
 * @author llliujw
 */
@Mapper
public interface LogMapper {

    int insert(LogEntity logEntity);

    <P extends IPage<LogEntity>> P selectPage(P page);
}
