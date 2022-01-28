package com.liu.duzz.blog.common;

import com.liu.duzz.blog.service.ISiteOptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

/**
 * 网站配置提供类
 *
 * @author llliujw
 */
@Component
@RequiredArgsConstructor
public class OptionProvider {

    private final ISiteOptionService optionService;

    private static Map<String, String> optionMap;

    /**
     * 刷新网站配置的缓存
     */
    public static void refreshOptions() {
        optionMap = null;
    }

    /**
     * 获取网站配置
     *
     * @param key key
     * @return optionValue
     */
    public String get(String key) {
        if (Objects.isNull(optionMap)) optionMap = optionService.map();
        return optionMap.get(key);
    }

    /**
     * 获取所有网站配置
     *
     * @return optionMap
     */
    public Map<String, String> getMap() {
        return optionMap;
    }

}
