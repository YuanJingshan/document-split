package com.xiaoi.document.split.platform.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * druid监控视图配置
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-09
 */
@WebServlet(urlPatterns = "/druid/*", initParams = {
        @WebInitParam(name = "allow", value = ""), // IP白名单 (没有配置或者为空，则允许所有访问)
        @WebInitParam(name = "deny", value = "192.168.16.111"), // IP黑名单 (存在共同时，deny优先于allow)
        @WebInitParam(name = "loginUsername", value = "admin"), // 用户名
        @WebInitParam(name = "loginPassword", value = "admin"), // 密码
        @WebInitParam(name = "resetEnable", value = "true") // 禁用HTML页面上的“Reset All”功能
})
public class DruidStatViewServlet extends StatViewServlet {

}
