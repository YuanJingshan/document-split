package com.xiaoi.document.split.platform.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义全局异常处理
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-10
 */
@Slf4j
@ControllerAdvice
public class CustomerGlobalExceptionHandler {

    //TODO 此处可添加自定义的异常处理

    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        log.error("DefaultException Handler Host {} invokes url {} ERROR: {} \n {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage(), e);
        return "redirect:/error";
    }
}