package com.liu.duzz.blog.common;

import com.liu.duzz.blog.exception.BizException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 全局异常处理
 *
 * @author llliujw
 */
@Slf4j
@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    public static final String PREFIX = "/error/";

    public static final String SITE_TITLE = "siteTitle";

    private final OptionProvider optionProvider;

    @ExceptionHandler(value = BizException.class)
    public String bizExceptionHandler(HttpServletRequest request, Exception e) {
        log.error("发生义务异常:{}", e.getMessage());
        request.setAttribute(SITE_TITLE, optionProvider.get(SITE_TITLE));
        return PREFIX + 500;
    }

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(HttpServletRequest request, Exception e) {
        log.error("发生未知异常:{}", e.getMessage());
        request.setAttribute(SITE_TITLE, optionProvider.get(SITE_TITLE));
        return PREFIX + 500;
    }

}
