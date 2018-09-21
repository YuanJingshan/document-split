package com.xiaoi.document.split.demo.service.impl;

import com.xiaoi.document.split.demo.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PersonServiceImplTest {

    @Autowired
    private PersonService personService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAll() throws Exception {
        log.info("第一次查询");
        personService.getByID("1");
        log.info("第二次查询");
        personService.getByID("1");
    }

}