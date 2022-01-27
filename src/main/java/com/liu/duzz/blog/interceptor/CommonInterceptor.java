package com.liu.duzz.blog.interceptor;

import com.liu.duzz.blog.service.ISiteOptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Objects;

/**
 * 通用拦截器，添加例如网站信息等公共参数
 *
 * @author llliujw
 */
@Component
@RequiredArgsConstructor
public class CommonInterceptor implements HandlerInterceptor {

    private final ISiteOptionService optionService;

    private static Map<String, String> optionMap;

    @Override
    public  void postHandle(HttpServletRequest request, HttpServletResponse response,
                            Object handler, @Nullable ModelAndView modelAndView) {
        if (Objects.isNull(optionMap))optionMap = optionService.map();
        optionMap.forEach(request::setAttribute);
    }

    public static void refreshOptions(){
        optionMap = null;
    }

}
