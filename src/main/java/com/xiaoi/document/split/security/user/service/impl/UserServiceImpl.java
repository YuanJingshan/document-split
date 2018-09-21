package com.xiaoi.document.split.security.user.service.impl;

import com.xiaoi.document.split.security.role.entity.Role;
import com.xiaoi.document.split.security.user.dao.UserDAO;
import com.xiaoi.document.split.security.user.entity.User;
import com.xiaoi.document.split.security.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public List<Role> getRoleByID(String ID) {
        Optional<User> optional = userDAO.findById(ID);
        User user = optional.orElse(null);
        return user.getRoles();
    }
}