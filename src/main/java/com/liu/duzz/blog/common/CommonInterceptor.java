package com.liu.duzz.blog.common;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 通用拦截器，添加例如网站信息等公共参数
 *
 * @author llliujw
 */
@Component
@RequiredArgsConstructor
public class CommonInterceptor implements HandlerInterceptor {

    private final OptionProvider optionProvider;

    /**
     * 在Controller方法调用后，向响应数据中添加通用数据
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, @Nullable ModelAndView modelAndView) {
        Map<String, String> optionMap = optionProvider.getMap();
        optionMap.forEach(request::setAttribute);
    }
}
