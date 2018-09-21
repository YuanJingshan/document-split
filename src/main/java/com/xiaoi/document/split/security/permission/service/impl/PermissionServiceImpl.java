package com.xiaoi.document.split.security.permission.service.impl;

import com.xiaoi.document.split.security.permission.dao.PermissionDAO;
import com.xiaoi.document.split.security.permission.entity.Permission;
import com.xiaoi.document.split.security.permission.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/25.
 */
@Service(value = "permissionService")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDAO permissionDAO;

    @Override
    public List<Permission> getAll() {
        return permissionDAO.findAll();
    }
}
