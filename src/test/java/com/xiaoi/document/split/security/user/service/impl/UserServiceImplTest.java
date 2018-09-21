package com.xiaoi.document.split.security.user.service.impl;

import com.xiaoi.document.split.security.role.entity.Role;
import com.xiaoi.document.split.security.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        log.info("setup...");
    }

    @After
    public void tearDown() throws Exception {
        log.info("tearDown...");
    }

    @Test
    public void testGetRoleByID() {
        log.info("roles: \n\n");
        List<Role> roles = userService.getRoleByID("1");
        for (Role role : roles) {
            log.info(role.toString());
        }
    }

}