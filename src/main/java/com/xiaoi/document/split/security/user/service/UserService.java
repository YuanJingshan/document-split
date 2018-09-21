package com.xiaoi.document.split.security.user.service;

import com.xiaoi.document.split.security.role.entity.Role;

import java.util.List;

public interface UserService {

    List<Role> getRoleByID(String ID);
}
