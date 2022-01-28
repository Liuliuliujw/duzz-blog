package com.liu.duzz.blog.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.liu.duzz.blog.entity.SiteOptionEntity;
import com.liu.duzz.blog.common.OptionProvider;
import com.liu.duzz.blog.mapper.SiteOptionMapper;
import com.liu.duzz.blog.service.ISiteOptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 网站配置数据访问服务
 *
 * @author llliujw
 */
@Service
@RequiredArgsConstructor
public class SiteOptionServiceImpl implements ISiteOptionService {

    private final SiteOptionMapper optionMapper;

    @Override
    public boolean save(SiteOptionEntity entity) {
        if (optionMapper.insert(entity) == 1) {
            OptionProvider.refreshOptions();
            return true;
        }
        return false;
    }

    @Override
    public Map<String, String> map() {
        return optionMapper.selectList(Wrappers.emptyWrapper())
                .stream().collect(Collectors.toMap(SiteOptionEntity::getName, SiteOptionEntity::getValue));
    }

    @Override
    public List<SiteOptionEntity> list(){
        return optionMapper.selectList(Wrappers.emptyWrapper());
    }

    @Override
    public boolean update(SiteOptionEntity entity) {
        if (optionMapper.updateById(entity) == 1) {
            OptionProvider.refreshOptions();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeById(Integer id) {
        if (optionMapper.deleteById(id) == 1) {
            OptionProvider.refreshOptions();
            return true;
        }
        return false;
    }
}
