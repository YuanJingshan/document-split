package com.xiaoi.document.split.security.permission.dao;

import com.xiaoi.document.split.security.permission.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PermissionDAO extends JpaRepository<Permission, String>, JpaSpecificationExecutor<Permission> {

}