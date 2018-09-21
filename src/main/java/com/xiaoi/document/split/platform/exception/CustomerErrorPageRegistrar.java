package com.xiaoi.document.split.platform.exception;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * 自定义错误页面处理
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-10
 */
@Component
public class CustomerErrorPageRegistrar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
        ErrorPage e403 = new ErrorPage(HttpStatus.FORBIDDEN, "/error/403.html");
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500.html");
        errorPageRegistry.addErrorPages(e403, e404, e500);
    }
}
