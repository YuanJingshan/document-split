package com.xiaoi.document.split.security.user.service.impl;

import com.xiaoi.document.split.security.user.dao.UserDAO;
import com.xiaoi.document.split.security.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service(value = "customerUserService")
public class CustomerUserService implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) {
        log.info("======================  log");
        User user = userDAO.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        String pwd = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(pwd);
        return user;
    }
}
