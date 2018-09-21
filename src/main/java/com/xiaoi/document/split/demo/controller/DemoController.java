package com.xiaoi.document.split.demo.controller;

import com.xiaoi.document.split.demo.entity.Person;
import com.xiaoi.document.split.demo.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Demo
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-10
 */
@Slf4j
@Controller
public class DemoController {
    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping("/person/get")
    public List<Person> getAll() {
        return personService.getAll();
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        log.info("hello log");
        log.debug("hello log");
        log.error("hello log");
        return "hello word";
    }

    @ResponseBody
    @RequestMapping("/ex")
    public String testException() throws Exception {
        throw new Exception();
    }
}
