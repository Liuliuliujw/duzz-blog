package com.liu.duzz.blog.config;

import com.liu.duzz.blog.common.CommonInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * MVC配置
 *
 * @author llliujw
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Resource(name = "commonInterceptor", type = CommonInterceptor.class)
    private CommonInterceptor commonInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/static/**");
    }
}
