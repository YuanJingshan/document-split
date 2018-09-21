package com.xiaoi.document.split.security.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/5/24.
 */
@Controller
public class HomeCotroller {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    String home() {
//        return "login";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    String login() {
//        return "login";
//    }

//    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
//    String welcome() {
//        return "welcome";
//    }

//    @RequestMapping(value = "/loginSubmit", method = RequestMethod.GET)
//    String loginSubmit(Model model, User user) {
//        model.addAttribute("user", user);
//        return "index";
//    }

    @RequestMapping("/index")
    public String index(Model model) {
//        Msg msg =  new Msg("测试标题","测试内容","欢迎来到HOME页面,您拥有 ROLE_ADMIN 权限");
//        model.addAttribute("msg", msg);
        return "index";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String hello() {
        return "hello admin";
    }
}
