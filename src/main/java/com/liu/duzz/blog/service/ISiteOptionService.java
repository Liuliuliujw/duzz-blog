package com.liu.duzz.blog.service;

import com.liu.duzz.blog.entity.SiteOptionEntity;

import java.util.List;
import java.util.Map;

/**
 * 网站配置数据访问服务接口
 *
 * @author llliujw
 */
public interface ISiteOptionService {

    /**
     * 保存一项配置
     *
     * @param entity SiteOptionEntity
     * @return 是否成功
     */
    boolean save(SiteOptionEntity entity);

    /**
     * 获取所有配置
     *
     * @return 所有配置集合
     */
    Map<String, String> map();

    /**
     * 获取所有配置
     *
     * @return 所有配置实体集合
     */
    List<SiteOptionEntity> list();

    /**
     * 根据ID修改配置
     *
     * @param entity SiteOptionEntity
     * @return 是否成功
     */
    boolean update(SiteOptionEntity entity);

    /**
     * 根据ID移除配置
     *
     * @param id 配置项ID
     * @return 是否成功
     */
    boolean removeById(Integer id);

}
